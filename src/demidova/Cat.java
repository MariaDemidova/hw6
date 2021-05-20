package demidova;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        CountAnimals.letsCountCats();
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) super.run(distance);
        else System.out.println("Кот может пробежать не более 200 метров.");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не хотят плавать, в воде слишком мокро.");
    }
}
