package sazhin.structural.bridge;

public class Main {
    public static void main(String[] args){
        ITV tv = new SonyTV();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        lrc.turnOn();
        lrc.setChannelKeyboard(100);
        lrc.turnOff();
    }
}
