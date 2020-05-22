package codeenginestudio.thuy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        String inputString = "is2 Thi1s first4 J5ava T6est 3the";
        String[] inputArray = splitStringtoArray(inputString);
        String ouput = convertArrayToString(sortStringContainsNumber(inputArray));
        System.out.println("Output: " +ouput);
    }

    public static String convertArrayToString(String[] arraytoConvertString) {
        String stringConverted = String.join(" ", arraytoConvertString);
        return stringConverted;
    }

    public static int getNumberfromString(char[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            String numberinString = String.valueOf(stringArray[i]);
            if (isNumeric(String.valueOf(stringArray[i])) == true) {
                return Integer.parseInt(numberinString);
            }
        }
        return 0;
    }

    public static String findElement(String[] stringArray, int numberfromString) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].contains(""+ numberfromString)) {
                return stringArray[i];
            }
        } return null;
    }

    public static boolean isNumeric(String stringArray) {
        try {
            Double.parseDouble(stringArray);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String[] splitStringtoArray(String inputArray) {
        String[] newStringArray = inputArray.split("\\s");
        return newStringArray;
    }

    public static String[] sortStringContainsNumber(String[] inputArray) {
        String[] newStringArray = new String[inputArray.length];
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            char[] intArray = inputArray[i].toCharArray();
            int number = getNumberfromString(intArray);
            numList.add(number);
        }
        Collections.sort(numList);
        for (int i = 0; i < numList.size(); i++) {
            newStringArray[i] = findElement(inputArray,numList.get(i));
        }
        return newStringArray;
    }
}