package ru.baranov.task13;

public class Child {

    public static void eat(String food) throws Exception {
        if ((food.equals("ЙОГУРТ")) || (food.equals("СОК"))) {
            System.out.println("Cъел … за обе щеки");
        } else {
            if ((food.equals("СУП")) || (food.equals("КАША"))) {
                throw new Exception("Ребенку не нравится еда!");
            }
        }
    }
}