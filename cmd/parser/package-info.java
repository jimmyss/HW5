/**
 * The {@code cmd.parser} package provides utility classes for parsing command-line arguments 
 * and generating structured information from command-line options. This package is designed to
 * facilitate the implementation of customizable and flexible command-line interfaces for Java applications.
 * 
 * <h2>Main Classes:</h2>
 * <ul>
 *   <li>{@link cmd.parser.CommandLineParser} - The core class for parsing command-line arguments, providing flexible strategies
 *       for handling options and non-option arguments, such as respecting the `--` end-of-options marker.</li>
 *   <li>{@link cmd.parser.Option} - Represents a command-line option, including its long and short forms, argument types, 
 *       and optional value storage.</li>
 *   <li>{@link cmd.parser.ParsingOrder} - Enum defining different modes for handling the order of non-option arguments,
 *       enabling parsing in a manner consistent with GNU, POSIX, or preserving the original order.</li>
 * </ul>
 * 
 * <h2>Features and Capabilities:</h2>
 * - **Versatile Parsing Strategies**: Users can choose between multiple argument handling strategies with the {@link ParsingOrder} enum:
 *   <ul>
 *     <li><b>ORDER_OPTIONS_FIRST</b>: Orders options first, followed by non-options, similar to GNU tools.</li>
 *     <li><b>STOP_PARSING_AT_NON_OPTION</b>: Stops parsing at the first non-option, treating subsequent arguments as non-options, consistent with POSIX.</li>
 *     <li><b>KEEP_IN_PLACE</b>: Retains all options and non-options in their original order, ensuring no reordering occurs.</li>
 *   </ul>
 * 
 * - **Flexible Option Representation**: The {@link Option} class provides an abstraction for representing both short and long 
 *   command-line options. Options can include no arguments, optional arguments, or required arguments.
 * 
 * - **End-of-Options Handling**: The package respects the `--` marker, which signifies the end of options. Any arguments following 
 *   `--` are treated strictly as non-option arguments, regardless of their appearance.
 * 
 * <h2>Example Usage:</h2>
 * This package makes it simple to create command-line parsers that can be customized for different behaviors. Here's a sample usage scenario:
 * <pre>
 * import cmd.parser.CommandLineParser;
 * import cmd.parser.Option;
 * import cmd.parser.OptionType;
 * import cmd.parser.ParsingOrder;
 * 
 * public class ExampleUsage {
 *     public static void main(String[] args) {
 *         // Define options
 *         Option[] options = {
 *             new Option(OptionType.NO_ARGUMENT, 'v', "verbose"),
 *             new Option(OptionType.REQUIRED_ARGUMENT, 'o', "output"),
 *             new Option(OptionType.NO_ARGUMENT, 'h', "help")
 *         };
 *         
 *         // Sample command-line arguments
 *         String[] commandArgs = {"-v", "--output", "file.txt", "-h", "file1.txt"};
 *         
 *         // Parse the arguments with different parsing modes
 *         List<Option> parsedOptions = CommandLineParser.parseArguments(commandArgs, options, ParsingOrder.ORDER_OPTIONS_FIRST);
 *         
 *         // Display parsed options
 *         parsedOptions.forEach(option -> {
 *             System.out.println("Option: " + option.getLongArgumentName());
 *             option.getValue().ifPresent(value -> System.out.println("  Argument: " + value));
 *         });
 *     }
 * }
 * </pre>
 */
package cmd.parser;
