package VigenereCipher;

public class VigenereCipher {
    public String key;
    public String abc;
    public VigenereCipher(String key, String abc) {
        this.abc = abc;
        this.key = key;
    }

    public String encode(String str) {
        int keyLen = key.length();
        int messageLen = abc.length();
        char[] modPassword = new char[messageLen];

        for (int i = 0; i < modPassword.length; i++) {

        }

        int i = 0;
        while (i < keyLen) {

            i++;
        }
        return "";
    }

    public String decode(String str) {
        //...
        return "";
    }

    static void main() {

    }
}
