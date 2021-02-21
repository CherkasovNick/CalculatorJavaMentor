package com.metanit;

public class getWay {

    public static int getNextWay(String x, String y) {

        int point1 = 0;
        int point2 = 0;
        int point3 = 0;
        int point4 = 0;
        if (x.equals("1") || x.equals("2") || x.equals("3") || x.equals("4") || x.equals("5") || x.equals("6") ||
                x.equals("7") || x.equals("8") || x.equals("9") || x.equals("10")) {
            point1 = 2;
        }

        if (y.equals("1") || y.equals("2") || y.equals("3") || y.equals("4") || y.equals("5") || y.equals("6") ||
                y.equals("7") || y.equals("8") || y.equals("9") || y.equals("10")) {
            point2 = 2;
        }

        if (x.equals("I") || x.equals("II") || x.equals("III") || x.equals("IV") || x.equals("V") || x.equals("VI") ||
                x.equals("VII") || x.equals("VIII") || x.equals("IX") || x.equals("X")) {
            point3 = 5;
        }

        if (y.equals("I") || y.equals("II") || y.equals("III") || y.equals("IV") || y.equals("V") || y.equals("VI") ||
                y.equals("VII") || y.equals("VIII") || y.equals("IX") || y.equals("X")) {
            point4 = 5;
        }

        return point1 + point2 + point3 + point4;

    }
}
