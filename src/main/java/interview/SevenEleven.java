package interview;

public class SevenEleven {
    
    /*
     * The shop() method accepts an int 'price' and returns a String.
     *   - If the price is a multiple of 7 the result String should be "seven".
     *   - If the price is a multiple of 11 the result String should be "eleven".
     *   - If the price is a multiple of 7 AND 11 the result String should be "seveneleven"
     *   - If the price is NOT a multiple of either 7 OR 11 the result String should be "".
     */
    public static String shop(int price) {

        if ((price % 7 == 0) && (price % 11 == 0)) {
            return "seveneleven";
        } // if the price is a multiple of BOTH 7 and 11, the string will print (seveneleven)
        if (price % 7 == 0) {
            return "seven";
        } // if the price is a multiple of 7 only, the string will print (seven)
        if (price % 11 == 0) {
            return "eleven";
        } // if the price is a multiple of 11 only, the string will print (eleven)

        return "";
    } // if the price isn't a multiple of 7 or 11, then the string won't print anything
}
