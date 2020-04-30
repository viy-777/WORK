package ru.baranov.task8.num4;

//Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
//Написать класс со статическим методом конвертации договора в акт
//(на вход передавать договор, на выходе получаем акт).

public class NumberForth {
    public static void main(String[] args) {
        Contract contract = new Contract();
        Converter.converter(contract.getNumber(), contract.getDate(), contract.getContain());
    }
}
