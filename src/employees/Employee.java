package employees;

public abstract class Employee {

    // Protected vars
    protected int ssn;
    protected String fullName;
    protected String address;
    protected String birthDate;

    public Employee() {

    }

    public Employee(int ssn, String fullName, String address, String birthDate) {
        this.ssn = ssn;
        this.fullName = fullName;
        this.address = address;
        this.birthDate = birthDate;
    }

    // Getters
    public int getSSN() { return ssn; }

    public String getFullName() { return fullName; }

    public String getAddress() { return address; }

    public String getBirthDate() { return birthDate; }

    // Setters
    public void setSSN(int ssn) { this.ssn = ssn; }

    public void setFullName(String fullName) { this.fullName = fullName; }

    public void setAddress(String address) { this.address = address; }

    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    // Manipulators
    public abstract double calcSalary();

    public String toString() {
        return "Social Security Number: " + ssn +
                "\nFull Name: " + fullName +
                "\nAddress: " +  address +
                "\nBirth date: " + birthDate +
                "\nCalculated Salary: " + calcSalary();
    }



}
