package ru.baranov.task13;

//Программа должна имитировать поведение воспитанного ребенка, которого мама кормит вкусной или невкусной едой.
//Если еда не нравится, ребенок ее не ест: выбрасывается исключительная ситуация, которая обрабатывается «мамой».
//Воспитанный ребенок, даже если еда не естся, в любом случае скажет «спасибо» и поцелует маму.
//
//Создать перечисление «Еда» с несколькими вариантами еды: морковь, яблоко, каша и т.д.
//Создать класс «ребенок» с методом «кушать», принимающий на вход некоторую еду. В методе происходит сравнение
//поступившей еды с вкусовыми предпочтениями и в случае если они не совпадают, выбрасывается исключение.
//«Одобренная» ребенком еда съедается: возвращается сообщение «съел … за обе щеки».
//Вне зависимости съел ребенок еду или выплюнул, ребенок благодарит маму, печатая в консоль «спасибо, мама».
//Создать главный класс и метод main - это будет «Мама». «Мама» дает ребенку «еду» и обрабатывает исключения
//ребенка.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numFood;

        System.out.println("Мама выбирает еду из списка:");
        for (Foods foods : Foods.values()) {
            System.out.println("№" + (foods.ordinal() + 1) + ": " + foods.f);
        }
        Scanner in = new Scanner(System.in);

        System.out.println("Мама вводит номер продукта:");
        numFood = in.nextInt();

        Child.eat(numFood);

        try {
            if (Child.unpalatable)
                throw new Exception("Ребенок не ест!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


