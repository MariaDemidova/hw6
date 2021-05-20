package demidova;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
        CountAnimals.letsCountAllAnimals();
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " метров.");
    }
}
