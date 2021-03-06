package com.company.masya;

import javax.swing.*;

public class MyClass1 {
    // Статическое поле класса:
    static int N1;
    // Нестатическое поле:
    int N2;
    // Конструктор класса:
    MyClass1(int n1,int n2){
        N1=n1;
        N2=n2;
        // Текст для отображения в окне:
        String text="Создан новый объект!\n";
        text+="Статическое поле: "+N1+"\n";
        text+="Нестатическое поле: "+N2;
        // Отображение окна сообщения:
        JOptionPane.showMessageDialog(null,text);}
    // Метод для отображения значений полей:
    void show(){
        // Текст для отображения в окне:
        String text="Поля объекта!\n";
        text+="Статическое поле: "+N1+"\n";
        text+="Нестатическое поле: "+N2;
        // Отображение окна:
        JOptionPane.showMessageDialog(null,text);}
}
class UsingStatDemo{
    public static void main(String[] args){
        // Создание объекта:
        MyClass1 A=new MyClass1(10,200);
        // Изменение значения статического поля
        // (использована ссылка на класс):
        MyClass1.N1=-50;
        // Отображение полей объекта:
        A.show();
        // Создание нового объекта:
        MyClass1 B=new MyClass1(1,2);
        // Отображение полей первого объекта:
        A.show();
        // Изменение статического поля
        // (использована ссылка на объект):
        B.N1=-1;
        // Изменение нестатического поля объекта:
        B.N2=-2;
        // Проверка значений первого объекта:
        A.show();}
}

