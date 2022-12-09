package ui;

import java.awt.*;
import java.util.Objects;

public class ColourPalette {

    public static Color pink = new Color(168, 87, 81);
    public static Color grey = new Color(229, 234, 250);
    public static Color green = new Color(9, 56, 36);
    public static Color black = new Color(4, 3, 3);
    public static Color yellow = new Color(252, 186, 4);
    public static Color red = new Color(165, 1, 4);
    public static Color blue = new Color(8, 103, 136);
    public static Color purple = new Color(181, 157, 164);
    public static Color orange = new Color(255, 143, 46);

    public static Color getColour(String colour) {
        if (Objects.equals(colour, "pink")) {
            return pink;
        } else if (Objects.equals(colour, "green")) {
            return green;
        } else if (Objects.equals(colour, "yellow")) {
            return yellow;
        } else if (Objects.equals(colour, "red")) {
            return red;
        } else if (Objects.equals(colour, "blue")) {
            return blue;
        } else if (Objects.equals(colour, "purple")) {
            return purple;
        } else if (Objects.equals(colour, "orange")) {
            return orange;
        } else if (Objects.equals(colour, "grey")) {
            return grey;
        }else if (Objects.equals(colour, "black")) {
            return black;
        }
        return null;
    }
}
