import java.util.Random;

class Hello {
    public static void main(String[] args) {
        // System.out.println("new dawn, new day!");
        // String s = "September";

        // System.out.println(h);

        // if ((a > 9 && b < 1000) || c) {
        //     System.out.println("true!");
        //     System.out.println("this also runs!");
        // } else {
        //     System.out.println("false!");
        // }


        String s = "September";
        String c = "Sept";
        c += "ember";

        String e = s + c;

        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(c));

        if (s.equals(c)) {
            System.out.println("the strings are the same!");
        } else {
            System.out.println("the strings are NOT the same!");
        }


        // char c = s.charAt(s.length() - 1);
        // String e = s.substring(4, 8);
        // System.out.println(e);

        // Random random = new Random();
        // String s = "September";
        // int r = random.nextInt(s.length());
        // System.out.println("The random number is: " + r);
        // System.out.println("The random letter is: " + s.charAt(r));
        
    }
}