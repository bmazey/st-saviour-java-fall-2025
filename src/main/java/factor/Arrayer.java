package factor;

import java.util.Arrays;

public class Arrayer {

    // return the sum of all integers within the array.
    //      ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    // returns the index of the first negative number.
    //      ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {
        for(int i = 0; i < numbers.length; i ++) {
            if (numbers[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    // returns the greatest number in the array.
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

    // remove all occurences of a given number from the array.
    //      ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != n) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        // copy numbers that do not equal to n.
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] != n) {
                result[index] = numbers[i];
                index++;
            }
        }

        return result;
    }

    // rounds each double to the nearest whole number.
    // rounds up if the decimal part is 0.5 or greater
    //      ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {
        int[] result = new int[doubles.length];
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] - (int)doubles[i] >= 0.5) {
                result[i] = (int)doubles[i] + 1;
            }   else {
                result[i] = (int)doubles[i];
            }
        }
        return result;
    }

    // returns a new array containing even numbers only.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {
        int count = 0;

        //count even numbers.
        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        //count even numbers.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 ==0) {
                result[index] = numbers[i];
                index++;
            }
        }
        return result;
    }

    // returns a new array with the last digit of each number.
    //      ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] % 10;
        }
        return result;
    }

    // merges two sorted arrays into one sorted array.
    //      ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {
       int[] result = new int[first.length + second.length];

       // copy first array.
       for(int i = 0; i < first.length; i++) {
            result[i] = first[i];
       }

       // copy second array.
       for(int i = 0; i < second.length; i++) {
            result[first.length + i] = second[i];
       }

       // sort the merged array.
        Arrays.sort(result);

        return result;
    }
}
