package ru.baranov.task8.num1;

final class Anthill {

}

/*class Ant extends Anthill{                                                            //ошибка!!!

}*/

public class NumberFirst {
    public static void main(String[] args) {
        final int NUMBER_ANT = 1000;
        System.out.println("Количество муравьев неизменно и равно " + NUMBER_ANT);
        //NUMBER_ANT = 10;                                                            //ошибка!!!
    }
}
