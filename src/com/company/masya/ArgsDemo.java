    package com.company.masya;
    class MyClass6{ // Поля класса:
    int number;
    char symb;
    // Конструктор класса:
    MyClass6(int number,char symb){
    // Для различения полей и аргументов используем // ключевое слово this:
    this.number=number;
    this.symb=symb;}
    // Метод для отображения значений полей объекта:
    void show(){
    System.out.println("Поля объекта: "+number+" и "+symb);}
    }
    public class ArgsDemo{
    // Перегруженный статический метод.
    // Аргумент - объект:
    static void MakeChange(MyClass6 obj){
    // Изменение полей объекта - аргумента метода:
    obj.number++;
    obj.symb++;
    // Текст для отображения:
    String text="Аргумент-объект: поля "+obj.number+" и "+obj.symb;
    // Вывод сообщения на консоль:
    System.out.println(text);}
    // Перегруженный статический метод.
    // Аргументы - переменные базовых типов:
    static void MakeChange(int number,char symb){
    // Изменение аргументов метода:
    number++;
    symb++;
    // Текст для отображения:
    String text="Аргументы базовых типов: значения "+number+" и "+symb;
    // Вывод сообщения на консоль:
    System.out.println(text);}
    // Главный метод программы:
    public static void main(String[] args){
    // Создание объекта:
    MyClass6 obj=new MyClass6(1,'a');
    // Значения полей объекта:
    obj.show();
    // Изменение объекта:
    MakeChange(obj);
    // Значения полей объекта:
    obj.show();
    // Изменение полей объекта:
    MakeChange(obj.number,obj.symb);
    // Значения полей объекта:
    obj.show();}
    }
