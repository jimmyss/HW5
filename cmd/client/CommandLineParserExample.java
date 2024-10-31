import cmd.parser.CommandLineParser;
import cmd.parser.Option;
import cmd.parser.OptionType;
import cmd.parser.CommandLineParser.ParsingOrder;

import java.util.List;
import java.util.Optional;

public class CommandLineParserExample {
    public static void main(String[] args) {
        // Simulated command-line arguments
        String[] commandArgs = {"-v", "--output", "output.txt", "inputfile.txt", "-h"};

        // Define command-line options available for parsing
        Option[] options = {
            new Option(OptionType.NO_ARGUMENT, 'v', "verbose"),
            new Option(OptionType.REQUIRES_ARGUMENT, 'o', "output"),
            new Option(OptionType.NO_ARGUMENT, 'h', "help")
        };

        // 1. Parsing with ORDER_OPTIONS_FIRST (GNU-like parsing)
        System.out.println("Parsing with ORDER_OPTIONS_FIRST (GNU-like behavior):");
        List<Option> parsedOptionsGnu = CommandLineParser.parseArguments(commandArgs, options, ParsingOrder.ORDER_OPTIONS_FIRST);
        displayParsedOptions(parsedOptionsGnu);

        // 2. Parsing with STOP_PARSING_AT_NON_OPTION (POSIX-like parsing)
        System.out.println("\nParsing with STOP_PARSING_AT_NON_OPTION (POSIX-like behavior):");
        List<Option> parsedOptionsPosix = CommandLineParser.parseArguments(commandArgs, options, ParsingOrder.STOP_PARSING_AT_NON_OPTION);
        displayParsedOptions(parsedOptionsPosix);

        // 3. Parsing with KEEP_IN_PLACE (original order)
        System.out.println("\nParsing with KEEP_IN_PLACE (Original order of arguments preserved):");
        List<Option> parsedOptionsKeepInPlace = CommandLineParser.parseArguments(commandArgs, options, ParsingOrder.KEEP_IN_PLACE);
        displayParsedOptions(parsedOptionsKeepInPlace);
    }

    /**
     * Helper method to display the parsed options.
     * @param parsedOptions The list of parsed options.
     */
    private static void displayParsedOptions(List<Option> parsedOptions) {
        for (Option option : parsedOptions) {
            if ("non-option".equals(option.getLongArgumentName())) {
                System.out.println("Non-option argument: " + option.getValue().orElse("<no value>"));
            } else {
                System.out.println("Option: " + option.getLongArgumentName());
                Optional<String> value = option.getValue();
                value.ifPresent(argValue -> System.out.println("  Argument: " + argValue));
            }
        }
    }
}
