package ru.baranov.task6;

class University {
    String name = "МГУ";
    int number_faculties;

    University(String name)
    {
        this.name = name;
    }
}

class Faculty {
    String name;
    int number_specialties;

    public void rating() {
        System.out.println("№1");
    }
}

class  Specialty {
    String name;
    int number_groups;
}

public class Main {
    public static void main (String[] args){
Faculty x;
x = new Faculty();
x.name = "Приборостроение";
x.number_specialties = 16;
x.rating();

        System.out.println("Название факультета: '" + x.name + "', кол-во специальностей: " + x.number_specialties);
    }
}
