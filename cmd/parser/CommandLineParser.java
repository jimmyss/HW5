package cmd.parser;

import java.util.Iterator;

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
     * The options are returned in the same order of appearance, except that any unrecognized options 
     * are pushed to the end of the list, preserving their original order.
     * 
     * This method uses standard GNU-like parsing, where long options must be specified with '--' 
     * (e.g., `--option`), and short options are specified with a single '-' (e.g., `-o`).
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
    public static Iterator<Option> parseArguments(String[] args, Option[] options) throws IllegalArgumentException {
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
    public static Iterator<Option> parseArgumentsLooseDash(String[] args, Option[] options) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
