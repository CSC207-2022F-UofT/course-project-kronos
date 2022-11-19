package userui;

import javax.swing.*;

public class Button {

    JButton button;

    public JButton getButton() {
        // returns a button
        return button;
    }

    /**
     * Creates a JButton UI component
     * @param panel
     * @param buttonText
     * @param X
     * @param Y
     * @param boundWidth
     * @param boundHeight
     */
    public void createButton(JPanel panel, String buttonText, int X,
                                     int Y, int boundWidth, int boundHeight) {
        button = new JButton(buttonText);
        button.setBounds(X,Y,boundWidth,boundHeight);
        panel.add(button);
    }

}
