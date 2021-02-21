package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите операцию: ");
        String op = getOperation();
        int index = getIndex(op);
        if (index == 0) {
            return;
        }
        String x = getFirstNum(op, index);
        String y = getSecondNum(op, index);
        int way = getWay.getNextWay(x, y);
        if (way == 0 || way == 2 || way == 5) {
            try {
                throw new FirstExeption("Введены недопустмые символы/введенные числа не входят в условный диапазон!");
            } catch (FirstExeption firstExeption) {
                firstExeption.printStackTrace();
            }

        } else if (way == 7) {
            try {
                throw new FirstExeption.WrongSym("Недопустимая операция между арабскими и римскими числами!");
            } catch (FirstExeption.WrongSym wrongSym) {
                wrongSym.printStackTrace();
            }


        } else if (way == 10) {
            System.out.println(Roman.RomanResult(op, x, y, index));

        } else if (way == 4) {
            System.out.println(Arab.ArabResult(op, x, y, index));

        }
    }

    public static String getOperation() {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        return str.replace(" ", "");
    }

    public static int getIndex(String str) {

        if (str.contains("++")) {
            try {
                throw new FirstExeption.WrongSym2("Ошибка при введении символов операции!");
            } catch (FirstExeption.WrongSym2 wrongSym2) {
                wrongSym2.printStackTrace();
            }
            return 0;

        } else if (str.contains("--")) {
            try {
                throw new FirstExeption.WrongSym2("Ошибка при введении символов операции!");
            } catch (FirstExeption.WrongSym2 wrongSym2) {
                wrongSym2.printStackTrace();
            }
            return 0;

        } else if (str.contains("**")) {
            try {
                throw new FirstExeption.WrongSym2("Ошибка при введении символов операции!");
            } catch (FirstExeption.WrongSym2 wrongSym2) {
                wrongSym2.printStackTrace();
            }
            return 0;

        } else if (str.contains("//")) {
            try {
                throw new FirstExeption.WrongSym2("Ошибка при введении символов операции!");
            } catch (FirstExeption.WrongSym2 wrongSym2) {
                wrongSym2.printStackTrace();
            }
            return 0;
        }

        int index = 0;
        if (str.contains("+")) {
            index = str.indexOf("+");
        } else if (str.contains("-")) {
            index = str.indexOf("-");
        } else if (str.contains("*")) {
            index = str.indexOf("*");
        } else if (str.contains("/")) {
            index = str.indexOf("/");
        } else {
            try {
                throw new FirstExeption.WrongSym("Введены недопустимые символы!");
            } catch (FirstExeption.WrongSym wrongSym) {
                wrongSym.printStackTrace();
            }
        }

        return index;
    }

    public static String getFirstNum(String str1, int index) {

        return str1.substring(0, index);

    }

    public static String getSecondNum(String str1, int index) {

        return str1.substring(index + 1);
    }

}








