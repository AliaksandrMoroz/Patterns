package Moroz.structural.Fasade;

public class Motor {
   static Transmission transmission= new Transmission();
   static boolean startMotor;


    public static boolean motorOn(){
        if(transmission.firstGear ==false){
        return startMotor=true;
        }
        return false;
    }
    public static boolean motorOff(){
        return startMotor=false;
    }
}
