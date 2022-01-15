package Moroz.structural.Fasade;

public class Car {
    int speed;
    Transmission transmission =new Transmission();


    void drive(){
        Motor.motorOn();
        if(Motor.startMotor){
            transmission.choseGear(1);
            System.out.println("Car run...");
        }
    }
}
