package ru.baranov.task4;

public class Number3 {
    public static void main(String... args){
        for (int i = 1; i < 11; i++){
            for(int k = 1; k < 11; k++){
                System.out.print(k * i + " "); //перемножение k с i
            }
            System.out.println(""); //переход на новую строку после каждого нового значения i
        }
    }
}
