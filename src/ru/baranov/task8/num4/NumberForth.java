package ru.baranov.task8.num4;

//Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
//Написать класс со статическим методом конвертации договора в акт
//(на вход передавать договор, на выходе получаем акт).

public class NumberForth {
    public static void main(String[] args) {
        Contract contract = new Contract();
        contract.data();

        System.out.println();
        System.out.println("----Акт----");
        System.out.println("Номер: " + Statement.getNumber());
        System.out.println("Дата: " + Statement.getDate());

        for (int i = 0; i < Statement.getContain().length; i++) {
            System.out.println("Товар №" + (i + 1) + " : " + Statement.getContain()[i]);
        }
    }
}
