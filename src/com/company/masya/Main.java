package com.company.masya;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        /* int a,b;
        String str;

        a = Integer.parseInt(JOptionPane.showInputDialog("Введите число a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Введите число b:"));

        if (a>b) {

        str = "Максимальное число: " + a;
    }
        else {
            str = "Максимальное число: " + b;
        }
    JOptionPane.showMessageDialog(null,str);
    }
}
*/
        int a, b;
        String str = "";

        JPanel myPanel = new JPanel();
        JTextField field1 = new JTextField(10);

        JTextField field2 = new JTextField(10);

        myPanel.add(field1);
        myPanel.add(field2);
        JOptionPane.showMessageDialog(null, myPanel);

        // field1.getText() - получение текста из поля field1
        a = Integer.parseInt(field1.getText());
        // field2.getText() - получение текста из поля field2
        b = Integer.parseInt(field2.getText());

        if (a > b) {
            str = "Максимальное число: " + a;
        }
        else {
            str = "Максимальное число: " + b;
        }
        JOptionPane.showMessageDialog(null,str);

    }
}
