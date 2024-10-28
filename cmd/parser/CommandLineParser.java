package cmd.parser;

import java.util.HashMap;

public class CommandLineParser {

    /**
     * Parses the command-line arguments and returns a map of options mapped to the long argument version.
     * 
     * @param args the command-line arguments
     * @param options the options to parse
     * @return a map of options
     * @throws IllegalArgumentException if one of the options with a required argument does not have an argument
     * @throws IllegalArgumentException if one of the options with no argument receives an argument
     * @throws IllegalArgumentException if an option appears more than once
     */
    public static HashMap<String, Option> parse(String[] args, Option[] options) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
