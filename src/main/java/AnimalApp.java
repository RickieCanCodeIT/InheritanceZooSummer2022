import java.util.ArrayList;

public class AnimalApp {
    public static void main(String[] args) {
        Animal bessie = new Cow("Cow", 3, "Moo", "Brown", 1600, 20, "Bessie");
        Animal willy = new Whale("Whale", 30, "Wooooooooooo", "Gray", 5000);
        bessie.makeAnimalNoise();
        willy.makeAnimalNoise();
        if (bessie instanceof Mammal) {
            ((Mammal)bessie).sleep();
        }
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(bessie);
        animals.add(willy);
        animals.add(new Cow("Cow", 6, "I don't moo", "Spots", 2000, 0, "Fred"));
        for (Animal currentAnimal : animals) {
            currentAnimal.makeAnimalNoise();
            if (currentAnimal instanceof Swimming) {
                ((Swimming)currentAnimal).swim();
            }
        }


    }
}
