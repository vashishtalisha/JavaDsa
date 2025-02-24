package BinaryTrees;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BST tree=new BST();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        tree.populatesorted(arr);
//        tree.populate(arr);
        tree.display();

    }
}
class Result {
    static final String[] units = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convertToWords(int n) {
        if (n == 0) return "zero";
        return processNumber(n).trim();
    }

    private static String processNumber(int n) {
        if (n == 0) return "";

        if (n < 20) return units[n];
        if (n < 100) return tens[n / 10] + (n % 10 != 0 ? " " + units[n % 10] : "");

        if (n < 1000) return units[n / 100] + " hundred" + (n % 100 != 0 ? " " + processNumber(n % 100) : "");

        if (n < 100000) return processNumber(n / 1000) + " thousand" + (n % 1000 != 0 ? " " + processNumber(n % 1000) : "");

        return processNumber(n / 100000) + (n / 100000 == 1 ? " lakh" : " lakhs") + (n % 100000 != 0 ? " " + processNumber(n % 100000) : "");
    }

    public static void intToWord(int n) {
        System.out.print(convertToWords(n));
    }
}