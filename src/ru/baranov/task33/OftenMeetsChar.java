package ru.baranov.task33;

import java.util.*;

public class OftenMeetsChar {

    public void FinderOftenMeetsChar(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            map.putIfAbsent(c, 0);
            map.computeIfPresent(c, (key, value) -> (map.get(c) + 1));
        }
        int quantity = Collections.max(map.values());

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(quantity)) {
                System.out.println("Character: " + entry.getKey() +
                        " has occurred maximum times in String: " + quantity);
            }

        }

    }
}

