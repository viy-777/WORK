package ru.baranov.task8.num4;

public class Statement extends Contract {
    static int number_ = 0;
    static String date_ = "";
    static String contain_[] = new String[3];

    public void st() {
        number_ = getNumber();
        date_ = getDate();
        contain_ = getContain();

        System.out.println();
        System.out.println("----Договор----");
        System.out.println("Номер: " + number_);
        System.out.println("Дата: " + date_);
        for (int i = 0; i < contain_.length; i++) {
            System.out.println("Товар №" + (i + 1) + " : " + contain_[i]);
        }
    }
}
