package TaskRomanNumerals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        romanToInt("ABDSCSF");
    }

    public static int romanToInt(String s) {
        int result = 0;

        Scanner scannerMyString = new Scanner(s);

        HashMap<String, Integer> myDict = new HashMap<>();

        String rimNamber = scannerMyString.nextLine();
        String[] rimNamber2 = rimNamber.split("");
        for (String el: rimNamber2) {
            System.out.println(el);
        }


        return result;
    }
}
