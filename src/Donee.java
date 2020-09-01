import com.sun.tools.javac.Main;
import food_item.FoodItem;

import java.util.ArrayList;
import java.util.Scanner;

public class Donee {
    private String name;
    private FoodItem.FoodType foodNeed;
    private String address;
    private int ssn;

    public Donee () {

    }

    public Donee(String name, FoodItem.FoodType foodNeed, String address, int ssn) {
        this.name = name;
        this.foodNeed = foodNeed;
        this.address = address;
        this.ssn = ssn;
    }

    // Getters
    public String getName () { return name; }

    public FoodItem.FoodType getFoodNeed () { return foodNeed; }

    public String getAddress () { return address; }

    public int getSSN () { return ssn; }

    // Setters
    public void setName(String name) { this.name = name; }

    public void setFoodNeed(FoodItem.FoodType foodNeed) { this.foodNeed = foodNeed; }

    public void setAddress(String address) { this.address = address; }

    public void setSSN(int ssn) { this.ssn = ssn; }

    // Manipulator
    public void receiveDonation(String foodItem) {

        for(int i = 0; i < MainDriver.foodSupply.size(); i++) {
            if(foodItem.equals(MainDriver.foodSupply.get(i).getName())){
                if(foodNeed != MainDriver.foodSupply.get(i).getFoodType()){
                    System.out.println("This donee doesn't need this type of food!");
                    return;
                }
                FoodItem temp = MainDriver.foodSupply.get(i);
                System.out.print("How much " + temp.getName() + " should be donated?: ");
                Scanner io = new Scanner(System.in);
                int userInt = Integer.parseInt(io.nextLine());

                while(userInt>temp.getQuantity() || userInt < 0) {
                    System.out.print("Unable to donate that amount. Please choose a different amount: ");
                    userInt = Integer.parseInt(io.nextLine());
                }
                // this isn't good practice but i dont want to make more objects
                foodItem = MainDriver.foodSupply.get(i).getName();
                if(userInt==temp.getQuantity())
                    MainDriver.foodSupply.remove(i);
                else
                    temp.setQuantity(temp.getQuantity()-userInt);
                System.out.println("Successfully donated " + foodItem + " to " + getName() +  ". The item will be delivered to their address in a few days.");
                return;
            }
        }
        System.out.print("Error: Unable to send food item (item is not on the list)");
    }

}
