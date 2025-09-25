import java.util.Random;

class Hello {
    public static void main(String[] args) {
        System.out.println("new dawn, new day!");
        // Hello!
        //Concatenatio in Java
        //string s = "Sept";
        //string e = "ember";
        //System.out.println(s + e);


        //Password generator
        //Random random = new Random();
        //array letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String password = "";
        //int r = random.nextInt(letters.length());
        //password += letters.charAt(r);
        

        String s = "September";
        String c = "Sept";
        c += "ember";

        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(c));

        //strings are emutable
        //Even though the variables have different names they are pointing to the same value
        //Java does not create an entirely new memory address for c. 
        //Instead it decides that c refers to s. This is more space effective.
        //This is called string interning.
    }
}