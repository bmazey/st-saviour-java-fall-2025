package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    //      ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {

        // TODO
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){ // adds whatever content is at this current postion to the resut variable and at the end, return the result.
            sum = sum + numbers[i];
        }

        return sum;
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    //      ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {

        for(int i = 0; i < numbers.length; i++) {
	        if (numbers[i] < 0) { // if the number were on is less than zero than its a negative number and returns the position that the negative number was found.)
	            return i;
            }
        }
        
        return 0;
    }

    // findGreatest() accepts an array of integers and returns the greatest
    // number found within the array.
    //      ex: [11, 13, -1, 0, 9] -> 13
    public static int findGreatest(int[] numbers) {

        // TODO
        int greatest = numbers[0]; 
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }
        return greatest;
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    //      ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {

        int count = 0;
        for (int num : numbers) {
            if (num != n) { 
                count++;
            }
        }
        // Create a new array of the appropriate size
        int[] result = new int[count];
        int index = 0;

        // Copy all elements that are not equal to n
        for ( int num : numbers) {
            if (num != n) {
                result[index++] = num;
            }
        }

        return result;
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    //      ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {

        // TODO
        int[] results = new int [doubles.length];
        for (int i = 0; i < doubles.length; i++) {
            int num = (int) doubles[i];
            if (doubles[i] - num >= 0.5) {
                results[i] = num + 1; 
        }
        else {
            results[i] = num;
        }
    }
     return results;
    }
    

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {

        // TODO
        // First, count how many even numbers there are
        int count = 0; 
        for (int n : numbers) {
            if (n % 2 == 0) {
                count++;
                }
            }
        // Create a new array and use the correct sizing
        int[] evens = new int[count];
        int index = 0;

        // Fill the new array with even numbers
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens[index++] = num;
            }
        }

        return evens;

    }


    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    //      ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {

        // TODO
        int[] lastDigits = new int[numbers.length];

        // Extract the last digit of each number 
        for (int i = 0; i < numbers.length; i++) {
            lastDigits[i] = numbers[i] % 10; 
        // Gives the last digit 
        }

        return lastDigits;
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    //      ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0, a = 0, b = 0; 

        



        return new int[0];
    }
}
