public class Cow extends Mammal {
    private int milkAmount;
    public String name;

    public Cow(String animalName, int age, String noise, String furColor, int weight, int milkAmount, String name) {
        super(animalName, age, noise, furColor, weight);
        this.milkAmount = milkAmount;
        this.name = name;
    }


    @Override
    public void makeAnimalNoise() {
        System.out.println(name + " goes " + noise);
    }

    @Override
    public void giveMilk() {
        System.out.println();
    }

    @Override
    public void sleep() {
        System.out.println("Cows don't sleep!");
    }
}
