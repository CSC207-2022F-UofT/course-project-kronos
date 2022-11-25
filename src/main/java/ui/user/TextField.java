package ui.user;

import javax.swing.*;

public class TextField {
    JTextField textField;
    JPasswordField passwordField;


    public JTextField getTextField() {
        // returns the text field(textbox)
        return textField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }



    /**
     * Creates a JTextField
     * @param X
     * @param Y
     * @param boundWidth
     * @param boundHeight
     */
    public void createTextField(int X, int Y, int boundWidth, int boundHeight, JPanel panel) {
        textField = new JTextField();
        textField.setBounds(X,Y,boundWidth,boundHeight);
        panel.add(textField);
    }

    public void createPasswordField(int X, int Y, int boundWidth, int boundHeight, JPanel panel) {
        passwordField = new JPasswordField();
        passwordField.setBounds(X,Y,boundWidth,boundHeight);
        panel.add(passwordField);

    }



}
