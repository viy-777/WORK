package ru.baranov.task24;

import java.util.*;

public class RemoveEvenLength {
    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> bufferSet = new HashSet<>(set);
        bufferSet.removeIf(word -> word.length() % 2 == 0);
        return bufferSet;
    }
}
