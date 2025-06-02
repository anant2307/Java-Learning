package BasicOppsConcepts;

public class StringExamples {
    public static void main(String[] args) {
        // Creating String objects
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "   Java Programming   ";

        // String concatenation
        String combined = str1 + " " + str2;
        System.out.println("Concatenated String: " + combined);

        // length()
        System.out.println("Length of str1: " + str1.length());

        // charAt()
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str2.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());

        // trim()
        System.out.println("Trimmed str3: '" + str3.trim() + "'");

        // substring()
        System.out.println("Substring of str3 (0 to 4): " + str3.substring(0, 4));

        // contains()
        System.out.println("Does str3 contain 'Java'? " + str3.contains("Java"));

        // equals() and equalsIgnoreCase()
        System.out.println("Is str1 equal to 'hello'? " + str1.equals("hello"));
        System.out.println("Ignore case check: " + str1.equalsIgnoreCase("hello"));

        // replace()
        String replaced = str3.replace("Java", "Python");
        System.out.println("After replace: " + replaced);
    }
}
