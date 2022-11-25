package ui.user;

import javax.swing.*;

public class Panel {
    JPanel jPanel;

    public JPanel getPanel() {
        // returns the panel
        return jPanel;
    }

    public void createPanel(){
        jPanel = new JPanel();
        jPanel.setLayout(null);
        }

}
