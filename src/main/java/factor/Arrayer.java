package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    //      ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {
        int sum = 0;
        // int is created to remember the sum
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            //make a loop that starts at 0, equal to the length of the array (prevent errors)
            // increment by 1
        }
        return sum;
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    //      ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            //make a loop that starts at 0, equal to the length of the array (prevent errors)
            // increment by 1
            if(numbers[i] < 0) {
                // if the number in any of the positions is less than 0, that number will be printed as a result
                return i;
            }
        }
        return 0;
    }

    // findGreatest() accepts an array of integers and returns the greatest
    // number found within the array.
    //      ex: [11, 13, -1, 0, 9] -> 13
    public static int findGreatest(int[] numbers) {
        int greatest = numbers[0];
        // new array starts at 0
        for(int i = 0; i < numbers.length; i++) {
            //make a loop that starts at 0, equal to the length of the array (prevent errors)
            // increment by 1
            if(numbers[i] > greatest) {
                greatest = numbers[i];
                // the new array will take the numbers at each position and compare it with the previous numbe
                // if that number is greater, itll be compared with the next number until all the numbers in the array are compared
            }
        }
        return greatest;
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    //      ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            //make a loop that starts at 0, equal to the length of the array (prevent errors)
            // increment by 1
            if(numbers[i] != n) {
                count++;
                // if the number in the array is not equal to 2, then it will count as one for the new array
            }
        }
        int[] result = new int[count];
        // the length of the new result is equal to the number of integers in the new array
        int position = 0;
        // keeps track of the postiions of each number
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != n)  {
                // this line makes sure that none of the integers in the new array equal 2
                result[position] = numbers[i];
                position++;
                // this increases the position by 1, making the new array without n (or 2) included
            }
        }
        return result;
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    //      ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {
        int[] result = new int[doubles.length];
        for(int i = 0; i < doubles.length; i++) {
            //make a loop that starts at 0, equal to the length of the array (prevent errors)
            // increment by 1
            int num = (int)doubles[i];
            if (doubles[i] - num >= 0.5){
                result[i] = num + 1;
            }
            else {
                result[i] = num;
            }
        }
        return result;
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {
        int count = 0;
        // starts the array length at 0
        for(int i = 0; i < numbers.length; i++) {
            //make a loop that starts at 0, equal to the length of the array (prevent errors)
            // increment by 1
            if(numbers[i] % 2 == 0) {
                count++;
                // if the number is divisibble by 2, then it is added to the new array
                // increases the count by 1
            }
        }
        int position = 0;
        // keeps track of the postiions of each number
        int result[] = new int[count];
        for(int i = 0; i < numbers.length; i++) {
            //make a loop that starts at 0, equal to the length of the array (prevent errors)
            // increment by 1
            if(numbers[i] % 2 == 0) {
                result[position] = numbers[i];
                position++;
                // if this number is divisible by 2, then its position is remembered and the number is added to the array
            }
        }
        return result;
    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    //      ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {
        int[] result = new int[numbers.length];
        //  makes the new array equal to the inital array
        for(int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] % 10;
        }
        // make a loop that starts at 0, equal to the length of the array (prevent errors)
        // increment by 1
        // % 10 takes away the tens of each digit, leaving the last digit in the new array
        return result;
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    //      ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        Arrays.sort(result);
        // this command sorts the digits in the new array into order
        return result;
    }
}
