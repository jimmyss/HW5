package cmd.parser;

import java.util.List;

/**
 * The CommandLineParser class provides methods to parse command-line arguments
 * and generate help messages for specified options.
 * 
 * Usage example:
 * <pre>
 
 * </pre>
 */
public class CommandLineParser {

   /**
     * Parses the command-line arguments and returns a list of the present options in the args array.
     * The options are returned in the same order of appearance, except that any unrecognized options and non options
     * are pushed to the end of the list, preserving their original order.
     * 
     * This method uses standard GNU-like parsing, where long options must be specified with '--' 
     * (e.g., `--option`), and short options are specified with a single '-' (e.g., `-o`). 
     * 
     * This method respects the `--` end-of-options marker. When `--` is encountered, all subsequent arguments
     * are treated as non-option arguments, regardless of whether they start with a dash.
     * 
     * All non-option arguments are listed as options with a shortname of '\0' and a longname of "non-option".
     * 
     * @param args the command-line arguments
     * @param options the options to parse, each specified as an {@link Option} object
     * @return an iterator over the {@link Option} objects present in the command-line arguments, 
     * mapped to their long argument version
     * @throws IllegalArgumentException if an option has duplicate short or long argument names in the options array
     * @throws IllegalArgumentException if one of the options with a required argument does not have an argument
     * @throws IllegalArgumentException if one of the options with no argument receives an argument
     * 
     * <h2>Example:</h2>
     * <pre>
     * Option[] options = {
     *     new Option(OptionType.NO_ARGUMENT, 'v', "verbose"),
     *     new Option(OptionType.REQUIRED_ARGUMENT, 'o', "output"),
     *     new Option(OptionType.NO_ARGUMENT, 'h', "help")
     * };
     * 
     * String[] args = {"-v", "--output", "file.txt", "-h"};
     * 
     * Iterator<Option> result = parseArguments(args, options);
     * // Resulting list of options (in order):
     * // - verbose
     * // - output (argument: "file.txt")
     * // - help
     * </pre>
     * 
     * <p>In the example, `-v` maps to `verbose`, `--output` with `file.txt` is correctly identified,
     * and `-h` maps to `help`.</p>
     */
    public static List<Option> parseArguments(String[] args, Option[] options) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Parses the command-line arguments in a more flexible way, supporting both long options with a single 
     * dash or double dash. This method returns a list of the present options in the args array. 
     * The options are returned in the same order of appearance, except that any unrecognized options 
     * are pushed to the end of the list, preserving their original order.
     * 
     * This method allows long options to be specified with either a single '-' or '--'.
     * For example, both `-help` and `--help` are treated as the long option "help".
     * 
     * This method respects the `--` end-of-options marker. When `--` is encountered, all subsequent arguments
     * are treated as non-option arguments, regardless of whether they start with a dash.
     * 
     * All non-option arguments are listed as options with a shortname of '\0' and a longname of "non-option".
     * 
     * @param args the command-line arguments
     * @param options the options to parse, each specified as an {@link Option} object
     * @return an iterator over the {@link Option} objects present in the command-line arguments, 
     * mapped to their long argument version
     * @throws IllegalArgumentException if an option has duplicate short or long argument names in the options array
     * @throws IllegalArgumentException if one of the options with a required argument does not have an argument
     * @throws IllegalArgumentException if one of the options with no argument receives an argument
     * 
     * <h2>Example:</h2>
     * <pre>
     * Option[] options = {
     *     new Option(OptionType.NO_ARGUMENT, 'v', "verbose"),
     *     new Option(OptionType.REQUIRED_ARGUMENT, 'o', "output"),
     *     new Option(OptionType.NO_ARGUMENT, 'h', "help")
     * };
     * 
     * String[] args = {"-v", "-output", "file.txt", "-help"};
     * 
     * Iterator<Option> result = parseArgumentsLooseDash(args, options);
     * // Resulting list of options (in order):
     * // - verbose
     * // - output (argument: "file.txt")
     * // - help
     * </pre>
     * 
     * <p>In the example, `-v` maps to `verbose`, `-output` with `file.txt` is correctly identified, and `-help` maps to `help`.</p>
     * <p>This more flexible approach allows users to use both a single or double dash to specify long options.</p>
     */
    public static List<Option> parseArgumentsLooseDash(String[] args, Option[] options) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Parses the command-line arguments and returns a list of the present options in the args array.
     * The options are returned according to the specified {@link ParsingOrder}.
     * 
     * This method uses standard GNU-like parsing, where long options must be specified with '--' 
     * (e.g., `--option`), and short options are specified with a single '-' (e.g., `-o`). 
     * 
     * This method respects the `--` end-of-options marker. When `--` is encountered, all subsequent arguments
     * are treated as non-option arguments, regardless of whether they start with a dash.
     * 
     * All non-option arguments are listed as options with a shortname of '\0' and a longname of "non-option".
     * 
     * @param args the command-line arguments
     * @param options the options to parse, each specified as an {@link Option} object
     * @param order the {@link ParsingOrder} specifying how to handle non-option arguments
     * @return a list of the {@link Option} objects present in the command-line arguments, 
     * mapped to their long argument version
     * @throws IllegalArgumentException if an option has duplicate short or long argument names in the options array
     * @throws IllegalArgumentException if one of the options with a required argument does not have an argument
     * @throws IllegalArgumentException if one of the options with no argument receives an argument
     * 
     * <h2>Example:</h2>
     * <pre>
     * Option[] options = {
     *     new Option(OptionType.NO_ARGUMENT, 'v', "verbose"),
     *     new Option(OptionType.REQUIRED_ARGUMENT, 'o', "output"),
     *     new Option(OptionType.NO_ARGUMENT, 'h', "help")
     * };
     * 
     * String[] args = {"-v", "--output", "file.txt", "nonoption", -h"};
     * 
     * List<Option> result = parseArguments(args, options, ParsingOrder.KEEP_IN_PLACE);
     * // Resulting list of options (in original order):
     * // - verbose
     * // - output (argument: "file.txt")
     * // - "nonoption"
     * // - help
     * </pre>
     * 
     * <p>In the example, the options are parsed in their original order as specified by {@code ParsingOrder.KEEP_IN_PLACE}.</p>
     */
    public static List<Option> parseArguments(String[] args, Option[] options, ParsingOrder order) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Parses the command-line arguments in a more flexible way, supporting both long options with a single 
     * dash or double dash. The options are returned according to the specified {@link ParsingOrder}.
     * 
     * This method allows long options to be specified with either a single '-' or '--'.
     * For example, both `-help` and `--help` are treated as the long option "help".
     * 
     * This method respects the `--` end-of-options marker. When `--` is encountered, all subsequent arguments
     * are treated as non-option arguments, regardless of whether they start with a dash.
     * 
     * All non-option arguments are listed as options with a shortname of '\0' and a longname of "non-option".
     * 
     * @param args the command-line arguments
     * @param options the options to parse, each specified as an {@link Option} object
     * @param order the {@link ParsingOrder} specifying how to handle non-option arguments
     * @return a list of the {@link Option} objects present in the command-line arguments, 
     * mapped to their long argument version
     * @throws IllegalArgumentException if an option has duplicate short or long argument names in the options array
     * @throws IllegalArgumentException if one of the options with a required argument does not have an argument
     * @throws IllegalArgumentException if one of the options with no argument receives an argument
     * 
     * <h2>Example:</h2>
     * <pre>
     * Option[] options = {
     *     new Option(OptionType.NO_ARGUMENT, 'v', "verbose"),
     *     new Option(OptionType.REQUIRED_ARGUMENT, 'o', "output"),
     *     new Option(OptionType.NO_ARGUMENT, 'h', "help")
     * };
     * 
     * String[] args = {"-v", "-output", "file.txt", "-help"};
     * 
     * List<Option> result = parseArgumentsLooseDash(args, options, ParsingOrder.ORDER_OPTIONS_FIRST);
     * // Resulting list of options (in order):
     * // - verbose
     * // - output (argument: "file.txt")
     * // - help
     * </pre>
     * 
     * <p>In the example, options are grouped first as specified by {@code ParsingOrder.ORDER_OPTIONS_FIRST}.</p>
     */
    public static List<Option> parseArgumentsLooseDash(String[] args, Option[] options, ParsingOrder order) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    /**
     * The {@code ParsingOrder} enum defines the different strategies for handling and ordering
     * non-option arguments when parsing command-line arguments.
     *
     * <h3>Available Modes:</h3>
     * <ul>
     *   <li>{@link #ORDER_OPTIONS_FIRST} - Equivalent to GNU-like parsing where options are grouped first, and non-option arguments are moved to the end.</li>
     *   <li>{@link #STOP_PARSING_AT_NON_OPTION} - Equivalent to POSIX-like parsing where option parsing stops at the first non-option argument.</li>
     *   <li>{@link #KEEP_IN_PLACE} - Keeps options and non-option arguments in the original order of appearance, without any reordering.</li>
     * </ul>
     */
    public enum ParsingOrder {

        /**
         * Orders recognized options first, similar to GNU-like parsing.
         * <p>
         * In this mode:
         * <ul>
         *   <li>All recognized options are grouped first.</li>
         *   <li>Non-option arguments are moved to the end of the list, preserving their original order.</li>
         * </ul>
         * This mode allows options to be given in any order, similar to the behavior found in GNU tools.
         */
        ORDER_OPTIONS_FIRST,

        /**
         * Stops parsing at the first non-option argument, similar to POSIX-like parsing.
         * <p>
         * In this mode:
         * <ul>
         *   <li>Option parsing stops as soon as a non-option argument is encountered.</li>
         *   <li>All subsequent arguments, even if they look like options, are treated as non-option arguments.</li>
         *   <li>The order of all arguments is preserved exactly as they appear.</li>
         * </ul>
         * This mode is stricter and follows the POSIX conventions for command-line argument parsing.
         */
        STOP_PARSING_AT_NON_OPTION,

        /**
         * Keeps all options and non-option arguments in their original order of appearance.
         * <p>
         * In this mode:
         * <ul>
         *   <li>All options and non-option arguments are kept in their original order.</li>
         *   <li>Non-options are treated as they appear, without moving them to the end of the list.</li>
         * </ul>
         * This mode allows the arguments to be processed in exactly the order they were provided by the user.
         * It provides a more predictable argument order, suitable for cases where the sequence of options and 
         * non-options is important.
         */
        KEEP_IN_PLACE
    }

}
