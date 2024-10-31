package cmd.parser;

import java.util.Optional;

/**
 * The {@code Option} class represents a command-line option with both long and short argument names.
 * It also specifies the type of argument the option expects and can store an optional value.
 * 
 * <p>Example usage:</p>
 * <pre>
 * {@code
 * Option helpOption = new Option(OptionType.NO_ARGUMENT, "h");
 * }
 * </pre>
 * 
 * <p>Each option has:</p>
 * <ul>
 *   <li>A long argument name (e.g., "--verbose")</li>
 *   <li>A short argument name (e.g., '-v')</li>
 *   <li>An optional value (e.g., "true" for a boolean option)</li>
 * </ul>
 * 
 * @see OptionArgumentType
 */
public class Option {
    /**
     * Constructs an Option with the specified option type and short argument name. The long argument name is set to the short argument name by default.
     * 
     * @param optionTypeString The type of the option.
     * @param shortArgumentName The short argument name for the option.
     */
    public Option(OptionType optionTypeString, char shortArgumentName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Constructs an Option with the specified option type, short argument name, and long argument name.
     * 
     * @param optionTypeString The type of the option.
     * @param shortArgumentName The short argument name for the option.
     * @param longArgumentName The long argument name for the option.
     */
    public Option(OptionType optionTypeString, char shortArgumentName, String longArgumentName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the long argument name of this option. If the long argument name is not set, the short argument name is returned.
     *
     * @return the long argument name
     */
    public String getLongArgumentName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the short argument name of this option.
     *
     * @return the short argument name
     */
    public char getShortArgumentName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the argument type of this option.
     *
     * @return the argument type
     */
    public OptionType getOptionType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the value set to this option. If the option type is {@code OptionType.NO_ARGUMENT}, the returned option will be empty.
     * If the option type is {@code OptionType.OPTIONAL_ARGUMENT}, the returned option could be empty.
     * 
     * @return the value set for this option or an empty array if no values are set
     */
    public Optional<String> getValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
