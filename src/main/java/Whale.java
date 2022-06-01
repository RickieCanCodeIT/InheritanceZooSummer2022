public class Whale extends Mammal implements Swimming{


    public Whale(String animalName, int age, String noise, String furColor, int weight) {
        super(animalName, age, noise, furColor, weight);
    }

    @Override
    public void makeAnimalNoise() {
        System.out.println("The " + getAnimalName()  +  " goes " + noise);

    }

    @Override
    public void giveMilk() {
        System.out.println("The whale presumably gives a lot of milk");
    }

    @Override
    public void swim() {
        System.out.println("The whale swims!");
    }
}
