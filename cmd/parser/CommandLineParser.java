package cmd.parser;

import java.util.Map;

/**
 * The CommandLineParser class provides methods to parse command-line arguments
 * and generate help messages for specified options.
 * 
 * Usage example:
 * <pre>
 * {@code
 * OptionBuilder helpBuilder = new OptionBuilder(OptionType.NO_ARGUMENT, "h");
 * Option helpOption = helpBuilder
 *     .setOptionDescription("Displays help information")
 *     .setLongArgumentName("help")
 *     .build();
 * 
 * OptionBuilder verboseBuilder = new OptionBuilder(OptionType.NO_ARGUMENT, "v");
 * Option verboseOption = verboseBuilder
 *     .setOptionDescription("Enables verbose mode")
 *     .setLongArgumentName("verbose")
 *     .build();
 * 
 * OptionBuilder outputBuilder = new OptionBuilder(OptionType.REQUIRES_ARGUMENT, "o");
 * Option outputOption = outputBuilder
 *     .setOptionDescription("Specifies the output file")
 *     .setLongArgumentName("output")
 *     .build();
 * 
 * OptionBuilder filesBuilder = new OptionBuilder(OptionType.REQUIRES_MULTIPLE_ARGUMENTS, "f");
 * Option filesOption = filesBuilder
 *     .setOptionDescription("Specifies multiple files")
 *     .setLongArgumentName("files")
 *     .build();
 * 
 * OptionBuilder modeBuilder = new OptionBuilder(OptionType.REQUIRES_ARGUMENT, "m");
 * Option modeOption = modeBuilder
 *     .setOptionDescription("Specifies the mode")
 *     .setLongArgumentName("mode")
 *     .setPossibleValues(new String[]{"auto", "manual"})
 *     .build();
 * 
 * Option[] options = {helpOption, verboseOption, outputOption, filesOption, modeOption};
 * 
 * // Parsing command-line arguments
 * String[] args = {"-h", "-o", "output.txt", "-m", "auto"};
 * HashMap<String, Option> parsedOptions = CommandLineParser.parse(args, options);
 * 
 * // Generating help message
 * String helpMessage = CommandLineParser.getHelp(options);
 * System.out.println(helpMessage);
 * }
 * </pre>
 */
public class CommandLineParser {

    /**
     * Parses the command-line arguments and returns a map of options mapped to the long argument version.
     * 
     * @param args the command-line arguments
     * @param options the options to parse
     * @return a map of the options present in the command line arguments mapped to the long argument version
     * @throws IllegalArgumentException if one of the options with a required argument does not have an argument
     * @throws IllegalArgumentException if one of the options with no argument receives an argument
     * @throws IllegalArgumentException if an option appears more than once
     * @throws IllegalArgumentException if an option is not recognized
     */
    public static Map<String, Option> parse(String[] args, Option[] options) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the help message as a string for the specified options.
     * 
     * The help message is formatted as follows:
     * <short argument name>, <long argument name> <argument description> (valid values: <possible values>)
     * 
     * Example:
     * <pre>
     * {@code
     * OptionBuilder helpBuilder = new OptionBuilder(OptionType.NO_ARGUMENT, "h");
     * Option helpOption = helpBuilder
     *     .setOptionDescription("Displays help information")
     *     .setLongArgumentName("help")
     *     .build();
     * 
     * OptionBuilder verboseBuilder = new OptionBuilder(OptionType.NO_ARGUMENT, "v");
     * Option verboseOption = verboseBuilder
     *     .setOptionDescription("Enables verbose mode")
     *     .setLongArgumentName("verbose")
     *     .build();
     * 
     * OptionBuilder outputBuilder = new OptionBuilder(OptionType.REQUIRES_ARGUMENT, "o");
     * Option outputOption = outputBuilder
     *     .setOptionDescription("Specifies the output file")
     *     .setLongArgumentName("output")
     *     .build();
     * 
     * OptionBuilder filesBuilder = new OptionBuilder(OptionType.REQUIRES_MULTIPLE_ARGUMENTS, "f");
     * Option filesOption = filesBuilder
     *     .setOptionDescription("Specifies multiple files")
     *     .setLongArgumentName("files")
     *     .build();
     * 
     * OptionBuilder modeBuilder = new OptionBuilder(OptionType.REQUIRES_ARGUMENT, "m");
     * Option modeOption = modeBuilder
     *     .setOptionDescription("Specifies the mode")
     *     .setLongArgumentName("mode")
     *     .setPossibleValues(new String[]{"auto", "manual"})
     *     .build();
     * 
     * Option[] options = {helpOption, verboseOption, outputOption, filesOption, modeOption};
     * 
     * String helpMessage = CommandLineParser.getHelp(options);
     * System.out.println(helpMessage);
     * }
     * </pre>
     * 
     * Output: 
     * <pre>
     * -h, --help                : Displays help information
     * -v, --verbose             : Enables verbose mode
     * -o, --output <argument>   : Specifies the output file
     * -f, --files <arg1> <arg2> : Specifies multiple files
     * -m, --mode <argument>     : Specifies the mode (valid values: auto, manual)
     * </pre>
     * 
     * @param options the options to generate the help message for
     * @return the help message for the specified options
     */
    public static String getHelp(Option[] options) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
