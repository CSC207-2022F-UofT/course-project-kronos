package userui;

import javax.swing.*;

public class textArea {
    public JTextArea TextArea;

    public void createTextArea(JFrame loginPage, String textarea, int x, int y, int width, int height) {
        TextArea = new JTextArea(textarea);
        TextArea.setBounds(x, y, width, height);

        loginPage.add(TextArea);
    }
}
