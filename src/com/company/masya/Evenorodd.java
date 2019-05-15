package com.company.masya;
import javax.swing.*;

public class Evenorodd {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Введите число: "));

        String text = a%2==0?"четное":"нечетное";
        JOptionPane.showMessageDialog(null,"Вы ввели "+text+" число!");
    }
}

