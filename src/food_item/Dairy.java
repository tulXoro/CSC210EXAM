package food_item;

public class Dairy extends FoodItem {
    boolean isNoneFat;
    boolean isVegan;

    // NOTE: INHERITS VARIABLES FROM FoodItem.java

    public Dairy () {
        super();
        foodType = FoodType.Dairy;
    }

    public Dairy (String name, String expirationDate, int quantity, boolean isOrganic) {
        super(name, expirationDate, quantity, isOrganic);
        this.isNoneFat = isNoneFat;
        this.isVegan = isVegan;
        foodType = FoodType.Dairy;
    }

    // NOTE: INHERITS GETTERS/SETTERS FROM FoodItem.java
    // Getters
    public boolean isNoneFat() { return isNoneFat; }

    public boolean isVegan() { return isVegan; }

    // Setters
    public void setNoneFat(boolean noneFat) { isNoneFat = noneFat; }

    public void setVegan(boolean vegan) { isVegan = vegan; }

    public String toString() {
        return "Type: " + foodType.toString() + "\n" +
                super.toString() +
                "\nNo Fat: " + isNoneFat +
                "\nVegan: " + isVegan;
    }

}
