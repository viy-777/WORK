package ru.baranov.task25_1;

//public boolean isUnique(Map<String, String> map);
//Написать метод, который возвращает true, если в мапе нет двух и более одинаковых value, и false в противном случае.
//Для пустой мапы метод возвращает true.
//Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} метод вернет true,
//а для {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод вернет false.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Выберите тип map (0-пустая, 1-уникальная, 2-неуникальная): ");
        int typeMap = in.nextInt();

        Map<String, String> hashMap = new HashMap<>();

        if (typeMap == 0) {
            hashMap = new HashMap<>();
        } else if (typeMap == 1) {
            hashMap.put("Вася", "Иванов");
            hashMap.put("Петр", "Петров");
            hashMap.put("Виктор", "Сидоров");
            hashMap.put("Сергей", "Савельев");
            hashMap.put("Вадим", "Викторов");
        } else if (typeMap == 2) {
            hashMap.put("Вася", "Иванов");
            hashMap.put("Петр", "Петров");
            hashMap.put("Виктор", "Иванов");
            hashMap.put("Сергей", "Савельев");
            hashMap.put("Вадим", "Петров");
        }

        IsUnique isUnique = new IsUnique();
        System.out.println(isUnique.isUnique(hashMap));
    }


}

