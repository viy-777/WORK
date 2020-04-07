package ru.baranov.task8.num3;

class Test {
    static int num_objects = 0;

    {

        num_objects += 1;                                                            //счетчик количества создаваемых объектов

    }

    public Test() {

    }

    public Test(int n) {

    }

    public Test(String s) {

    }

    public void Info() {
        System.out.println("Количество создаваемых объектов: " + Test.num_objects);                                        //метод для получения информации о количестве
    }
}

public class NumberThird {
    public static void main(String[] args) {
        Test t1 = new Test();

        Test t2 = new Test(1);

        Test t3 = new Test("a");

        t1.Info();
    }
}

