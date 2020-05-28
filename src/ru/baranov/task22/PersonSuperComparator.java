package ru.baranov.task22;

import java.util.*;

public class PersonSuperComparator implements Comparator<Person> {

    public int compare(Person obj1, Person obj2) {
        int result = obj1.getAge() - obj2.getAge();
        if (result != 0) return (int) (result / Math.abs(result));
        result = obj1.getName().compareTo(obj2.getName());
        return (result != 0) ? (int) (result / Math.abs(result)) : 0;
    }
}


