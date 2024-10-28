package cmd.parser;

import java.util.Optional;

/*
 * CmdOption class
 */
/**
 * The {@code Option} class represents a command-line option with both long and short argument names.
 * It also specifies the type of argument the option expects and can store an optional value.
 * This class is used for parsing and handling command-line arguments.
 * 
 * <p>Example usage:</p>
 * <pre>
 * {@code
 * Option option = new Option("verbose", 'v', OptionArgumentType.BOOLEAN);
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

    /**
     * Constructs an {@code Option} with the specified long argument name, short argument name,
     * and argument type.
     *
     * @param longArgumentName the long name of the argument (e.g., "--help")
     * @param shortArgumentName the short name of the argument (e.g., '-h')
     * @param argumentType the type of the argument (e.g., required, optional, no argument)
     */
    public Option(String longArgumentName, String shortArgumentName, OptionArgumentType argumentType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Constructs an {@code Option} with the specified short argument name and argument type. The long argument name is set to the same value as the short name.
     *
     * @param shortArgumentName the short name of the argument (e.g., '-h')
     * @param argumentType the type of the argument (e.g., required, optional, no argument)
     */
    public Option(char shortArgumentName, OptionArgumentType argumentType) {
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
     * Returns the short argument name of this option. If the short argument name is not set, the long argument name is returned.
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
    public OptionArgumentType getArgumentType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the value of this option as an {@code Optional<String>}.
     *
     * If the argument type is of type no argument or optional and there is no argument, the value is empty.
     * 
     * @return the value of this option
     */
    public Optional<String> getValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns whether the option is present in the command line arguments.
     *
     * @return {@code true} if the option is present, {@code false} otherwise
     */
    public boolean isPresent() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Sets whether the option is present in the command line arguments.
     *
     * @param present {@code true} if the option is present, {@code false} otherwise
     */
    public void setPresent(boolean present) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Sets the command line argument for this option.
     *
     * @param value the value to set
     * @throws UnsupportedOperationException if the option does not accept an argument
     */
    public void setValue(String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
