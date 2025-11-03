package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    //      ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {

        //creates a variable called result and sets it equal to 0
        int result = 0;

        //goes through each term in the list, adds each term to the result, and then returns that sum 
        for(int i = 0; i < numbers.length; i++){
            result += numbers[i];
        }

        return result;
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    //      ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {

        //goes through each item in the list until it finds a negative number. Then it returns its index, i
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < 0){
                return i; 
            }
        }

        return 0;
    }

    // findGreatest() accepts an array of integers and returns the greatest
    // number found within the array.
    //      ex: [11, 13, -1, 0, 9] -> 13
    public static int findGreatest(int[] numbers) {

        // goes through each item of the list, replaces the variable greatest with any number that is greater than all of the ones before it, and then returns the greatest number
        int greatest = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > greatest){
                greatest = numbers[i];
            }
        }

        return greatest;
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    //      ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {

        //counts all of the integers tha are not n and uses that number to calculate the size of the new list
        int notn = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != n){
                notn++;
            }
        }
        //creates a new list called result, goes through the original numbers list and adds everythign that is not equal to n to the result list
        int[] result = new int[notn];
        int c = 0;

        for(int a = 0; a < numbers.length; a++){
            if (numbers[a] != n){
                result[c] = numbers[a];
                c++;
                
            }

        }

        return result;
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    //      ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {
        
        //creates a new list called result, rounds every number in the doubles list, and adds those roundned numbers to the result
        int result[] = new int[doubles.length];

        for(int i = 0; i < doubles.length; i++){
            result[i] = (int)(doubles[i] + 0.5);
        }

        return result;
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {
        
        //counts sthe number of even terms in the list to decide the length of the new list
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if((numbers[i] % 2) == 0){
                count++;
            }
        }
        //goes through the numbers list and adds every term that is even to a new list called result
        int result[] = new int[count];
        int c = 0;


        for(int a = 0; a < numbers.length; a++){
            if ((numbers[a] % 2) == 0 ){
                result[c] = numbers[a];
                c++;
                
            }

        }

        return result;

    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    //      ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {

        //when a number is divided by 10, the remainder will always be its last digit
        //goes through the list and uses modulo to calculate the last digits of each number and add them to a new list called result
        int[] result = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            result[i] = numbers[i] % 10;
        }

        return result;
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    //      ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {
        
        //creates a new list with a length equal to the sum of the two original lists
        int combination[] = new int[first.length + second.length];
        //adds the numbers in the first list to the new lsit
        for(int i = 0; i < first.length; i++){
            combination[i] = first[i];
        }
        //adds the numbers in the second list to the new list
        for(int i = 0; i < second.length; i++){
            combination[((first.length)+ (i+1))] = second[i];
        }
        //returns a sorted version of the combined list
        Arrays.sort(combination);
        return combination;
    }

}
