package ru.baranov.task33;

import java.util.*;

public class OftenMeetsChar {
    private final String text;
    private Character charFromtext;
    private int quantity;

    public OftenMeetsChar(String text) {
        this.text = text;
    }

    public int getQuantity() {
        return quantity;
    }

    public char getCharFromtext() {
        return charFromtext;
    }

    public void FinderOftenMeetsChar() {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (!map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), 1);
            } else
                map.replace(text.charAt(i), (map.get(text.charAt(i)) + 1));
        }
        quantity = Collections.max(map.values());

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(quantity)) {
                charFromtext = entry.getKey();
            }
        }
    }
}

