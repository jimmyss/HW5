import java.util.Locale;

/**
 * The {@code Collation} class provides helper methods for string comparison and transformation
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
     * This function performs an implicit transformation of two strings {@code str1}
     * and {@code str2} to current locale, then conducts comparison, returning an int
     * that mimicks the standard behavior of String comparison in Java.
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
     * @param str1 The first String to be compared.
     * @param str2 The second String to be compared.
     * @return A negative integer if {@code str1} is less than {@code str2},
     *         A positive integer if {@code str1} is greater than {@code str2},
     *         and zero if {@code str1} and {@code str2} are equal, according to
     *         the default locale.
     * @throws IllegalArgumentException if either {@code str1} or {@code str2} is {@code null}
     */
    public static int compareWithDefaultLocale(String str1, String str2) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Compares two strings for collation order based on the specified locale.
     *
     * This function performs an implicit transformation of two strings {@code str1}
     * and {@code str2} to the specified locale, then conducts comparison, returning an int
     * that mimicks the standard behavior of String comparison in Java.
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
     * @param str1 The first String to be compared.
     * @param str2 The second String to be compared.
     * @param locale The locale under which String comparison is performed.
     * @return A negative integer if {@code str1} is less than {@code str2},
     *         a positive integer if {@code str1} is greater than {@code str2},
     *         and zero if {@code str1} and {@code str2} are equal, according to
     *         the specified locale.
     * @throws IllegalArgumentException if {@code str1}, {@code str2}, or {@code locale} is {@code null}.
     */
    public static int compareWithLocale(String str1, String str2, Locale locale) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Transforms the {@code source} String into a collation key string under the default locale.
     * The transformed string can be used for locale-sensitive operations like comparison.
     *
     * This function performs explicit transformation of {@code source}, with the return value representing
     * the transformed String.
     *
     * Usage Example:
     * <pre><code>
     * String destination = Collation.transformWithLocale("example");
     * </code></pre>
     *
     * @param source Immutable source string to be transformed.
     * @return The transformed string, using the default locale.
     * @throws IllegalArgumentException if {@code source} is {@code null}.
     */
    public static String transformIntoDefaultLocale(String source) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Transforms the {@code source} String into a collation key string under the specified locale.
     * The transformed string can be used for locale-sensitive operations like comparison.
     *
     * This function performs explicit transformation of {@code source} according to the 
     * specified {@code locale}, with return value representing the transformed String.
     *
     * Usage Example:
     * <pre><code>
     * String destination = Collation.transformWithLocale("foo", Locale.US)
     * </code></pre>
     *
     * @param source Immutable source string to be transformed.
     * @param locale Locale under which the transformation is performed.
     * @return The transformed string, using the specified locale.
     * @throws IllegalArgumentException if {@code source} or {@code locale} is {@code null}.
     */
    public static String transformIntoLocale(String source, Locale locale) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
