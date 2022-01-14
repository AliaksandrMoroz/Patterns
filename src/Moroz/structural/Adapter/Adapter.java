package Moroz.structural.Adapter;

public class Adapter {
    String readChars(char[] readChar){
        return String.valueOf(readChar);
    }
    char[] readString(String readString){
        return readString.toCharArray();
    }
}
