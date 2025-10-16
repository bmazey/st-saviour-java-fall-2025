class Hello {
    public static void main(String[] args) {
        System.out.println("new dawn, new day!");

        int[] numbers = {1, 2, 3, 7, 7, 3, 1, 7};

        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 3 || numbers[i] == 7) {
                count++;
            }
        }

        int[] result = new int[count];
        int position = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 3 || numbers[i] == 7) {
                result[position] = numbers[i];
                position++;
            }
        }

        // String s = "October";

        // int i = 0;
        // while(i < s.length()) {
        //     System.out.println("The character we're on is: " + s.charAt(i));
        //     i += 1;
        // }

        // for(int i = 0; i < 100; i+=2) {
        //     System.out.println("I will not cheat on my CS exam ... " + i);
        // }

        // int i = 0;
        // do {
        //     System.out.println("I will not cheat on my CS exam ... " + i);
        //     i += 1;
        // } while (i < 100);
    }
}