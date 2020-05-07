package ru.baranov.task8.num4;

public class Converter {

    public static Statement convert(Contract contract) {
        return new Statement(contract.getNumber(), contract.getDate(), contract.getGoods());
    }
}