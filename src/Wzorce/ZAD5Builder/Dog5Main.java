package Wzorce.ZAD5Builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dog5Main {

    public static void main(String[] args) {

        List<String> zabawki = new ArrayList<>();
        zabawki.add("pierwsza");
        zabawki.add("druga");
        List<String> zabawki2=new ArrayList<>(Arrays.asList("trzy","cztery"));


        Dog5 pies = new Dog5.Dog5Builder()
                .age(4)
                .name("imie")
                .type("typ")
                .toys(zabawki)
                .build();

        Dog5 pies2 = new Dog5.Dog5Builder()
                .age(4)
                .name("imie2")
                .type("typ2")
                .toys(zabawki2)
                .build();

        System.out.println(pies);
        System.out.println(pies2);
    }
}
