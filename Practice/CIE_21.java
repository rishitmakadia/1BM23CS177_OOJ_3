public class CIE_21 {
    public static void main(String[] args) {
        // String Constructor
        String str1 = new String("Hello");
        String str2 = new String("World");
        System.out.println("String Constructor: str1 = " + str1 + ", str2 = " + str2);

        // String Length
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        // Special String Operations (Concatenation and Substring)
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenated);
        String substring = concatenated.substring(6, 11);
        System.out.println("Substring (6-11): " + substring);

        // Character Extraction
        char charAtPos3 = concatenated.charAt(3);
        System.out.println("Character at position 3 in concatenated string: " + charAtPos3);

        // String Comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);
        int compareToResult = str1.compareTo(str2);
        System.out.println("Comparison (str1.compareTo(str2)): " + compareToResult);

        // Modifying a String (Converting to Uppercase)
        String modifiedStr1 = str1.toUpperCase();
        System.out.println("Modified str1 (Uppercase): " + modifiedStr1);

        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Initial StringBuffer: " + stringBuffer);
        stringBuffer.append(" Everyone");
        System.out.println("After Append: " + stringBuffer);
        stringBuffer.insert(6, "Dear ");
        System.out.println("After Insert: " + stringBuffer);
        stringBuffer.replace(6, 11, "Lovely ");
        System.out.println("After Replace: " + stringBuffer);
        stringBuffer.delete(6, 13);
        System.out.println("After Delete: " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("After Reverse: " + stringBuffer);
    }
}


