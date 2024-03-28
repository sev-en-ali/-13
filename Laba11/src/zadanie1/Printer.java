package zadanie1;

import java.util.*;

public class Printer {
    public static void print(Locale locale) {
        ResourceBundlhue bundle = ResourceBundle.getBundle("themes", locale);
        Set<String> keys = bundle.keySet();
        System.out.println("Список изученных тем: ");

        for (String key : keys) {
            String value = bundle.getString(key);
            System.out.println(key + ": " + value);
        }
    }
fghj
    public static void main(String[] args) {
        // Пример вызова метода с разными локалями
        Locale russianLocale = new Locale("ru", "RU");
        Locale englishLocale = new Locale("en", "US");
        System.out.println("Информация на русском: ");gvhjkm
        print(russianLocale);
        System.out.println("Information in English:");
        print(englishLocale);
    }
}