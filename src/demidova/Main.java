package demidova;

public class Main {

    public static void main(String[] args) {
        CountAnimals countAnimals = new CountAnimals();
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Bobick");
        Dog dog3 = new Dog("Psina");
        Cat cat = new Cat("Мурка");

        dog1.run(300);
        cat.run(400);
        dog1.swim(10);
        cat.swim(11);
        dog3.run(600);
        countAnimals.showCount();

    }
}
