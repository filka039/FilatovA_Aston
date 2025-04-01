import java.util.ArrayList;

public class Animal {
    String name;
    protected static ArrayList<Animal> animals = new ArrayList<>();

    public void run (int length){
        System.out.println("Животное пробедало " + length + " м.");
    }

    public void swim (int length){
        System.out.println("Животное проплыло " + length + " м.");
    }

    public static void countAnimals(){
        System.out.println("Создано животных: " + animals.size());
    }
}
