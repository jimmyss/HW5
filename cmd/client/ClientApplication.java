import cmd.parser.CommandLineParser;
import cmd.parser.Option;
import cmd.parser.OptionBuilder;
import cmd.parser.OptionType;

import java.util.HashMap;

public class ClientApplication {

    public static void main(String[] args) {
        // Step 1: Define options using OptionBuilder
        Option helpOption = new OptionBuilder(OptionType.NO_ARGUMENT, "h")
                .setOptionDescription("Displays help information")
                .setLongArgumentName("help")
                .build();

        Option verboseOption = new OptionBuilder(OptionType.NO_ARGUMENT, "v")
                .setOptionDescription("Enables verbose mode")
                .setLongArgumentName("verbose")
                .build();

        Option outputOption = new OptionBuilder(OptionType.REQUIRES_ONE_ARGUMENT, "o")
                .setOptionDescription("Specifies the output file")
                .setLongArgumentName("output")
                .build();

        Option filesOption = new OptionBuilder(OptionType.REQUIRES_ONE_OR_MORE_ARGUMENTS, "f")
                .setOptionDescription("Specifies multiple files")
                .setLongArgumentName("files")
                .build();

        Option modeOption = new OptionBuilder(OptionType.REQUIRES_ONE_ARGUMENT, "m")
                .setOptionDescription("Specifies the mode")
                .setLongArgumentName("mode")
                .setPossibleValues(new String[]{"auto", "manual"})
                .build();

        // Step 2: Create an array of all options
        Option[] options = {helpOption, verboseOption, outputOption, filesOption, modeOption};

        try {
            // Step 3: Parse command-line arguments
            HashMap<String, Option> parsedOptions = CommandLineParser.parse(args, options);

            // Step 4: Handle the help option first, if present
            if (parsedOptions.containsKey("help")) {
                String helpMessage = CommandLineParser.getHelp(options);
                System.out.println(helpMessage);
                return; // Exit after displaying help
            }

            // Step 5: Execute actions based on the provided options
            if (parsedOptions.containsKey("verbose")) {
                System.out.println("Verbose mode enabled.");
            }

            if (parsedOptions.containsKey("output")) {
                Option outputOpt = parsedOptions.get("output");
                System.out.println("Output file specified: " + outputOpt.getValues()[0]);
            }

            if (parsedOptions.containsKey("files")) {
                Option filesOpt = parsedOptions.get("files");
                System.out.println("Files specified: " + String.join(", ", filesOpt.getValues()));
            }

            if (parsedOptions.containsKey("mode")) {
                Option modeOpt = parsedOptions.get("mode");
                System.out.println("Mode specified: " + modeOpt.getValues()[0]);
            }

        } catch (IllegalArgumentException e) {
            // Gracefully handle parsing errors and print help
            System.err.println("Error: " + e.getMessage());
            String helpMessage = CommandLineParser.getHelp(options);
            System.out.println(helpMessage);
        }
    }
}

