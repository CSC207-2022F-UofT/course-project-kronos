package Entities;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Objects;

public abstract class Factory {
    HashMap<String, T> items;

    public Factory(){
        this.items = new HashMap<String, T>();
    }

    public void addItem(T item){

    }

    public void addItems(){

    }
}
