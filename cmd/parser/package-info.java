/**
 * The {@code cmd.parser} package provides classes and utilities for parsing command-line arguments
 * and generating help messages for specified options. This package offers a flexible and extensible
 * way to define and manage command-line options, allowing for single or multiple arguments, and validating
 * argument values against a predefined set of possible values.
 * 
 * <h2>Overview</h2>
 * <p>
 * The {@code cmd.parser} package includes the following key classes:
 * </p>
 * <ul>
 *   <li>{@link cmd.parser.CommandLineParser} - The main class responsible for parsing command-line arguments
 *       and generating help messages.</li>
 *   <li>{@link cmd.parser.Option} - Represents a command-line option with a short and long name, argument type,
 *       optional values, and a description.</li>
 *   <li>{@link cmd.parser.OptionBuilder} - A builder class to simplify the construction of {@link cmd.parser.Option}
 *       instances with optional values, descriptions, and other attributes.</li>
 *   <li>{@link cmd.parser.OptionType} - An enumeration that defines the type of argument an option requires,
 *       such as {@code FLAG}, {@code REQUIRES_ARGUMENT}, or {@code REQUIRES_MULTIPLE_ARGUMENTS}.</li>
 * </ul>
 * 
 * <h2>Usage Example</h2>
 * <p>
 * The package allows you to define command-line options using the {@link cmd.parser.OptionBuilder} class
 * and then parse command-line arguments using the {@link cmd.parser.CommandLineParser} class.
 * Here's an example of how to use the classes in this package:
 * </p>
 * 
 * <pre>{@code
 * // Define options using OptionBuilder
 * OptionBuilder helpBuilder = new OptionBuilder(OptionType.FLAG, "h");
 * Option helpOption = helpBuilder
 *     .setOptionDescription("Displays help information")
 *     .setLongArgumentName("help")
 *     .build();
 * 
 * OptionBuilder verboseBuilder = new OptionBuilder(OptionType.FLAG, "v");
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
 * // Parse command-line arguments
 * String[] args = {"-h", "-o", "output.txt", "-m", "auto"};
 * HashMap<String, Option> parsedOptions = CommandLineParser.parse(args, options);
 * 
 * // Generate and display help message
 * String helpMessage = CommandLineParser.getHelp(options);
 * System.out.println(helpMessage);
 * }</pre>
 * 
 * @see cmd.parser.CommandLineParser
 * @see cmd.parser.Option
 * @see cmd.parser.OptionBuilder
 * @see cmd.parser.OptionType
 */
package cmd.parser;
