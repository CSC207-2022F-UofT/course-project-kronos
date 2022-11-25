package userui;

import javax.swing.*;

public class Label {
    JLabel jLabel;

    public JLabel getLabel() {
        // returns a label
        return jLabel;
    }

    /**
     * Creates a label adds it to the Login Page
     * @param panel
     * @param labelText
     * @param boundWidth
     * @param boundHeight
     */
    public void createLabel(String labelText, int boundX, int boundY, int boundWidth, int boundHeight,
                            JPanel panel){
        jLabel = new JLabel(labelText);
        jLabel.setBounds(boundX, boundY, boundWidth, boundHeight);
        panel.add(jLabel);
        }

    }

