package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    //      ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {
        int result = 0;
        // the int starts at index 0
        for(int i = 0; i < numbers.length; i++) {
            result += numbers[i];
            // the loop allows for the code to add the numbers within the array to get a total sum
        }
        return result;
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    //      ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
        // use the for loop to address each indiviual index
        if (numbers[i] < 0) {
            return i;
            // if the number is less than 0, the index position of that number will be returned
        }
    }
        return 0;
    }

    // findGreatest() accepts an array of integers and returns the greatest
    // number found within the array.
    //      ex: [11, 13, -1, 0, 9] -> 13
    public static int findGreatest(int[] numbers) {
        int greatest = numbers[0];
        // a new int type is made to store the greatest number, starting from index 0
        for(int i = 0; i < numbers.length; i++) {
            // for loop to not exceed higher from the array, the positions increase by 1
            if(numbers[i] > greatest) {
                greatest = numbers[i];
                // if the number at the index is greater than the one before,then that would be considered the new greatest index
            }
        }
        return greatest;
        // the position of the greatest number in the array is returned as a result
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    //      ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {
        int count = 0;
        // always start the code at 0
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != n) {
                count++;
                //  if the numbers at the indexes are not 0, 1, 1, or 3, the code will count that as one, and increase as it goes on
            }
        }
        int[] result = new int[count];
        int position = 0;
        // the result will be the new count of the array, with a position starting at 0
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != n) {
                result[position] = numbers[i];
                position++;
                // in this loop, if the numbers[i] isnt equal to n, the index is added to the result and the position is increased
            }
        }

        return result;
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    //      ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {
        int[] result = new int[doubles.length];
        // the numbers in the array are decimals, using a double type and using doubles.length for the length of the given array
        for(int i = 0; i < doubles.length; i++) {
            if(doubles[i] - (int) doubles[i] >= 0.5) {
                result[i] = (int) doubles[i] + 1;
                // if the difference of the original number and the integer of that number is greater than or equal to 0.5, the number rounds up by one to its integer
            } else {
                result[i] = (int) doubles[i];
                // if the different of the original number and the integer of that number is less than 0.5, the number is rounded down to the integer
            }
        }
        return result;
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                count++;
                // if the number in the array is a multiple of 2 and leaving no remainder, then it is added to the new array of evensOnly(), and the count of numbers in the array increases by one
            }
        }
        int[] result = new int[count];
// the result will contain the new array of even numbers
        int position = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                result[position] = numbers[i];
                position++;
                // this rechecks that the numbers in the new array are multiples of 2, meaning that this new array is the result of evensOnly()
            }
        }
        return result;
    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    //      ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {
        int[] result = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] % 10;
            // this loop will take the number at each index and divide it by 10, leaving the last digit of each number in the array
        }
        return result;
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    //      ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        // this command will create an array that contains the same number of indexes as the sum of the first and second arrays
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, 0, second.length);
        // the code merges the first and second arrays into one new array in order
        return result;
    }
}
