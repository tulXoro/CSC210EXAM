package employees;

import java.awt.*;

public class Volunteer extends Employee {
    private int hours;
    private double ratePerHour;

    // NOTE: INHERITS VARIABLES FROM Employee.java

    public Volunteer() { }

    public Volunteer(int ssn, String fullname, String address, String birthDate) {
        super(ssn, fullname, address, birthDate);
    }

    public Volunteer(int ssn, String fullname, String address, String birthDate, int hours, double ratePerHour) {
        super(ssn, fullname, address, birthDate);
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    // NOTE: INHERITS SETTERS/GETTERS FROM Employee.java

    // Getters
    public int getHours() { return hours; }

    public double getRatePerHour() { return ratePerHour; }

    // Setters
    public void setHours(int hours) { this.hours = hours; }

    public void setRatePerHour(double ratePerHour) { this.ratePerHour = ratePerHour; }

    // Manipulators
    @Override
    public double calcSalary() {
        return hours * ratePerHour;
    }

    public String toString() {
        return "Type: Volunteer\n" +
                super.toString() +
                "\nHours: " + hours +
                "\nRate Per Hour: " + ratePerHour;
    }
}
