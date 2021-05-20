package demidova;

public class CountAnimals {
    private static int countDog = 0;
    private static int countCat = 0;
    private static int countAllAnimals = 0;

    public static void letsCountAllAnimals() {
        countAllAnimals++;
    }

    public static void letsCountCats() {
        countCat++;
    }

    public static void letsCountDogs() {
        countDog++;
    }

    public static void showCount() {
        System.out.println("\nВсех животных создано: " + countAllAnimals);
        System.out.println("Котов создано: " + countCat);
        System.out.println("Собак создано: " + countDog);
    }
}
