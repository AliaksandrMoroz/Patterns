package Moroz.structural.Fasade;

public class Transmission {
    boolean firstGear;
    boolean secondGear;
    boolean thirdGear;
    boolean fourthGear;
    boolean fivesGear;

    boolean choseGear(int numGear){
        switch (numGear){
            case 1:
                System.out.println("First gear on.");
                return firstGear=true;

            case 2:
                firstGear =false;
                System.out.println("Second gear on.");
               return secondGear=true;

            case 3:
                secondGear=false;
                System.out.println("Third gear on.");
                return thirdGear=true;

            case 4:
                thirdGear=false;
                System.out.println("Fourth gear on.");
                return fourthGear=true;

            case 5:
                fourthGear=false;
                System.out.println("Five gear on.");
                return fivesGear=true;
        }
        return false;
    }
}
