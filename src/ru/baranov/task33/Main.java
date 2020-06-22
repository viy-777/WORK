package ru.baranov.task33;

//Вывести максимально встречающийся символ в строке.
//Пример:
//This is test message
//Character: s has occurred maximum times in String: 5

public class Main {
    public static void main(String[] args) {
        String initialText = "This is test message iii";
        System.out.println("Исходный текст: " + initialText);

        OftenMeetsChar oftenMeetsChar = new OftenMeetsChar();
        oftenMeetsChar.FinderOftenMeetsChar(initialText);
    }
}
