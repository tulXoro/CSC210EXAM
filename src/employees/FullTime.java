package employees;

import java.util.Calendar;

public class FullTime extends Employee {
    private String startDate;
    private double baseSalary;

    // NOTE: INHERITS VARIABLES FROM Employee.java

    public FullTime() { }

    public FullTime(int ssn, String fullname, String address, String birthDate) {
        super(ssn, fullname, address, birthDate);
    }

    public FullTime(int ssn, String fullname, String address, String birthDate, String startDate, double baseSalary) {
        super(ssn, fullname, address, birthDate);
        this.baseSalary = baseSalary;
        this.startDate = startDate;
    }

    // NOTE: INHERITS SETTERS/GETTERS FROM Employee.java

    // Getters
    public String getStartDate() { return startDate; }

    public double getBaseSalary() { return baseSalary; }

    // Setters
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Manipulators
    // TODO: finish this method
    @Override
    public double calcSalary() {
        int localYear = Calendar.getInstance().get(Calendar.YEAR);
        int years = (Integer.parseInt(startDate.substring(0,4)) - localYear);

        return years * 1.05 + baseSalary;
    }

    public String toString() {
        return "Type: FullTime Employee\n" +
                super.toString() +
                "\nDate Started: " + startDate +
                "\nBase Salary: " + baseSalary;
    }
}
