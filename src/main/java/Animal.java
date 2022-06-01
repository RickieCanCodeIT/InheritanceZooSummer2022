public abstract class Animal {
    private String animalName;
    private int age;
    protected String noise;

    public Animal(String animalName, int age, String noise) {
        this.animalName = animalName;
        this.age = age;
        this.noise = noise;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAge() {
        return age;
    }

    public String getNoise() {
        return noise;
    }

    public abstract void makeAnimalNoise();
}
