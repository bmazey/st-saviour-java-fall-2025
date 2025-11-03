class Hello {
    public static void main(String[] args) {
        // System.out.println("new dawn, new day!");
        //  int[] numbers = new int[10]

        //10/15/2025
        //count the amount of items in the list that are either 7 or 3
        // int[] numbers = {1, 2, 3, 7, 7, 3, 1, 7};
        // int count = 0;
        // for(int i = 0; i < numbers.length; i++){
        //     if (numbers[i] == 3 || numbers[i] == 7){
        //         count += 1;
        //     }
        // }

        // int[] result = new int[count];
        // int position = 0;
        // for(int i = 0; i < numbers.length; i++){
        //     if(numbers[i] == 3 || numbers[i] ==7){
        //         result[position] = numbers[i];
        //         position++;
        //     }

        //checks if palandrome
        String  word = "October"; 
        String reverse = "";
        for(int i = 0; i < word.length(); i++){
            reverse = reverse + word.charAt(word.length() - 1 - i);
        }
        for(int i = word.length() - 1; i >=0;i--){
            reverse = reverse + word.charAt(i);   
        
        if (word.equals(reverse)){
            System.out.println(word + " is a palindrome");
        }


        }

    }
}