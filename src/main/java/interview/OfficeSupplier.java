package interview;

public class OfficeSupplier {

    /*
     * The shredFirstCharacter() method takes a String s and returns a new String.
     * The resulting String should not include the first character of the original.
     *   - ex: "xSt. Saviour" -> "St. Saviour"
     */
    public static String shredFirstCharacter(String s) {
        // TODO
        // HINT https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-
        int l = s.length();
        String c = s.substring(l);
        return c;
    }

    /*
     * The shredLastCharacter() method takes a String s and returns a new String.
     * The resulting String should not include the last character of the original.
     *   - ex: "St. Saviourx" -> "St. Saviour"
     */
    public static String shredLastCharacter(String s) {
        int l = s.length();
        String c = s.substring(0, l - 1);
        return c;
        // TODO
        // HINT https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-
    }

    /*
     * The stapleToBeginning() method takes a String s, a char c, and returns a new String.
     * The resulting String should have the character added to the front of the original
     *   - ex: "ey can I pull you for a chat?", 'H' -> "Hey can I pull you for a chat?"
     */
    public static String stapleToBeginning(String s, char c) {
        
    }

    /*
     * The stapleToEnd() method takes a String s, a char c, and returns a new String.
     * The resulting String should have the character added to the end of the original
     *   - ex: "Hey can I pull you for a cha?", 't' -> "Hey can I pull you for a chat?"
     */
    public static String stapleToEnd(String s, char c) {
        if (s == null || s.isEmpty()) {
            return Character.toString(c);
        }
        String result = s + c;
        return result;
        // TODO
    }
}
