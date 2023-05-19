package com.company.lesson31;

import com.company.lesson8.Animal;
import com.company.lesson8.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
    public static void run() {

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(getEvenNumber(list));
        System.out.println(getEvenNumberWithStreamAPI(list));

        workWithNumbers();
        workWithString();
        workWithObjects();
    }

    private static List<Integer> getEvenNumber(List<Integer> input) {
        List<Integer> list = new ArrayList<>();
        for (Integer i : input) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        return list;
    }

    private static List<Integer> getEvenNumberWithStreamAPI(List<Integer> input) {
        return input.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    private static void workWithNumbers() {
        List<Integer> numbers = List.of(1, -1, -8, 11, 20, 30, 44);
        numbers.stream()
                .filter(num -> num > 0)
                .forEach(num -> {
                    System.out.println(num);
                });

        int result = numbers.stream()
                .filter(num -> num > 0)
                .min((x, y) -> Integer.compare(x, y))
                .orElse(0);
        System.out.println(result);

        // Сумма всех чисел
        int sum = numbers.stream()
                .reduce((x, y) -> x + y)
                .orElse(0);
        System.out.println("SUM: " + sum);
    }

    private static void workWithString() {
        List<String> names = List.of("Egor", "Max", "Ivan", "Petr", "Patric", "");
        System.out.println(names);
        names = names.stream()
                .filter(name -> name.isBlank() == false)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(names);

        long amount = names.stream()
                .filter(name -> name.startsWith("P"))
                .count();
        System.out.println(amount);

        amount = names.stream()
                .filter(name -> name.startsWith("P"))
                .collect(Collectors.counting());
        System.out.println(amount);
    }

    private static void workWithObjects() {
        List<Dog> dogs = List.of(
                Dog.of("Sharik", new Animal.AnimalWeight(1, Animal.AnimalWeight.WeightType.KG)),
                Dog.of("Bobik", new Animal.AnimalWeight(1, Animal.AnimalWeight.WeightType.KG)),
                Dog.of("Brobik", new Animal.AnimalWeight(1, Animal.AnimalWeight.WeightType.KG)),
                Dog.of("Tuzik", new Animal.AnimalWeight(1, Animal.AnimalWeight.WeightType.KG))
        );

        Map<String, List<Dog>> dogMap = dogs.stream()
                .collect(Collectors
                                .groupingBy(dog -> String.valueOf(dog.getName().charAt(0)), Collectors.toList()));
        System.out.println(dogMap);
    }
}
