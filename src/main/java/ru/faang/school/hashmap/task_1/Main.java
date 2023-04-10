package ru.faang.school.hashmap.task_1;

import java.util.HashMap;
import java.util.Map;
public class Main {

    private static final Map<String, House> vasteras = new HashMap<>();
    public static void main(String[] args) {

        House stark = new House(" Старк ", " Лютоволк");
        House lannister = new House(" Ланнистер ", " Чёрный коронованный олень на золотом поле");
        House barateon = new House(" Баратеон ", " Лев рыкающий");
        House targarien = new House(" Таргариен ", " Змей Горыныч");

        add(stark.getName(), stark);
        add(lannister.getName(), lannister);
        add(barateon.getName(), barateon);
        add(targarien.getName(), targarien);

        remove(stark.getName());

        find(lannister.getName());

        printAll();
    }
    private static void add(String name, House house) {
        vasteras.put(name, house);
    }
    private static void remove(String name) {
        vasteras.remove(name);
    }
    private static String find(String name) {
        return vasteras.get(name).getSigil();
    }
    private static void printAll() {
        for (Map.Entry<String, House> entry : vasteras.entrySet()) {
            System.out.println(entry.toString());
        }
    }
}