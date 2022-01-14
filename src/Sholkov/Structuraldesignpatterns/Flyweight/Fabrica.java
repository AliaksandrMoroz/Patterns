package Sholkov.Structuraldesignpatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {

    static Map<Integer, Tableware> kladovka = new HashMap<>();

    public static Tableware getWare(int k) {
        Tableware q = kladovka.get(k);
        if ( q == null){
            switch (k){
                case 1:
                    q = new Pan();
                    break;
                case 2:
                    q = new Kettle();
                    break;
                case 3:
                    q = new Duckling();
                    break;
                default:
                    System.out.println("There is no such dish");
            }
            kladovka.put(k, q);
        }
        return q;
    }
}
