package interview;

public class OfficeSupplier {

    /*
     * The shredFirstCharacter() method takes a String s and returns a new String.
     * The resulting String should not include the first character of the original.
     *   - ex: "xSt. Saviour" -> "St. Saviour"
     */
    public static String shredFirstCharacter(String s) {
              
        String x = s.substring (1,s.length());

        return x; 
    
    } // removes first letter of string using shredFirstCharacter

    /*
     * The shredLastCharacter() method takes a String s and returns a new String.
     * The resulting String should not include the last character of the original.
     *   - ex: "St. Saviourx" -> "St. Saviour"
     */
    
     public static String shredLastCharacter(String s) {
        
        String x = s.substring(0, s.length()-1);

        return x;
    } // removes last letter of string by taking last character away 

    /*
     * The stapleToBeginning() method takes a String s, a char c, and returns a new String.
     * The resulting String should have the character added to the front of the original
     *   - ex: "ey can I pull you for a chat?", 'H' -> "Hey can I pull you for a chat?"
     */
    
     public static String stapleToBeginning(String s, char c) {

        return c + s;
    } // adds a character to the beginning of the phrase by using the string to attach the letter __ to char into the string __

    /*
     * The stapleToEnd() method takes a String s, a char c, and returns a new String.
     * The resulting String should have the character added to the end of the original
     *   - ex: "Hey can I pull you for a cha?", 't' -> "Hey can I pull you for a chat?"
     */
    public static String stapleToEnd(String s, char c) {

        return s + c;
    } // adds a character to the end of the phrase by using stapleToEnd to attach the letter __ to char to the string __
}
