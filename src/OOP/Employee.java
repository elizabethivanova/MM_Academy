package OOP;

public class Employee {
    private final int ID;
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private double salaryPerMonth;

    Employee(int id, String firstName, String lastName){
        this.ID = id;
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
    }
    public int getId(){
        return ID;
    }
    public String getName(){
        return FIRST_NAME + " " + LAST_NAME;
    }
    public double getAnnualSalary(){
        return salaryPerMonth * 12;
    }
    public double raiseSalary(double percentUpdate){
        salaryPerMonth = salaryPerMonth + (salaryPerMonth * percentUpdate / 100);
        return salaryPerMonth;
    }
    public double setSalary(double salary){
        this.salaryPerMonth = salary;
        return salary;
    }
    public void getSalary(){
        System.out.println("Salary per month: " + salaryPerMonth);
        System.out.println("Annual salary: " + salaryPerMonth * 12);
    }

    @Override
    public String toString() {
        return "Employee " +
                "ID: " + ID +
                " First name: '" + FIRST_NAME + '\'' +
                " Last name: '" + LAST_NAME + '\'' +
                " Monthly Salary: " + salaryPerMonth +
                '}';
    }
}
