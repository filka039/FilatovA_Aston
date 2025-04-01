import java.util.ArrayList;

public class Dog extends Animal{
    private static ArrayList<Dog> dogs = new ArrayList<>();

    public Dog (String name){
        this.name = name;
        dogs.add(this);
        animals.add(this);
    }

    @Override
    public void run (int length){
        if (length < 0) {
            System.out.println("Задана неверная величина расстояния.");
        } else if (length == 0) {
            System.out.println("Расстояние равно 0, " + name +" решил никуда не бежать.");
        } else if (length > 0 && length <= 500 ) {
            System.out.println(name + " пробежал " + length + " м.");
        } else {
            System.out.println("Ты что, песики столько не бегают, задай расстояние поменьше.");
        }
    }

    @Override
    public void swim(int length){
        if (length < 0) {
            System.out.println("Задана неверная величина расстояния.");
        } else if (length == 0) {
            System.out.println("Расстояние равно 0, " + name +" решил никуда не плыть.");
        } else if (length > 0 && length <= 10 ) {
            System.out.println(name + " проплыл " + length + " м.");
        } else {
            System.out.println("Ты что, песики столько не плавают, задай расстояние поменьше.");
        }
    }

    public static void countDogs(){
        System.out.println("Создано песиков: " + dogs.size());
    }


}
