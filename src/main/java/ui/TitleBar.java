package ui;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    private JButton newTask = new JButton("New Task");
    private JButton newCategory = new JButton("New Category");

    public TitleBar() {
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(ColourPalette.purple);
        JLabel title = new JLabel("To Do List");
        title.setPreferredSize(new Dimension(200, 60));
        title.setFont(new Font("Serif", Font.BOLD, 20));
        title.setHorizontalAlignment(JLabel.CENTER);
        this.add(title);

        // add buttons
        this.add(newTask);
        this.add(newCategory);

        newCategory.addActionListener(e -> CreateCategory.createCategory());
    }
}
