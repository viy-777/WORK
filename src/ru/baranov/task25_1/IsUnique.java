package ru.baranov.task25_1;

import java.util.*;

public class IsUnique {

    public boolean isUnique(Map<String, String> map) {

        int count = 0;
        boolean unique = false;

        Set<String> setNames = new HashSet<>();
        for (Map.Entry<String, String> doubleName : map.entrySet()) {
            String name = doubleName.getValue();
            if (setNames.contains(name))
                count++;
            else {
                setNames.add(name);
            }
        }
        unique = (count < 2) || map.isEmpty();

        return unique;
    }
}
