package codeenginestudio.thuy;

public class Exercise1 {

    public static void main(String args[]) {

        String s1 = "is2 Thi1s T4est 3a";

        String[] sArray = splitString(s1);

        int[] newArray = new int[sArray.length];

        for (int i = 0; i < sArray.length; i++) {

            char[] intArray = sArray[i].toCharArray();

            System.out.println(intArray);

            System.out.println(getNumberfromString(intArray));
        }

    }

    public static int getNumberfromString(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isNumeric(String.valueOf(array[i])) == true) {
                return Integer.parseInt(String.valueOf(array[i]));
            }
        }
        return 0;
    }

    public static String[] splitString(String input) {
        String[] newString = input.split("\\s");
        return newString;
    }


    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
