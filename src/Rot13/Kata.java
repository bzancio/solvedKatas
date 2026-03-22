package Rot13;

public class Kata {
    public static String rot13(String str) {
        char[] characters = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : characters) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                if (c >= 'A' && c <= 'Z') {
                    if (c > 'M') {
                        stringBuilder.append((char) (c - 13));
                    } else stringBuilder.append((char) (c + 13));
                } else {
                    if (c > 'm') {
                        stringBuilder.append((char) (c - 13));
                    } else stringBuilder.append((char) (c + 13));
                }
            } else stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(rot13("abcdefghijklmnopqrstuvwxyz"));
    }
}
