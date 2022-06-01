public abstract class Mammal extends Animal{
    private String furColor;
    private int weight;

    public Mammal(String animalName, int age, String noise, String furColor, int weight) {
        super(animalName, age, noise);
        this.furColor = furColor;
        this.weight = weight;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getWeight() {
        return weight;
    }

    public abstract void giveMilk();

    public void sleep() {
        System.out.println("ZZzzzzzz");
    }
}
