package food_item;

public class Grain extends FoodItem {
    private boolean isProcessed;

    // NOTE: INHERITS VARIABLES FROM FoodItem.java

    public Grain () {
        super();
        foodType = FoodType.Grain;
    }

    public Grain(String name, String expirationDate, int quantity, boolean isOrganic){
        super(name, expirationDate, quantity, isOrganic);
        this.isProcessed = isProcessed;
        foodType = FoodType.Grain;
    }

    // NOTE: INHERITS SETTERS/GETTERS FROM FoodItem.java

    // Getters
    public boolean isProcessed() { return isProcessed; }

    // Setters
    public void setProcessed(boolean processed) { this.isProcessed = isProcessed; }

    public String toString() {
        return "Type: "+ foodType.toString() + "\n" +
                super.toString() +
                "\nProcessed: " + isProcessed;
    }
}
