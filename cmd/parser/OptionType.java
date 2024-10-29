package cmd.parser;

/**
 * Enum representing the types of arguments that an option can have.
 * This is used to specify whether an option requires an argument, 
 * has an optional argument, or does not accept an argument.
 */
public enum OptionType {
    /**
     * Indicates that the option does not accept any arguments.
     */
    NO_ARGUMENT, 

    /**
     * Indicates that the option requires an argument.
     */
    REQUIRES_ONE_ARGUMENT, 

    /**
     * Indicates that the option requires one or more arguments.
     */
    REQUIRES_ONE_OR_MORE_ARGUMENTS,

    /**
     * Indicates that the option accepts an optional argument.
     */
    OPTIONAL_ONE_ARGUMENT,

    /**
     * Indicates that the option accepts no argument or multiple arguments.
     */
    OPTIONAL_ONE_OR_MORE_ARGUMENTS
}
