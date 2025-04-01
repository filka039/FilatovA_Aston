import java.util.ArrayList;

public class Cat extends Animal {
    private static ArrayList<Cat> cats = new ArrayList<>();
    private boolean satiety;
    private int hungry;

    public Cat(String name, int hungry) {
        this.name = name;
        this.satiety = false;
        if (hungry > 0 && hungry < 20) {
            this.hungry = hungry;
        }
        cats.add(this);
        animals.add(this);

    }

    @Override
    public void run(int length) {
        if (length < 0) {
            System.out.println("Задана неверная величина расстояния.");
        } else if (length == 0) {
            System.out.println("Расстояние равно 0, " + name + " решил никуда не бежать.");
        } else if (length > 0 && length <= 200) {
            System.out.println(name + " пробежал " + length + " м.");
        } else {
            System.out.println("Ты что, котики столько не бегают, задай расстояние поменьше.");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Котики не умеют плавать.");
    }

    public static void countCats() {
        System.out.println("Создано котиков: " + cats.size());
    }

    public static ArrayList<Cat> getCats() {
        return cats;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}