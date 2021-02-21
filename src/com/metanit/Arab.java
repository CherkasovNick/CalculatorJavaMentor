package com.metanit;

public class Arab {

    public static int ArabResult(String str, String num1, String num2, int index) {

        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);

        String tt = str.substring(index, index+1);
        int result = 0;
        switch (tt) {
            case "+" -> result = x + y;
            case "-" -> result = x - y;
            case "*" -> result = x * y;
            case "/" -> result = x / y;
            default -> {
                //wrong sym
            }
        }

        return result;

    }

}
