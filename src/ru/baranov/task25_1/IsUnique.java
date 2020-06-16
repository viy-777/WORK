package ru.baranov.task25_1;

import java.util.*;

public class IsUnique {

    public boolean isUnique(Map<String, String> map) {
        Set<String> setNames = new HashSet<>();
        for (String name : map.values()) {
            if (setNames.contains(name)) return false;
            else
                setNames.add(name);
        }
        return true;
    }
}
