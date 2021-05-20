package demidova;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        CountAnimals.letsCountDogs();
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) super.run(distance);
        else System.out.println("Собака может пробежать не более 500 метров");
    }

    @Override
    public void swim(int distance) {
        if (distance <= 20) super.swim(distance);
        else System.out.println("Собака может проплыть не более 20 метров");
    }
}
