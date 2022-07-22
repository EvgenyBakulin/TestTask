package ru.skypro;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of("John","Mary");
        names.stream().map(e->e.substring(1)).sorted().toList().stream().forEach(System.out::println);
    }
}
