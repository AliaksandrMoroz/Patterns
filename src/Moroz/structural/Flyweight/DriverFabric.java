package Moroz.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DriverFabric {
    static Map<String,Driver> drivers = new HashMap<>();

    static Driver addDriver(String typeDriver){
        Driver driver = drivers.get(typeDriver);
        if(driver==null){
            switch (typeDriver){
                case "a":
                    driver=new AClassDriver();
                    break;
                case "b":
                    driver=new BClassDriver();
                    break;
                case "d":
                    driver=new DClassDriver();
                    break;
            }
            drivers.put(typeDriver,driver);
        }return driver;
    }
}
