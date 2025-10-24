package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    //      ex: [0, 2, -1, 15] -> 16
    // In this one this is creating a loop and adding all the values of the numbers in the loop.
    public static int summation(int[] numbers) {

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    //      ex: [11, 13, -1, 0, 9] -> 2
    // This is creating a loop and stating if a number is less than 0 return that number's position.
    public static int findNegative(int[] numbers) {
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    // findGreatest() accepts an array of integers and returns the greatest
    // number found within the array.
    //      ex: [11, 13, -1, 0, 9] -> 13
    // This one is creating a loop asking for greatest and saying if the number is greater than the rest return that number.
    public static int findGreatest(int[] numbers) {

        int greatest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }
        return greatest;
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    //      ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    // This is creating a loop and saying if a number does not equal n do not print it.
    public static int[] remove(int[] numbers, int n) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != n) {
                count++;
            }
        }

        int[] result = new int[count];
        int position = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != n) {
                result[position] = numbers[i];
                position++;
            }
        }

        return result;
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    //      ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    // This is rounding out numbers so if less than .4 rounding down just printing the whole number if .5 and above adding a number so it goes up.
    public static int[] roundUp(double[] doubles) {

         int[] result = new int[doubles.length];

        for (int i = 0; i < doubles.length; i++) {
         if (doubles[i] - (int) doubles[i] >= 0.5) {
                result[i] = (int) doubles[i] + 1; 
          } else { 
            result[i] = (int) doubles[i]; 
          }
        }
        return result; 
    }
    
    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    // This one is creating a loop and saying cause evens have no remainders if no remainder print.
    public static int[] evensOnly(int[] numbers) {

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        int[] evens = new int[count];
        int position = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens[position] = numbers[i];
                position++;
            }
        }
        return evens;
    }
    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    //      ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    // This is basically creating a loop and making sure the number is less than 10 by using modulo so it removes the numbers in the front.
    public static int[] lastOfFourDigits(int[] numbers) {

        int[] lastDigits = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            lastDigits[i] = numbers[i] % 10;
        }

        return lastDigits;
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    //      ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {

        int[] result = new int[first.length + second.length];
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        Arrays.sort(result);

        return result;

    }
}
