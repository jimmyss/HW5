package cmd.parser;

/**
 * Enum representing the types of arguments that an option can have.
 * This is used to specify whether an option requires an argument, 
 * has an optional argument, or does not accept an argument.
 */
public enum OptionArgumentType {
    /**
     * Indicates that the option does not accept any arguments.
     */
    NO_ARGUMENT, 

    /**
     * Indicates that the option requires an argument.
     */
    REQUIRED_ARGUMENT, 

    /**
     * Indicates that the option accepts an optional argument.
     */
    OPTIONAL_ARGUMENT
}
