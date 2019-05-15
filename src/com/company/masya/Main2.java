package com.company.masya;
import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {
        int a;
        String str = "";

        a = Integer.parseInt(JOptionPane.showInputDialog("Введите число: "));


        if (a == 0) {

            str = "Вы ввели: " + a;
        }

        if (a > 0) {
            str = "Положительное число: " + a;
        }

        if (a < 0){
            str = "Отрицательное число: " + a;
        }
        JOptionPane.showMessageDialog(null,str);
    }
}

