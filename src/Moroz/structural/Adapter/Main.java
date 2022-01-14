package Moroz.structural.Adapter;

public class Main {
    public static void main(String[] args) {
        String testString = "testString 123";
        char[] testArrayChar= {'t','e','s','t',' ','a','r','r','a','y',' ','c','h','a','r'};
        ClassReadStrings.print(new Adapter().readChars(testArrayChar));
        ClassReadCharArray.print(new Adapter().readString(testString));
    }
}
