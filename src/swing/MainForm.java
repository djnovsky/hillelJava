package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 05.04.2016.
 */
public class MainForm extends JFrame {
    private JPanel panel;
    private JButton closeButton;
    private JButton anotherCloseBtn;

    public MainForm() {
        setContentPane(panel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("My first Form");
        setSize(500, 300);
        //pack();

        /* ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        System.exit(0);
        }*/

        ActionListener actionListener = e -> {
            System.out.println("Exiting...");
            System.exit(0);

        };
        closeButton.addActionListener(actionListener);
        anotherCloseBtn.addActionListener(actionListener);


    }

    public static void main(String[] args) {
        new MainForm();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
