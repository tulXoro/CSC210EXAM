import food_item.FoodItem;

import java.util.ArrayList;

public class Donator {
    FoodItem donatedFood;
    private int ssn;
    private boolean isDonated = false;

    public Donator () { }

    public Donator(int ssn, FoodItem donatedFood) {
        this.ssn = ssn;
        this.donatedFood = donatedFood;
    }

    // Getters
    public FoodItem getDonatedFood () { return donatedFood; }

    public int getSSN() { return ssn; }

    // Setters
    public void setDonatedFood(FoodItem donatedFood) { this.donatedFood = donatedFood; }

    public void setSSN(int ssn) { this.ssn = ssn; }

    // Manipulator
    public void donate() {
        if(!isDonated) MainDriver.foodSupply.add(donatedFood);
        else
            System.out.println("It looks like we already received their donation! Please contact support.");

    }
}
