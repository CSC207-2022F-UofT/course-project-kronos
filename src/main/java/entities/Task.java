package entities;

import java.util.Date;
import java.util.Iterator;

public class Task implements Iterable{
    public String name;
    private boolean complete;
    private boolean reminders;
    private boolean visibility;
    private String colour;
    private Category taskCategory;
    private Date deadline;

    public Task(){

    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
