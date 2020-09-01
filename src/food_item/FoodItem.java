package food_item;

import java.awt.*;

public abstract class FoodItem {
    protected String name;
    protected String expirationDate;
    protected int quantity;
    protected boolean isOrganic;
    protected FoodType foodType;

    public FoodItem() { }

    public FoodItem(String name, String expirationDate, int quantity, boolean isOrganic) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
        this.isOrganic = isOrganic;
    }

    // Getters
    public String getName() { return name; }

    public String getExpirationDate() { return expirationDate; }

    public int getQuantity() { return quantity; }

    public boolean isOrganic() { return isOrganic; }

    public FoodType getFoodType() { return foodType; }

    // Setters
    public void setName(String name) { this.name = name; }

    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void setOrganic(boolean organic) { isOrganic = organic; }

    public void setFoodType(FoodType foodType) { this.foodType = foodType; }

    public String toString() {
        return "Name: " + name +
                "\nExpiration Date: " + expirationDate +
                "\nQuantity: " + quantity +
                "\nOrganic: " +  isOrganic;
    }

    public enum FoodType {
        Dairy,
        Grain,
        Produce
    }
}
