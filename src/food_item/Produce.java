package food_item;

public class Produce extends FoodItem {
    boolean isFruit;

    // NOTE: INHERITS VARIABLES FROM FoodItem.java

    public Produce() {
        super();
        foodType = FoodType.Produce;
    }

    public Produce(String name, String expirationDate, int quantity, boolean isOrganic, boolean isFruit) {
        super(name, expirationDate, quantity, isOrganic);
        this.isFruit = isFruit;
        foodType = FoodType.Produce;
    }

    // NOTE: INHERITS SETTERS/GETTERS FROM FoodItem.java
    // Getters
    public boolean isFruit() { return isFruit; }

    //Setters
    public void setFruit(boolean isFruit) { this.isFruit = isFruit; }

    public String toString() {
        return "Type: " + foodType.toString() + "\n" +
                super.toString() +
                "\nFruit: " + isFruit;
    }
}
