package entities;

import java.util.HashMap;

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
