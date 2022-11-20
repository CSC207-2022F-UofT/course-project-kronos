package entities;

import java.io.Serializable;

public abstract class Factory<T> implements Serializable {

    public void addItem(T item){}

    public void removeItem(T item) {}

}