package Detskiy.Structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Fabric {

   static Map <Integer,Transport> Catalog =  new HashMap<>();

    public static Transport getTransport(int key,String dest){
        Transport current = Catalog.get(key);
        if (current==null){
            switch (key){
                case 1:
                    current=new Bus(dest);
                    break;
                case 2:
                    current=new Tram(dest);
                    break;

                case 3:
                current =new Car(dest);
                break;

                default:
                   break;

            }
            Catalog.put(key,current);
        }
        return  current;
    }


}
