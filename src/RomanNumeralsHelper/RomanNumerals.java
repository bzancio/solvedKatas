package RomanNumeralsHelper;

public class RomanNumerals {
    public static String toRoman(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n - 1000 >= 0) {
                n -= 1000;
                sb.append("M");
            } else if (n - 900 >= 0) {
                n -= 900;
                sb.append("CM");
            } else if (n - 500 >= 0) {
                n -= 500;
                sb.append("D");
            } else if (n - 400 >= 0) {
                n -= 400;
                sb.append("CD");
            } else if (n - 100 >= 0) {
                n -= 100;
                sb.append("C");
            } else if (n - 90 >= 0) {
                n -= 90;
                sb.append("XC");
            } else if (n - 50 >= 0) {
                n -= 50;
                sb.append("L");
            } else if (n - 40 >= 0) {
                n -= 40;
                sb.append("XL");
            } else if (n - 10 >= 0) {
                n -= 10;
                sb.append("X");
            } else if (n - 9 >= 0) {
                n -= 9;
                sb.append("IX");
            } else if (n - 5 >= 0) {
                n -= 5;
                sb.append("V");
            } else if (n - 4 >= 0) {
                n -= 4;
                sb.append("IV");
            } else {
                n -= 1;
                sb.append("I");
            }
        }
        return sb.toString();
    }

    public static int fromRoman(String romanNumeral) {
        int n = 0;
        char[] chars = romanNumeral.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'M') {
                n += 1000;
            } else if (chars[i] == 'D') {
                n += 500;
            } else if (chars[i] == 'C') {
                if (i + 1 < chars.length && (chars[i + 1] == 'D' || chars[i + 1] == 'M')) {
                    n -= 100;
                } else {
                    n += 100;
                }
            } else if (chars[i] == 'L') {
                n += 50;
            } else if (chars[i] == 'X') {
                if (i + 1 < chars.length && (chars[i + 1] == 'L' || chars[i + 1] == 'C')) {
                    n -= 10;
                } else {
                    n += 10;
                }
            } else if (chars[i] == 'V') {
                n += 5;
            }  else if (chars[i] == 'I') {
                if (i + 1 < chars.length && (chars[i + 1] == 'V' || chars[i + 1] == 'X')) {
                    n -= 1;
                } else {
                    n += 1;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {

    }
}
