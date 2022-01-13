package sazhin.structural.adapter;

public class AdapterTest {
    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.getAppleColor("green");

        Orange orange = new Orange();
        AppleAdapter adapter = new AppleAdapter(orange);
        adapter.getAppleColor("red");
    }

}
