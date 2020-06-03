package ru.baranov.task24;

import java.util.*;

public class RemoveEvenLength {
    public static Set<String> removeEvenLength(Set<String> set) {
        set.removeIf(word -> word.length() % 2 == 0);
        return set;
    }
}
