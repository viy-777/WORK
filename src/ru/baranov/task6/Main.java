package ru.baranov.task6;

public class Main {
    public static void main(String[] args) {

        University MGU = new University();                                                      //создание объекта класса "University"

        MGU.name = "МГУ";                                                                       //присвоение значений переменным объекта "MGU" класса "University"
        MGU.number_faculties = 45;                                                              //присвоение значений переменным объекта "MGU" класса "University"
        MGU.displayInfo();                                                                      //вывод данных объекта "MGU" класса "University" на консоль

        Faculty FizFac = new Faculty(27);                                                   //создание объекта класса "Faculty" с исп-ем конструктора

        FizFac.displayInfo();                                                                   //вывод данных объекта "FizFac" класса "Faculty" на консоль

        Specialty Biophysics = new Specialty("Биофизика", 95);                       //создание объекта класса "Specialty" с исп-ем конструктора

        Biophysics.setName("!Биофизика!");                                                      // использование сеттера

        Biophysics.displayInfo();                                                               //вывод данных объекта "Biophysics" класса "Specialty" на консоль
        System.out.println(Biophysics.getName());                                               // использование геттера
    }
}

class University {                                                                              //класс
    String name;                                                                                //1-ая переменная класса
    int number_faculties;                                                                       //2-ая переменная класса

    void displayInfo() {
        System.out.println("Университет: " + name + ", кол-во факультетов: " + number_faculties);   //метод (вывод данных класса на консоль)
    }
}

class Faculty {                                                                                 //класс
    String name;                                                                                //1-ая переменная класса
    int number_specialties;                                                                     //2-ая переменная класса

    Faculty(int n)                                                                              //объявление конструктора
    {
        name = "Физический";                                                                    //присвоение значения 1-ой переменной класса (предустановленное)
        number_specialties = n;                                                                 //присвоение пром. переменной 2-ой переменной класса (изменяемая)
    }

    void displayInfo() {
        System.out.println("Факультет: " + name + ", кол-во специальностей: " + number_specialties);   //метод (вывод данных класса на консоль)
    }
}

class Specialty {                                                                                //класс
    String name;                                                                                 //1-ая переменная класса
    int mark;                                                                                    //2-ая переменная класса

    Specialty(String name, int m)                                                                //объявление конструктора
    {
        this.name = name;                                                                       //присвоение пром. переменной 1-ой переменной класса (изменяемая)
        mark = m;                                                                               //присвоение пром. переменной 2-ой переменной класса (изменяемая)
    }

    public String getName() {                                                                    //геттер
        return this.name;
    }

    public void setName(String name) {                                                           //сеттер
        this.name = name;
    }

    protected void displayInfo() {
        System.out.println("Специальность: " + name + ", проходной балл: " + mark);   //метод (вывод данных класса на консоль)
    }
}


