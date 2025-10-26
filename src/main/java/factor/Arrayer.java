package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    //      ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];//add number to sum
        }

        // TODO

        return sum;
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    //      ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] <0) { // if the number were on is less than zero than its a negative number and returns the position that the negative number was found.}
                return i;//return its position
            }
    
        }

        // TODO

        return 0;
    }

    // findGreatest() accepts an array of integers and returns the greatest
    // number found within the array.
    //      ex: [11, 13, -1, 0, 9] -> 13
    public static int findGreatest(int[] numbers) {
        int greatest = numbers[0];//assume each number is greatest
            for( int i = 1; i < numbers.length; i++){
            if(numbers[i]> greatest) {// if this number is larger than the previous greatest it is now greatest
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

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != n) {
                count++; //if its not n then count it
            }
        }

        int[] result = new int[count]; //making a new array without n

        int position = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != n) {
                result[position] = numbers[i];
                position++;
            }
        }

        return result;
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    //      ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {
        //turn the double array into int
        int[] rounditup = new int[doubles.length];//create new array

        for(int i =  0; i < doubles.length; i++ ) {
            
            rounditup[i] = (int)Math.round(doubles[i]);//round each number
        }
        
        // TODO

        return rounditup;

        
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {



    
        int count=0;
          int position = 0;
                  for(int i = 0; i < numbers.length; i++) {    
                                  if(numbers[i] % 2 == 0)// if divided by 2 with no remainder its even
                                    {
                                    count++;
                                    }
                    
                }

                int[] result = new int[count];//create new array
                
                
        for(int i = 0; i < numbers.length; i++) {    
                if(numbers[i] % 2 == 0)
                {
                    result[position] = numbers[i];
                    position++;
                }
            }
        


        // TODO

        return result;
    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    //      ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {

        int[] result = new int[numbers.length];//create new array

    for (int i = 0; i < numbers.length; i++) {
        result[i] = numbers[i] % 10;// divide by 10 and get remainder to get last digit
    }

    return result;        
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    //      ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {

        // TODO +5 Bonus
        // HINT: use Arrays.sort()
        int[] result = new int[first.length + second.length];
        for(int i =0; i < first.length; i++){
            result[i] = first[i];//copy first array into new one
        }
        for(int i =0; i < second.length; i++){
            result[i + first.length] = second[i];// put second array after first
        }
        Arrays.sort(result);

        return result;
    }
}
