import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static List<Animal> getAnimals() {
        return List.of(
                new Animal("Слон", 20, Classification.HERBIVORE),
                new Animal("Лев", 10, Classification.PREDATOR),
                new Animal("Гиена", 11, Classification.PREDATOR),
                new Animal("Жираф", 7, Classification.HERBIVORE),
                new Animal("Гибон", 35, Classification.OMNIVOROUS),
                new Animal("Лошадь", 36, Classification.HERBIVORE),
                new Animal("Рысь", 2, Classification.PREDATOR),
                new Animal("Динозавр", 200, Classification.PREDATOR)
        );
    }

    public static void main(String[] args) {

        /** StreamAPI - Декларативный подход */

        List<Animal> animals = getAnimals();

        /** Filter */
        List<Animal> predators = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());

        // predators.forEach(System.out::println);

        /** Sort */
        List<Animal> sorted = animals.stream()
                .sorted(Comparator.comparing(Animal::getName).thenComparing(Animal::getAge).reversed())
                .collect(Collectors.toList());
       // sorted.forEach(System.out::println);

        /** All match */
        boolean allMatch = animals.stream()
                .allMatch(animal -> animal.getAge() > 10);
        System.out.println(allMatch);

        /** Any match */
        boolean anyMatch = animals.stream()
                .anyMatch(animal -> animal.getAge() > 10);
        System.out.println(anyMatch);

        /** None match */
        boolean noneMatch = animals.stream()
                .noneMatch(animal -> animal.getName().equals("Bear"));
        System.out.println(noneMatch);

        /** Max */
        animals.stream()
                .max(Comparator.comparing(Animal::getAge))
                .ifPresent(System.out::println);

        /** Min */
        animals.stream()
                .min(Comparator.comparing(Animal::getAge))
                .ifPresent(System.out::println);

        /** Group */
        Map<Classification, List<Animal>> classificationListMap = animals.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));

        classificationListMap.forEach(((classification, animals1) -> {
            System.out.println(classification);
            animals1.forEach(System.out::println);
            System.out.println();
        }));

        animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .max(Comparator.comparing(Animal::getAge))
                .ifPresent(System.out::println);

    }
}
