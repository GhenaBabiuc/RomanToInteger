package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("CM"));
    }

    public static int romanToInt(String s) {
        int n = 0, length = s.length();
        for (int i = 0; i < length; i++) {
            if (charToInt(s.charAt(i)) < charToInt(s.charAt((i + 1) == length ? i : i + 1))) {
                n += charToInt(s.charAt(i + 1)) - charToInt(s.charAt(i));
                i++;
            } else {
                n += charToInt(s.charAt(i));
            }
        }
        return n;
    }

    public static int charToInt(char a) {
        switch (a) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
            default -> {
                return 0;
            }
        }
    }
}