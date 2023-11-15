import java.util.Arrays;

public class Main {
public static void main(String[] args){
    int[] array1 = new int[] {1,2,3,4,5};
    int[] array2 = new int[] {6,7,8,9,10};
    combine(array1, array2);
    zip(array1, array2);
}
    /**
     * Given two arrays of integers, write a method called combine that combines the two arrays into one larger array.
     * The method combine will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10,12,14,16};
     * zip(myArray1, myArray2) → {1,3,5,7,9,2,4,6,8,10,12,14,16}
     */
    public static int[] combine(int[] array1, int[] array2) {
    int[] array3 = new int[array1.length + array2.length];
    for (int i = 0; i<array1.length; i++){
        array3[i]=array1[i];
    }
    for (int i = 0; i<array2.length; i++){
        array3[array1.length+i]=array2[i];
    }
    System.out.println(Arrays.toString(array3));
        return array3;

    }

    /**
     * Given two arrays of integers of equal length, write a method called zip that zips together all elements in each array into one larger array.
     * The method zip will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};
     * zip(myArray1, myArray2) → {1,2,3,4,5,6,7,8,9,10}
     */
    public static int[] zip(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int j = 0;
        for (int i = 0; i<array3.length; i+=2){
            array3[i]=array1[j];
            j++;
        }
        j=0;
        for (int i = 1; i<array3.length; i+=2){
            array3[i]=array2[j];
            j++;
        }
        System.out.println(Arrays.toString(array3));
        return array3;
    }

    /**
     * Given two arrays of integers of equal length, write a method called product that multiplies each element in the first array by the element at the corresponding index in the second array.
     * The method product will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};=
     * product(myArray1, myArray2) → {2,12,30,56,90}
     */
    public static int[] product(int[] array1, int[] array2) {
    int[] array3 = new int[array1.length];
    for (int i = 0; i<array3.length; i++){
        array3[i]=array1[i]*array2[i];
    }
        return array3;

    }

    /**
     * Given an array of Strings, write a method called capitalCount that calculates the number of capital letters in each String and stores them into an array.
     * The method capitalCount will return a new one dimensional array of integers.
     * There is a catch - you are required to implement *two* methods in order to solve this problem.
     * One of these methods (countCapitalLetters) will be a helper method and will perform the task of counting and returning how many capital letters are in a single word.
     * In other words, the method capitalCount will call (or use) the method countCapitalLetters in order to achieve the desired output.
     * Hint: You can use the statement Character.isAlphabetic( … ) to determine whether a character is an alphabetic character.
     *
     * Method: capitalCount
     * Helper method: countCapitalLetters
     *
     * Hint: 'A' = 65 and 'Z' = 90
     *
     * String[] words = {“Christmas”, “IS”, “comInG”, “!”};
     * capitalCount(words) → {1, 2, 2, 0}
     */
    public static int[] capitalCount(String[] words) {
        int[] array1 = new int[words.length];
        for(int i = 0; i<words.length; i++){
           array1[i] = countCapitalLetters(words[i]);
        }
        return array1;

    }

    public static int countCapitalLetters(String word) {
        int count = 0;
        for(int i = 0; i<word.length(); i++){
            int num = (int) word.charAt(i);
            if(num>=65 && num<=90) count++;
        }
        return count;

    }

}
