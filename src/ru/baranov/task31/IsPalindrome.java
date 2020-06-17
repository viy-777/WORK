package ru.baranov.task31;

public class IsPalindrome {

    public boolean isPalindrome1(String text) {
        String formatedText = text.toLowerCase().replaceAll("\\p{P}|\\s+", "");
        int n = formatedText.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (formatedText.charAt(i) != formatedText.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(String text) {
        String formatedText = text.toLowerCase().replaceAll("\\p{P}|\\s+", "");
        String reversedString = new StringBuffer(formatedText).reverse().toString();
        return formatedText.equals(reversedString);
    }
}
