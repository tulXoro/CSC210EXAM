import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import employees.*;
import food_item.*;

public class MainDriver {
    public static List<FoodItem> foodSupply = new ArrayList<FoodItem>();
    public static List<Donator> donorList = new ArrayList<Donator>();
    public static List<Donee> doneeList = new ArrayList<Donee>();
    public static List<Employee> employeesList = new ArrayList<Employee>();

    public static void main(String[] args) {
        while(true) printMenu();
    }

    public static void printMenu() {
        Scanner io = new Scanner(System.in);
        String userIn;

        System.out.println("[1] To add a full time employee information");
        System.out.println("[2] To add a volunteer information");
        System.out.println("[3] To add Donor information");
        System.out.println("[4] To add Donee information");
        System.out.println("[5] To receive donation from a specific Donor");
        System.out.println("[6] To send donation to a specific Donee");
        System.out.println("[7] To print employees information & salaries for this cycle");
        System.out.println("[8] To print food pantry current supply");
        System.out.println("[9] To Exit");
        System.out.print("Enter your choice: ");

        userIn = io.nextLine();
        int userInt;

        switch(userIn) {
            case "1":
                System.out.print("Please enter their SNN : ");
                int ssn = Integer.parseInt(io.nextLine());
                System.out.print("Please enter their full name: ");
                String name = io.nextLine();
                System.out.print("Please enter their address: ");
                String address = io.nextLine();
                System.out.print("Please enter their birth date (YYYY-DD-MM): ");
                String birthdate = io.nextLine();
                System.out.print("Please enter the day they started (YYYY-DD-MM): ");
                String startdate = io.nextLine();
                System.out.print("Please enter their base salary: ");
                Double salary = (Double.parseDouble(io.nextLine()));

                FullTime temp = new FullTime(ssn, name, address, birthdate, startdate, salary);

                employeesList.add(temp);

                System.out.println("Employee " + temp.getFullName() + " has been added! (Enter any key to return)");
                userIn = io.nextLine();
                break;
            case "2":
                Volunteer temp2 = new Volunteer();
                System.out.print("Please enter their SNN : ");
                temp2.setSSN(Integer.parseInt(io.nextLine()));
                System.out.print("Please enter their full name: ");
                temp2.setFullName(io.nextLine());
                System.out.print("Please enter their address: ");
                temp2.setAddress(io.nextLine());
                System.out.print("Please enter their birth date (YYYY-DD-MM): ");
                temp2.setBirthDate(io.nextLine());
                System.out.print("Please enter the hours they worked: ");
                temp2.setHours(Integer.parseInt(io.nextLine()));
                System.out.print("Please enter their rate of pay per hours: ");
                temp2.setRatePerHour(Double.parseDouble(io.nextLine()));

                employeesList.add(temp2);

                System.out.println("Employee " + temp2.getFullName() + " has been added! (Enter any key to return)");
                userIn = io.nextLine();
                break;
            case "3":
                Donator temp3 = new Donator();
                System.out.print("Please enter their SNN : ");
                temp3.setSSN(Integer.parseInt(io.nextLine()));
                System.out.print("What are they trying to donate? (Dairy, Grain, Produce): ");
                userIn = io.nextLine();

                switch(userIn) {
                    case "Dairy":
                        Dairy dtemp = new Dairy();
                        System.out.print("Please enter the name of the product: ");
                        dtemp.setName(io.nextLine());
                        System.out.print("Please enter the expiration date (YYYY-DD-MM): ");
                        dtemp.setExpirationDate(io.nextLine());
                        System.out.print("Please enter the quantity: ");
                        int tempInt = Integer.parseInt(io.nextLine());
                        while(tempInt<=0) {
                            System.out.print("Please enter a positive number: ");
                            tempInt = Integer.parseInt(io.nextLine());
                        }
                        dtemp.setQuantity(tempInt);
                        System.out.print("Is the item organic? (y/n): ");
                        dtemp.setOrganic(io.nextLine().equals("y"));
                        System.out.print("Is the item none-fat? (y/n): ");
                        dtemp.setNoneFat(io.nextLine().equals("y"));
                        System.out.print("Is the item vegan? (y/n): ");
                        dtemp.setVegan(io.nextLine().equals("y"));
                        temp3.setDonatedFood(dtemp);
                        System.out.println("Donor has been added. Please receive Donor to add their donation to the list.");
                        donorList.add(temp3);
                        break;
                    case "Grain":
                        Grain gtemp = new Grain();
                        System.out.print("Please enter the name of the product: ");
                        gtemp.setName(io.nextLine());
                        System.out.print("Please enter the expiration date (YYYY-DD-MM): ");
                        gtemp.setExpirationDate(io.nextLine());
                        System.out.print("Please enter the quantity: ");
                        gtemp.setQuantity(Integer.parseInt(io.nextLine()));
                        System.out.print("Is the item organic? (y/n): ");
                        gtemp.setOrganic(io.nextLine().equals("y"));
                        System.out.print("Is the item processed? (y/n): ");
                        gtemp.setProcessed(io.nextLine().equals("y"));
                        temp3.setDonatedFood(gtemp);
                        donorList.add(temp3);
                        System.out.println("Donor has been added. Please receive Donor to add their donation to the list.");
                        break;
                    case "Produce":
                        Produce ptemp = new Produce();
                        System.out.print("Please enter the name of the product: ");
                        ptemp.setName(io.nextLine());
                        System.out.print("Please enter the expiration date (YYYY-DD-MM): ");
                        ptemp.setExpirationDate(io.nextLine());
                        System.out.print("Please enter the quantity: ");
                        ptemp.setQuantity(Integer.parseInt(io.nextLine()));
                        System.out.print("Is the item organic? (y/n): ");
                        ptemp.setOrganic(io.nextLine().equals("y"));
                        System.out.print("Is the item a fruit? (y/n): ");
                        ptemp.setOrganic(io.nextLine().equals("y"));
                        temp3.setDonatedFood(ptemp);
                        donorList.add(temp3);
                        System.out.println("Donor has been added. Please receive Donor to add their donation to the list.");
                        break;
                    default:
                        System.out.println("Could not understand your input. Please try again later.");
                }

                System.out.println("\n(Enter any key to return)");
                userIn = io.nextLine();
                break;
            case "4":
                Donee temp4 = new Donee();
                System.out.print("Please enter their SNN : ");
                temp4.setSSN(Integer.parseInt(io.nextLine()));
                System.out.print("Please enter their first and last name: ");
                temp4.setName(io.nextLine());
                System.out.print("Please enter their address: ");
                temp4.setAddress(io.nextLine());
                System.out.print("Please enter the food they need (Grain, Produce, Dairy): ");
                temp4.setFoodNeed(FoodItem.FoodType.valueOf(io.nextLine()));
                doneeList.add(temp4);
                System.out.println("\nDonee has been successfully added. (Enter any key to return)");
                userIn = io.nextLine();
                break;
            case "5":
                System.out.print("Please enter the SSN of the Donor: ");
                userIn = io.nextLine();
                userInt = Integer.parseInt(userIn);
                boolean foundDonator = false;
                for(int i = 0; i<donorList.size(); i++) {
                    if(donorList.get(i).getSSN() == userInt) {
                        donorList.get(i).donate();
                        donorList.remove(i);
                        foundDonator = true;
                    }
                }
                if(!foundDonator) System.out.println("Could not find Donor.");
                else System.out.println("Operation successful.");
                System.out.println("\n(Enter any key to return)");
                userIn = io.nextLine();
                break;
            case "6":
                System.out.print("Enter the SSN of the person receiving the item: ");
                userIn = io.nextLine();
                userInt = Integer.parseInt(userIn);
                int doneePos = -1;
                for(int i = 0; i<doneeList.size(); i++) {
                    if(doneeList.get(i).getSSN() == userInt) {
                        doneePos = i;
                    }
                }
                if(doneePos>=0){
                    System.out.print("Enter the name of the item you wish to donate: ");
                    userIn = io.nextLine();
                    doneeList.get(doneePos).receiveDonation(userIn);
                } else {
                    System.out.println("Could not find Donee.");
                }

                System.out.println("\n(Enter any key to return)");
                userIn = io.nextLine();

                break;
            case "7":
                for(Employee i : employeesList)
                    System.out.println(i.toString());
                System.out.println("\n(Enter any key to return)");
                userIn = io.nextLine();
                break;
            case "8":
                for(FoodItem i : foodSupply)
                    System.out.println(i.toString());
                System.out.println("\n(Enter any key to return)");
                userIn = io.nextLine();
                break;
            case "9":
                System.exit(0);
                break;
            default:
                System.out.println("Could not process input");
        }


    }
}
