package com.company.masya;

class MyClass7{
    // Имя объекта (текстовое поле):
    String name;
    // Конструктор класса:
    MyClass7(String name){
        this.name=name;}
    // Метод для отображения имени объекта:
    void show(){
        System.out.println("Объект с именем \""+name+"\".");}
}
public class MoreArgsDemo{
    // Статический метод для изменения ссылки на объект:
    static void ChangeRef(MyClass7 obj){
// Создается локальный объект:
        MyClass7 tmp=new MyClass7("Локальный Объект");
// Ссылка на локальный объект присваивается аргументу метода:
    obj=tmp;
// Проверка имени объекта, на который ссылается аргумент:
    obj.show();}



        public static void main(String[] args){
            // Создание объекта:
            MyClass7 obj=new MyClass7("Основной Объект");
            // Проверка имени объекта:
            obj.show();
            // Попытка изменить ссылку на объект:
            ChangeRef(obj);
            // Проверка результата:
            obj.show();}
    }