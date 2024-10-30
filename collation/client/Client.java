import java.util.Locale;

public class Client {
    public static void main(String[] args) {

        // Test cases for Collation.compareWithLocale()
        String str1 = "café";
        String str2 = "cafe";

        // Test case 1: Default locale comparison
        try{
            int result = Collation.compareWithLocale(str1, str2);
            if (result < 0) {
                System.out.println("\"" + str1 + "\" is less than \"" + str2 + "\"");
            } else if (result > 0) {
                System.out.println("\"" + str1 + "\" is greater than \"" + str2 + "\"");
            } else {
                System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
            }
        }catch(Exception e){
            System.out.println("Exception in testing case 1 of compareWithLocale");
            System.out.println(e.getMessage());
        }

        // Test case 2: Comparison with a specific locale (Spanish)
        try{
            int result = Collation.compareWithLocale(str1, str2, Locale.CANADA);
            if(result <0) {
                System.out.println("\"" + str1 + "\" is less than \"" + str2 + "\"");
            }else if(result > 0) {
                System.out.println("\"" + str1 + "\" is greater than \"" + str2 + "\"");
            }else{
                System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
            }
        }catch(Exception e){
            System.out.println("Exception in testing case 2 of compareWithLocale");
            System.out.println(e.getMessage());
        }

        // Test cases for Collation.transformWithLocale()
        String source = "café";
        char[] destination = new char[10];
        int sizeLimit = 10;

        // Test case 3: Transform with default locale
        try {
            int length = Collation.transformWithLocale(source, destination, sizeLimit);
            System.out.println("Transformation length (default locale): " + length);
            System.out.println("Transformed string (default locale): " + new String(destination, 0, length));
        } catch (Exception e) {
            System.out.println("Exception in testing case 5 of transformWithLocale");
            System.out.println(e.getMessage());
        }

        // Test case 4: Transform with specific locale (Spanish)
        try {
            int length = Collation.transformWithLocale(source, destination, sizeLimit, Locale.getDefault());
            System.out.println("Transformation length (Spanish locale): " + length);
            System.out.println("Transformed string (Spanish locale): " + new String(destination, 0, length));
        } catch (Exception e) {
            System.out.println("Exception in testing case 6 of transformWithLocale");
            System.out.println(e.getMessage());
        }

    }
}
