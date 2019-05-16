package com.company.masya;

import javax.swing.*;
class AssignObj{
    // Текстовое поле класса:
    String text;
    // Конструктор класса (без аргумента):
    AssignObj(){
        text="Новый объект!";}
    // Конструктор класса (с одним аргументом):
    AssignObj(String str){
        text=str;}
    // Метод для отображения текста:
    void show(){
        JOptionPane.showMessageDialog(null,text);}
}
public class AssignObjDemo{
    public static void main(String[] args){
        // Создание объектов:
        AssignObj objA=new AssignObj();
        AssignObj objB=new AssignObj("Второй объект!");
        // Отображение текстовых полей объектов:
        objA.show();
        objB.show();
        // Присваивание объектов:
        objA=objB;
        // Текстовое поле первого объекта:
        objA.show();
        // Изменение поля второго объекта:
        objB.text="Изменен второй объект!";
        // Текстовое поле первого объекта:
        objA.show();}
}