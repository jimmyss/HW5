import java.text.Collator;
import java.util.Locale;

/**
 * The {@code Collation} class provides methods for string comparison and transformation
 * based on the collation rules of a specified locale.
 *
 * This class is inspired by collation functions from GNU C and is designed to perform
 * locale-sensitive comparisons and transformations on strings, emulating functionalities
 * similar to {@code strcoll} and {@code strxfrm}.
 */
public class Collation {

    /**
     * Compares two strings for collation order using the system's default locale.
     *
     * Usage Example:
     * @example
     * {@code
     * int result = Collation.compareWithLocale("foo", "bar");
     * if (result < 0) {
     *      System.out.println("\"foo\" comes before \"bar\"");
     * } else if (result > 0) {
     *     System.out.println("\"foo\" comes after \"bar\"");
     * } else {
     *     System.out.println("\"foo\" is equal to \"bar\"");
     * }}
     *
     * @param str1 This is the first String to be compared.
     * @param str2 This is the second String to be compared.
     * @return a negative integer if {@code str1} is less than {@code str2}.
     *         a positive integer if {@code str1} is greater than {@code str2}.
     *         zero if {@code str1} and {@code str2} are the same.
     * @throws NullPointerException if either {@code str1} or {@code str2} is {@code null}
     */
    public static int compareWithLocale(String str1, String str2){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Compares two strings for collation order based on specific locale.
     *
     * Usage Example:
     * @example
     * {@code
     *
     * }
     *
     * @param str1 This is the first String to be compared.
     * @param str2 This is the second String to be compared.
     * @param locale Specific locale where string comparison is performed.
     * @return a negative integer if {@code str1} is less than {@code str2}.
     *         a positive integer if {@code str1} is greater than {@code str2}.
     *         zero if {@code str1} and {@code str2} are the same.
     * @throws NullPointerException if either {@code str1} or {@code str2} is {@code null}.
     * @throws IllegalArgumentException if {@code locale} is {@code null}.
     */
    public static int compareWithLocale(String str1, String str2, Locale locale){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Transform string from {@code source} to a character array {@code destination}
     * restricted by {@sizeLimit} under default locale.
     *
     * This function perform explicit transformation from {@code source} to {@code destination},
     * with return value representing the length of {@code destination}. This return value has
     * no relationship with {@code sizeLimit}, meaning that return value should be greater than
     * {@code sizeLimit} if it doesn't fit the limitation. The length of {@code destination}
     * should be no greater than {@code sizeLimit}. To get the whole transformed string, apply
     * larger {@code sizeLimit}.
     *
     * Usage Example:
     * {@code
     * }
     * @param source Immutable source string to be transformed.
     * @param destination The destination where transformed string will be stored.
     * @param sizeLimit Limiting the upper bound of transformed string's length.
     * @return The number of characters needed for full transformation.
     * @throws NullPointerException if either {@code source} or {@code destination} is {@code null}.
     * @throws IllegalArgumentException if {@code sizeLimit} is less than zero.
     */
    public static int transformWithLocale(String source, char[] destination, int sizeLimit){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Transform string from {@code source} to a character sequence {@code destination}
     * restricted by {@sizeLimit} under specific locale.
     *
     * This function perform explicit transformation from {@code source} to {@code destination},
     * with return value representing the length of {@code destination}. This return value has
     * no relationship with {@code sizeLimit}, meaning that return value should be greater than
     * {@code sizeLimit} if it doesn't fit the limitation. The length of {@code destination}
     * should be no greater than {@code sizeLimit}. To get the whole transformed string, apply
     * larger {@code sizeLimit}.
     *
     * Usage Example:
     * {@code
     * char[] destination = new char[100];
     * int transformedLength = Collation.transformWithLocale("foo", destination, 50, Locale.US)
     * }
     * @param source Immutable source string to be transformed.
     * @param destination The destination where transformed string will be stored.
     * @param sizeLimit Limiting the upper bound of transformed string's length.
     * @param locale Specific locale where string comparison is performed.
     * @return The number of characters needed for full transformation.
     * @throws NullPointerException if either {@code source} or {@code destination} is {@code null}.
     * @throws IllegalArgumentException if {@code sizeLimit} is less than zero.
     * @throws IllegalArgumentException if {@code locale} is {@code null}.
     */
    public static int transformWithLocale(String source, char[] destination, int sizeLimit, Locale locale){
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
