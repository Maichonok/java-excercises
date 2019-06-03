package com.company.masya;

import javax.swing.*;
// Класс для записи персональных данных:
class Fellow{
    // Имя:
    String name;
    // Фамилия:
    String surname;
    // Возраст:
    int age;
    // Вес (в килограммах):
    double weight;
    // Конструктор класса:
    Fellow(String name,String surname,int age,double weight){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.weight=weight;
        show();}
    // Метод для отображения сообщения:
    void show(){
        String str="Name: "+name+"\n";
        str+="Surname: "+surname+"\n";
        str+="Age: "+age+" years\n";
        str+="Weight: "+weight+" kg";
        JOptionPane.showMessageDialog(null,str);
    }
}
public class InputArgsDemo {
    public static void main(String[] args){
        // "Считывание" параметров командной строки:
        String name=args[0];
        String surname=args[1];
        int age=Integer.parseInt(args[2]);
        double weight=Double.parseDouble(args[3]);
        // Создание анонимного объекта класса Fellow:
        new Fellow(name,surname,age,weight);
    }
}

