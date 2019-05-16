package com.company.masya;

import javax.swing.*;
// Описание класса:
class MyClass5{
    int num;
    char symb;
    String text;
    // Конструктор класса без аргументов:
    MyClass5(){
// Заполнение полей:
        set();
        // Отображение сообщения с информацией об объекте:
        showText();
    }
    // Конструктор класса с целочисленным аргументом:
    MyClass5(int n){
        // Заполнение полей:
        set(n);
        // Отображение сообщения с информацией об объекте:
        showText();
    }
    // Конструктор класса с символьным аргументом:
    MyClass5(char s){
        // Заполнение полей:
        set(s);
        // Отображение сообщения с информацией об объекте:
        showText();
    }
    // Конструктор класса с тремя аргументами:
    MyClass5(int n,char s,String str){
        // Заполнение полей:
        set(n,s,str);
        // Отображение сообщения с информацией об объекте:
        showText();
    }
    // Метод класса для отображения сообщения:
    void showText(){
        // Локальная текстовая переменная:
        String str="Значения полей объекта:\n";
        // Формирование результата (значения локальной переменной):
        str+="num="+num+"\n";
        str+="symb="+symb+"\n";
        str+="text="+text;
        // Метод отображает окно сообщения:
        JOptionPane.showMessageDialog(null,str);}
    // Метод класса для присваивания значений полям (нет
// аргументов):
    void set(){
        // Заполнение полей:
        num=0;
        symb='a';
        text="Нет аргументов.";}
    // Метод класса для присваивания значений полям (целочисленный
// аргумент):
    void set(int n){
        // Заполнение полей:
        num=n;
        symb='b';
        text="Целочисленный аргумент.";}
    // Метод класса для присваивания значений полям (символьный
// аргумент):
    void set(char s){
        // Заполнение полей:
        num=1;
        symb=s;
        text="Символьный аргумент.";}
    // Метод класса для присваивания значений полям (три
// аргумента):
    void set(int n,char s,String str){
        // Заполнение полей:
        num=n;
        symb=s;
        text=str;}
}
// Главный класс программы:
public class ClassDemo5{
    public static void main(String[] args){
        // Создание объектов:
        MyClass5 obj1=new MyClass5();
        MyClass5 obj2=new MyClass5(2);
        MyClass5 obj3=new MyClass5('Z');
        MyClass5 obj4=new MyClass5(3,'A',"Три аргумента.");}
}