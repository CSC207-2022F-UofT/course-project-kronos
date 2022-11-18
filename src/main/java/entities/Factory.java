package entities;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Objects;

public abstract class Factory {
    HashMap<String, Object> items;

    public Factory(){
        this.items = new HashMap<String, Object>();
    }

    public void addItem(Object item){

    }

    public void addItems(){

    }
}
