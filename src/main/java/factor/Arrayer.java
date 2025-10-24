package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    //      ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {

        // TODO
        int sum = 0; 
            // create an integer called sum to track the sum of the numbers in the array.
        for (int i = 0; i < numbers.length; i++){
            // make a loop, create int i to track the index and make it start at 0 
                //(first position).
            // terminating condition: loop ends once the index is 
            //equal to the length of the array (to prevent out of bound errors)
            // increment i by 1 everytime the loop runs
            sum += numbers[i];
            // every time the loop runs, int sum wil add the number 
            // the loop is currently on and the value of sum
        }
        return sum;
         // returns the sum of the array

    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    //      ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {
        // TODO

        for (int i = 0; i < numbers.length; i++){
            //creates a loop. create an int called i to track the index 
                //(start at 0 to begin from the first position)
            //terminating condition: end loop when the index (i) is equal to the length of the array 
                //(prevents out of bounds error)
            //i increments by 1 every time the loop runs
            if (numbers[i] < 0){
                //if the number the loop is currently on is less than 0 (negative)
                return i;
                //return the index of that negative number
            }

        }
        return 0;
    }

    // findGreatest() accepts an array of integers and returns the greatest
    // number found within the array.
    //      ex: [11, 13, -1, 0, 9] -> 13
    public static int findGreatest(int[] numbers) {

        // TODO
        int greatest = numbers [0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > greatest){
                greatest = numbers[i];
            }
        }

        return greatest;
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    //      ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {

        // TODO
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != n){
                count++;
            }
        }
        int[] result = new int[count];
            int position = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != n){
                result[position] = numbers[i];
                position ++;
            }
        } //theres something wrong but i can't prove it...
        return result;
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    //      ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {

        // TODO
        int count = 0;
        for (int i = 0; i < doubles.length; i++) {
            int num = (int)doubles[i];
            if (doubles[i] - num >= 0.5){
                doubles[i] = num + 1;
            
                count ++;
            }
            else {
                doubles[i] = num;
                count ++;
            }
        }   
        int result[] = new int[count];
            int position = 0;
        for (int i = 0; i < doubles.length; i++){
            int num = (int)doubles[i];
            if (doubles[i]- num >= 0.5){
           // doubles[i] = num + 1;
           int num2 = num + 1;
            result [position] = num2;
                position++;
            }
            else {
                doubles[i] = num;
                result[position] = num;
                position ++;
            }
        }
        return result;
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {

        // TODO
    
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
        if (numbers[i] % 2 == 0){
            count++;
             }
        }
        int position = 0;
        int result[] = new int[count];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                result [position] = numbers[i];
                position++;
            }
        }
        return result;
    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    //      ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {

        // TODO

        return new int[0];
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    //      ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {

        // TODO +5 Bonus
        // HINT: use Arrays.sort()
        int count = 0;
        for(int i = 0; i > first.length; i++){
            count++;
        }

        return new int[0];
    }
}
