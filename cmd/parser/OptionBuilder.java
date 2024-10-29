package cmd.parser;

/**
 * The {@code OptionBuilder} class provides a builder for constructing
 * {@code Option} objects. It allows setting various properties of an {@code Option}
 * such as type, description, argument names, and possible values.
 * 
 * <p>Example usage:</p>
 * <pre>{@code
 * OptionBuilder builder = new OptionBuilder(OptionType.REQUIRES_ONE_OR_MORE_ARGUMENTS, "s");
 * Option option = builder
 *     .setOptionDescription("This is a string option")
 *     .setLongArgumentName("stringOption")
 *     .setPossibleValues(new String[]{"value1", "value2"})
 *     .setDescription("A detailed description of the option")
 *     .build();
 * }</pre>
 * 
 */
public class OptionBuilder {

    /**
     * Constructs an OptionBuilder with the specified option type and short argument name.
     *
     * @param optionType The type of the option.
     * @param shortArgumentName The short argument name for the option.
     */
    public OptionBuilder(OptionType optionType, String shortArgumentName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Sets the description of the option.
     *
     * @param optionDescription The description of the option.
     * @return The current instance of OptionBuilder.
     */
    public OptionBuilder setOptionDescription(String optionDescription) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Sets the long argument name for the option.
     *
     * @param longArgumentName The long argument name for the option.
     * @return The current instance of OptionBuilder.
     */
    public OptionBuilder setLongArgumentName(String longArgumentName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Sets the possible values for the option.
     *
     * @param possibleValues An array of possible values for the option.
     * @return The current instance of OptionBuilder.
     * @throws IllegalArgumentException if the option type is of @{code OptionType.NO_ARGUMENT}
     */
    public OptionBuilder setPossibleValues(String[] possibleValues) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Builds and returns an instance of the Option class with the specified properties.
     *
     * By default, the option has no description, no long argument name, and no possible values.
     * 
     * @return An instance of the Option class.
     */
    public Option build() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
