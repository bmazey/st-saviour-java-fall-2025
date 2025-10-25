package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    //      ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {

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

        int greatest = numbers[0];
            //create an int to store the previous number, and make it start at 0
        for (int i = 0; i < numbers.length; i++){
            //index starts at 0, index cannot exceed the length of the array, 
            //index increments by 1 every cycle
            if (numbers[i] > greatest){
                greatest = numbers[i];
                // if the number we're on is greater than the previous number, 
                //update greatest to be the number we're on
            }
        }
        return greatest;
            //returns the greatest number in the array
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    //      ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {

        int count = 0;
            //create an int to get the length of the new array
        for (int i = 0; i < numbers.length; i++){
            //index starts at 0, index cannot exceed the length of the array, index increments by 1
            if (numbers[i] != n){
                count++;
                // count increments by one if the number we're on is not n
            }
        }
        int[] result = new int[count];
            //create an int array to save the numbers that aren't n, make it equal to an array with the saame length as count
            int position = 0;
                //create a new int to track the position of the numbers
        for (int i = 0; i < numbers.length; i++){
            //index starts at 0, i cannot exceed the length of the array, i increments by 1
            if (numbers[i] != n){
                result[position] = numbers[i];
                position++;
                    //copy the position of each number into result if the number we're on is not n
                    //increment position by 1
            }
        }
        return result;
            //return the new array without n
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    //      ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {

        int[] result = new int[doubles.length];
            //create an int array to save the rounded values, make it equal to an array with the same length
        for (int i = 0; i < doubles.length; i++) {
            //index starts at 0, index cannot exceed the length of the array, index increments by 1
            int num = (int)doubles[i];
            //create an int to save the whole number part of the number we're on
            if (doubles[i] - num >= 0.5){
                result[i] = num + 1;
            }
            else {
                result[i] = num;
            }
                //subtract the number we're on by the whole number part to get a decimal less than one
                //if it's greater than 0.5, take the whole number part and add 1
                //if it's less than 0.5, return just the whole number part
        }   
        return result;
            //return the new array with the rounded integers
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {

        int count = 0;
        //create an int to store the length of the new array
        for (int i = 0; i < numbers.length; i++){
            //index starts at 0, index cannot exceed the length of the numbers array, i increments by 1
        if (numbers[i] % 2 == 0){
            count++;
             }
             //count increases by 1 if the number we're on is divisible by 2
        }
        int position = 0;
            //create an int to track the position of each digit
        int result[] = new int[count];
            //create a new array equal to the length of count
        for(int i = 0; i < numbers.length; i++){
            //index starts at 0, index cannot exceed the length of the numbers array, 
            //index increments by 1
            if(numbers[i] % 2 == 0){
                result [position] = numbers[i];
                position++;
                //when the number is divisible by 2, 
                //copy the position of the number we're on into result
                //increment the position by 1
            }
        }
        return result;
            //return the array with all of the even numbers 

    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    //      ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {

        int[] result = new int[numbers.length];
            //create an array that is equal to the length of numbers
        for(int i = 0; i < numbers.length; i++){
            //index starts at 0, index cannot exceed the length of the numbers array, 
            //index increments by 1
            result[i] = numbers[i] % 10;
                //modulo 10 will extract the tens from the digits 
                //to leave the last digit alone
        }
        return result;
            //return the array only with th last digits of each number
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    //      ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {
        // HINT: use Arrays.sort()

        int[] result = new int[first.length + second.length];
            //create a new array that is equal to the combined length of both arrays
        System.arraycopy(first, 0, result, 0, first.length);
            //copy the numbers in first to result
        System.arraycopy(second, 0, result, first.length, second.length);
            //copy the numbers in second to result, starting from the last number of first
       Arrays.sort(result);
            //sorts array from least to greatest
            return result;
            //return an array with all of the numbers of first and second sorted
    }
}
