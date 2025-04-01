public class CatBowl {
    private int foodValue = 0;

    public void addFood(int foodValue){
        if (this.foodValue + foodValue <=100) {
            this.foodValue = this.foodValue + foodValue;
        } else {
            this.foodValue = 100;
            System.out.println("Миска столько не вмещает еды, заполнили миску до отказа (100 ед.).");
        }
    }

    public void withdrawFood(int foodValue) {
        if (this.foodValue - foodValue >= 0) {
            this.foodValue = this.foodValue - foodValue;
        } else {
            System.out.println("В миске меньше еды, чем хотите забрать.");
        }
    }

    public String getFoodValue(){
        return "В миске осталось " + foodValue + " ед. еды.";
    }

    public void catsEat(){
        for (int i = 0; i < Cat.getCats().size(); i++){
            if (Cat.getCats().get(i).getSatiety() == false) {
                if (Cat.getCats().get(i).getHungry() <= this.foodValue) {
                    this.foodValue = this.foodValue - Cat.getCats().get(i).getHungry();
                    System.out.println("Котик " + Cat.getCats().get(i).getName() + " поел.");
                    Cat.getCats().get(i).setSatiety(true);
                } else {
                    System.out.println("В миске видно дно, котик " + Cat.getCats().get(i).getName() + " не поел.");
                }
            } else {
                System.out.println("Котик " + Cat.getCats().get(i).getName() + " не голоден.");
            }
        }
    }
}
