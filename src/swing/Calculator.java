package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 05.04.2016.
 */
public class Calculator extends JFrame {
    private JPanel panel;
    private JTextField input;
    private JButton btn1;
    private JButton btn4;
    private JButton btn7;
    private JButton btnMinus;
    private JButton btnMult;
    private JButton btnEquals;
    private JButton btn8;
    private JButton btn0;
    private JButton btn5;
    private JButton btn2;
    private JButton btn3;
    private JButton btn6;
    private JButton btn9;
    private JButton btnPlus;
    private JButton btnDivide;

    public Calculator() {
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);


        ActionListener listener = new ActionListener() {
            private int value;
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                switch (command){
                    case "+":
                        value = Integer.parseInt(input.getText());
                        input.setText("");
                        break;
                    case "=":
                        int secondValue = Integer.parseInt(input.getText());
                        input.setText(Integer.toString(value+secondValue));
                        break;
                    default:
                        String text = input.getText();
                        input.setText(text+command);
                }
            }
        };


        btn1.addActionListener(listener);
        btn4.addActionListener(listener);
        btn7.addActionListener(listener);
        btnMinus.addActionListener(listener);
        btnMult.addActionListener(listener);
        btnEquals.addActionListener(listener);
        btn8.addActionListener(listener);
        btn0.addActionListener(listener);
        btn5.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);
        btn6.addActionListener(listener);
        btn9.addActionListener(listener);
        btnPlus.addActionListener(listener);
        btnDivide.addActionListener(listener);

       btn1.setActionCommand("1");
       btn4.setActionCommand("4");
       btn7.setActionCommand("7");
       btnMinus.setActionCommand("-");
       btnMult.setActionCommand("*");
       btnEquals.setActionCommand("=");
       btn8.setActionCommand("8");
       btn0.setActionCommand("0");
       btn5.setActionCommand("5");
       btn2.setActionCommand("2");
       btn3.setActionCommand("3");
       btn6.setActionCommand("6");
       btn9.setActionCommand("9");
       btnPlus.setActionCommand("+");
       btnDivide.setActionCommand("/");

        input.setEnabled(false);
//        input.setText("0");

    }

    public static void main(String[] args) {
        new Calculator();
    }


}
