package ru.baranov.task8.num4;

class Contract {                                              //договор
    static int number = 0;
    static String date = "";
    static String contain[] = new String[3];

    public Contract() {
        this.number = 54;
        this.date = "10.02.2020";
        this.contain[0] = "Бумага";
        this.contain[1] = "Принтер";
        this.contain[2] = "Тонер";
    }

    public static int getNumber() {
        return number;
    }

    public static String getDate() {
        return date;
    }

    public static String[] getContain() {
        return contain;
    }
}

class Statement extends Contract {                                            //акт (наследование данных от договора)
    static int number_ = 0;
    static String date_ = "";
    static String contain_[] = new String[3];

    public static void ContractToStatement() {
        number_ = getNumber();
        date_ = getDate();
        contain_ = getContain();
    }

}

public class NumberForth {
    public static void main(String[] args) {
        Statement s = new Statement();
        s.ContractToStatement();
        System.out.println("----Акт----");
        System.out.println("Номер: " + s.number_);
        System.out.println("Дата: " + s.date_);
        for (int i = 0; i < s.contain_.length; i++) {
            System.out.println("Товар №" + (i + 1) + " : " + s.contain_[i]);
        }
    }
}
