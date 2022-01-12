package Moroz.Factory;

public class Factory {
    Person person;


    public Factory(Person person) {
        this.person = person;
    }

     String addFruit(){

         Fruit fruit;
         if(this.person.cash>5){
             fruit = new Banana();
         }else {
             fruit = new Apple();
         }
         return fruit.toString();


     }
}
