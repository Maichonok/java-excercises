package com.company.masya;

import javax.swing.*;
// Класс для создания на его основе
// анонимного объекта:
class MyClass8{
    // Поле - переменная массива:
    int[] nums;
    // Конструктор класса:
    MyClass8(int n){
        // Создание массива:
        nums=new int[n];
        // Заполнение массива натуральными числами:
        for(int i=0;i<nums.length;i++)
            nums[i]=i+1;}
    // Метод для отображения элементов массива
    // в диалоговом окне:
    void show(){
        // Текст для отображения в диалоговом окне
        // (начальное значение):
        String text="Натуральные числа:\n";
        // Формирование текста:
        for(int i=0;i<nums.length;i++)
            text+=nums[i]+" ";
        // Отображение диалогового окна:
        JOptionPane.showMessageDialog(null,text);}
}
public class AObjDemo{
// Статический метод для отображения сообщения
// на основе объекта класса MyClass:
static void show(MyClass8 obj){
    // Текст (начальное значение)
    // для отображения в окне:
    String text="Элементы массива:\n";
    // Определение количества элементов в строке:
    int n=(int)Math.ceil(Math.sqrt(obj.nums.length));
    // Формирование текста:
    for(int i=0;i<obj.nums.length-1;i++){
        text+=obj.nums[i]+((i+1)%n==0?" >> дальше\n":" : ");}
    // Финальная "точка":
    text+=obj.nums[obj.nums.length-1]+". конец";
    // Отображение сообщения:
    JOptionPane.showMessageDialog(null,text);
}
    public static void main(String[] args){
        // Вызов метода из анонимного объекта:
        new MyClass8(12).show();
        // Анонимный объект - аргумент метода:
        show(new MyClass8(24));}
}
