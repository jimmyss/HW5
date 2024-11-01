import java.util.Locale;

/**
 * The {@code Collation} class provides methods for string comparison and transformation
 * based on the collation rules of a specified locale.
 *
 * This class is inspired by collation functions from GNU C and is designed to perform
 * locale-sensitive comparisons and transformations on strings, emulating functionalities
 * similar to {@code strcoll} and {@code strxfrm}.
 */
public final class Collation {

    /**
     * Compares two strings for collation order using the system's default locale.
     *
     * This function will perform implicit transformation of two strings {@code str1}
     * and {@code str2} to current locale, and conduct comparison. Finally this function
     * will return an integer.
     *
     * Usage Example:
     * <pre><code>
     * int result = Collation.compareWithDefaultLocale("foo", "bar");
     * if (result &lt; 0) {
     *      System.out.println("\"foo\" comes before \"bar\"");
     * } else if (result &gt; 0) {
     *     System.out.println("\"foo\" comes after \"bar\"");
     * } else {
     *     System.out.println("\"foo\" is equal to \"bar\"");
     * }
     * </code></pre>
     *
     * @param str1 This is the first String to be compared.
     * @param str2 This is the second String to be compared.
     * @return a negative integer if {@code str1} is less than {@code str2}.
     *         a positive integer if {@code str1} is greater than {@code str2}.
     *         zero if {@code str1} and {@code str2} are the same.
     * @throws NullPointerException if either {@code str1} or {@code str2} is {@code null}
     */
    public static int compareWithDefaultLocale(String str1, String str2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Compares two strings for collation order based on specific locale.
     *
     * This function will perform implicit transformation of two strings {@code str1}
     * and {@code str2} to specified locale, and compare under this locale. An integer
     * will be returned after the comparison.
     *
     * Usage Example:
     * <pre><code>
     * int result = Collation.compareWithLocale("café", "cafe", Locale.FRENCH);
     * if (result &lt; 0) {
     *     System.out.println("\"café\" comes before \"cafe\" in French collation.");
     * } else if (result &gt; 0) {
     *     System.out.println("\"café\" comes after \"cafe\" in French collation.");
     * } else {
     *     System.out.println("\"café\" is equal to \"cafe\" in French collation.");
     * }
     * </code></pre>
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
    public static int compareWithLocale(String str1, String str2, Locale locale) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Transforms the {@code source} string into a collation key string under the default locale.
     * The transformed string can be used for locale-sensitive comparisons.
     *
     * This function performs explicit transformation of {@code source}, with return value representing
     * the transformed String. This method is more simple and intuitive compared with the original one
     * on GNU platform.
     *
     * Usage Example:
     * <pre><code>
     * char[] destination = new char[100];
     * int transformedLength = Collation.transformWithLocale("example");
     * </code></pre>
     *
     * @param source Immutable source string to be transformed.
     * @return The transformed string, using the default locale.
     * @throws NullPointerException if either {@code source} or {@code destination} is {@code null}.
     */
    public static String transformIntoDefaultLocale(String source) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Transforms the {@code source} string into a collation key string under specified locale.
     * The transformed string can be used for locale-sensitive comparisons.
     *
     * This function performs explicit transformation of {@code source} according to specified {@code locale},
     * with return value representing the transformed String. This method is more simple and intuitive compared
     * with the original one on GNU platform.
     *
     * Usage Example:
     * <pre><code>
     * char[] destination = new char[100];
     * int transformedLength = Collation.transformWithLocale("foo", Locale.US)
     * </code></pre>
     *
     * @param source Immutable source string to be transformed.
     * @param locale Specific locale where string comparison is performed.
     * @return The number of characters needed for full transformation.
     * @throws NullPointerException if either {@code source} or {@code destination} is {@code null}.
     * @throws IllegalArgumentException if {@code locale} is {@code null}.
     */
    public static String transformIntoLocale(String source, Locale locale) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
