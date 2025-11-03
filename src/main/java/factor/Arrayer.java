package factor;

import java.util.Arrays;
//Okay so boom, Summation requires us to create a code that adds up all the numbers
public class Arrayer {
    public static int summation(int[] numbers) {

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        return result;
    }

//This is Finding negative, all the comments are weird!

    public static int findNegative(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return i;
            }
        }

        return 0;
    }

    //      ex: [11, 13, -1, 0, 9] -> 13
    public static int findGreatest(int[] numbers) {
        int greatest = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }

        return greatest;
    }

    //    
    public static int[] remove(int[] numbers, int n) {
        int count = 0;
        for (int num : numbers) {
            if (num != n) count++;
        } 
        int[] result = new int[count];
        int index = 0;
        for (int num : numbers) {
            if ( num != n) {
                result[index]= num;
                index++;
            }
        }
        return result;
    }


    public static int[] roundUp(double[] doubles) {
        int[] result = new int[doubles.length];
        for (int i = 0; i < doubles.length; i++) {
            result[i] = (int) Math.round(doubles[i]);
        }

        return result;
    }

    public static int[] evensOnly(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int[] evens = new int[count];
        int index = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens[index] = num;
                index++;
            }
        }
        return evens;
    }

    public static int[] lastOfFourDigits(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] % 10;
        }
        return result;
    }


    public static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length]; 
            for (int i = 0; i < first.length; i++) {
                merged[i] = first[i];
            }
            for (int j = 0; j < second.length; j++) {
                merged[j] = second[j];
            }
            Arrays.sort(merged);
        return merged;
    }
}
