package com.metanit;

public class FirstExeption extends Exception {

    public FirstExeption(String message) {
        super(message);
    }

    public static class WrongSym extends Exception {

        public WrongSym(String message) {
            super(message);
        }
    }

    public static class WrongSym2 extends Exception {

        public WrongSym2(String message) {
            super(message);
        }
    }
}
