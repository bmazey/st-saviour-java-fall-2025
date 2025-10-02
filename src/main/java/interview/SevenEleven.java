package interview;

public class SevenEleven {
    public static String shop(int price) {
      if (price % 7 == 0 && price % 11 == 0) {
        return "seveneleven";
      }
      else if (price % 7 == 0) {
        return "seven";
      }
      else if (price % 11 == 0) {
        return "eleven";
      }
      else {
        return "";
      }
    }
    public static void main(String[] args) {
        System.out.println(shop(7));
        System.out.println(shop(11));
        System.out.println(shop(77));
        System.out.println(shop(10));
    }
}
