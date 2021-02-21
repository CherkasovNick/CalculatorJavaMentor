package com.metanit;

public class Roman {

    public static String RomanResult(String op, String x, String y, int index) {

        int num1 = getFirstNum(x);
        int num2 = getSecondNum(y);
        int result = getResult(index, op, num1, num2);
        String romanResult = RomanNumbers.getRomanResult(result);
        return romanResult;
    }

    public static int getFirstNum(String str1) {

        int num1 = 0;
        switch (str1) {
            case "I" -> num1 = 1;
            case "II" -> num1 = 2;
            case "III" -> num1 = 3;
            case "IV" -> num1 = 4;
            case "V" -> num1 = 5;
            case "VI" -> num1 = 6;
            case "VII" -> num1 = 7;
            case "VIII" -> num1 = 8;
            case "IX" -> num1 = 9;
            case "X" -> num1 = 10;

            }
            return num1;
        }


    public static int getSecondNum(String str2) {

        int num2 = 0;
        switch (str2) {
            case "I" -> num2 = 1;
            case "II" -> num2 = 2;
            case "III" -> num2 = 3;
            case "IV" -> num2 = 4;
            case "V" -> num2 = 5;
            case "VI" -> num2 = 6;
            case "VII" -> num2 = 7;
            case "VIII" -> num2 = 8;
            case "IX" -> num2 = 9;
            case "X" -> num2 = 10;

        }
        return num2;
    }
    public static int getResult(int index, String str, int x, int y) {

        String tt = str.substring(index, index+1);
        int result = 0;
        switch (tt) {
            case "+" -> result = x + y;
            case "-" -> result = x - y;
            case "*" -> result = x * y;
            case "/" -> result = x / y;

        }
        return result;

    }

}

