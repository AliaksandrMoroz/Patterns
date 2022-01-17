package Moroz.Behavioral.TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class DataBaseReader extends Reader{
    List<String> dataBase = new ArrayList<>();

    void  addList(){
        dataBase.add("Worker{name='Alex'} starting work in CX100");
    }

    @Override
    String readInReader() {
        addList();
        String stringDataBase = "";
        for (String el:
             dataBase) {
            stringDataBase += el;
        }return stringDataBase;
    }
}
