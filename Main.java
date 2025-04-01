public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик", 7);
        Cat kot = new Cat("Кот", 10);
        Cat murzik = new Cat("Мурзик", 9);
        murzik.run(15);
        murzik.swim(100);

        Dog bobik = new Dog("Бобик");
        bobik.run(10);
        bobik.swim(7);

        Cat.countCats();
        Dog.countDogs();
        Animal.countAnimals();

        CatBowl catBowl = new CatBowl();
        catBowl.addFood(7);
        catBowl.addFood(2);
        System.out.println(catBowl.getFoodValue());

        catBowl.catsEat();
        System.out.println(catBowl.getFoodValue());

        catBowl.addFood(17);

        catBowl.catsEat();
        System.out.println(catBowl.getFoodValue());

        System.out.printf("\n---------------------\n");

        Circle circle1 = new Circle(3, "red", "black");
        circle1.result();

        Rectangle rectangle1 = new Rectangle(12.4,6,"Green", "Pink");
        rectangle1.result();

        Triangle triangle1 = new Triangle(2,4,3, "Blue", "Grey");
        triangle1.result();


    }

}