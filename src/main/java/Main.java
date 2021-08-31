import java.util.ArrayList;
import java.util.List;

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

        /** StreamAPI */

        // Filter
        List<Animal> predators = new ArrayList<>();

        predators =
        // Sort
        // All match
        // Any match
        // None match
        // Max
        // Min
        // Group
    }
}
