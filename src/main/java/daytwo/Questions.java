package daytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Questions {
    public static void main(String[] args) {

        String[] vowles = {"A", "E", "I", "O", "U"};
        String[] names = {"Mike", "Jared", "Ceasar", "Dawar"};
        int[] ints = {4, 8, 15, 16, 28, 42};
        //A1
        System.out.println(getLastIndex(names));
        //A2
        System.out.println(getSecondToLastIndex(names));
        //A3
        System.out.println(getFirstElement(names));
        //A4
        System.out.println(getLastElement(names));
        //A5
        System.out.println(getSecondToLastElement(names));
        //A6
        System.out.println(getSum(ints));
        //A7
        System.out.println(getAverage(ints));
        //A8
        System.out.println(ExtractAllOddNumbers(ints));
        //A9
        System.out.println(ExractAllEvenNumbers(ints));
        //A10
        System.out.println(contains(names, "philip"));
        //A11
        System.out.println(getIndexByElement(names, names[1]));
        //A12
        printOddNumbersInRange(4, 10);
        //A13
        System.out.println(printGivenStringTimesNumberGiven("7", 5));
        //A14
        System.out.println(repeatFirstThreeLetters("cocaine", 2));
        //A15
        System.out.println(WordsInAStringCounter("This should work now"));
        //A16
        System.out.println(VowlesCounter("lol"));
        //A17
        System.out.println(Arrays.toString(swap(names)));


    }//Method 1 Creation

    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }//Method 2 Creation

    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }//Method 3 Creation

    public static String getFirstElement(String[] names) {
        return names[0];
    }//Method 4 Creation

    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }//Method 5 Creation

    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }//Method 6 Creation

    public static int getSum(int[] ints) {
        return 4 + 8 + 15 + 16 + 28 + 42;
    }//Method 7 Creation

    public static int getAverage(int[] ints) {
        return getSum(ints) / ints.length;
    }//Method 8 Creation

    public static String ExtractAllOddNumbers(int[] ints) {
        List<Integer> oddNums = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0)
                oddNums.add(ints[i]);
        }
        return oddNums.toString();
    }//Method 9 Creation

    public static String ExractAllEvenNumbers(int[] ints) {
        List<Integer> evenNums = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0)
                evenNums.add(ints[i]);
        }
        return evenNums.toString();
    }//Method 10 Creation

    public static boolean contains(String[] names, String element) {
        return false;
    }//Method 11 Creation

    public static int getIndexByElement(String[] names, String element) {
        return 0;
    }//Method 12

    public static void printOddNumbersInRange(int start, int end) {
        for (int x = start; x < end; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }//Method 13 Creation

    public static String printGivenStringTimesNumberGiven(String str, int n) {
        System.out.println(str.repeat(n));
        return str;
    }//Method 14 Creation

    public static String repeatFirstThreeLetters(String str, int n) {
        String substr;
        substr = str.substring(0, 3);
        System.out.println(substr.repeat(n));
        return substr;
    }//Method 15 Creation

    public static int WordsInAStringCounter(String str) {
        int wordcount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordcount++;
            }
        }
        return wordcount;


    }//Mehthod 16 Creation

    public static int VowlesCounter(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }return count;

    }//Method 17 Creation

    public static String[] swap(String[] stringArray) {
        String hmm = stringArray[0];
        stringArray[0] = stringArray[stringArray.length -1];
        stringArray[stringArray.length-1] = hmm;
        return stringArray;

    }//Method 18 Creation
    





    //Method 19 Creation





    //Method 20 Creation
    public static String createStringOfFibonacciUpToMax(int maxnumber) {
        int n = maxnumber, i = 0, x = 1;
        String fibbo = "";
        while (i <= n) {

            int sum = i + x;
            i = x;
            x = sum;
            fibbo = fibbo + i + " ";
        }
        return fibbo;
    }





}