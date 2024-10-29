package cmd.parser;

/**
 * The {@code Option} class represents a command-line option with both long and short argument names.
 * It also specifies the type of argument the option expects and can store an optional value.
 * This class is used for parsing and handling command-line arguments. To obtain an instance of this class, use the {@code OptionBuilder} class.
 * 
 * <p>Example usage:</p>
 * <pre>
 * {@code
 * OptionBuilder helpBuilder = new OptionBuilder(OptionType.FLAG, "h");
 * Option helpOption = helpBuilder.build();
 * }
 * </pre>
 * 
 * <p>Each option has:</p>
 * <ul>
 *   <li>A long argument name (e.g., "verbose")</li>
 *   <li>A short argument name (e.g., 'v')</li>
 *   <li>An argument type (e.g., {@code OptionArgumentType.BOOLEAN})</li>
 *   <li>An optional value (e.g., "true" for a boolean option)</li>
 * </ul>
 * 
 * @see OptionArgumentType
 */
public class Option {
    private Option(OptionType optionTypeString, String optionDescription, String shortArgumentName, String longArgumentName, String[] possibleValues) {
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
     * Returns the values set to this option. If the option type is {@code OptionType.NO_ARGUMENT}, the returned array will be empty.
     * If the option type is {@code OptionType.REQUIRES_ONE_ARGUMENT} or {@code OptionType.REQUIRES_ONE_OR_MORE_ARGUMENTS}, the returned array will contain at least one element.
     * If the option type is {@code OptionType.OPTIONAL_ONE_ARGUMENT} or {@code OptionType.OPTIONAL_ONE_OR_MORE_ARGUMENTS}, the returned array will be empty or have one or more elements.
     * 
     * <p>If the option type is {@code OptionType.NO_ARGUMENT}, the returned array will be empty.</p>
     * 
     * @return the values set for this option or an empty array if no values are set
     */
    public String[] getValues() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
