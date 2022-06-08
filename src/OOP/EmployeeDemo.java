package OOP;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee one = new Employee(789, "Hristo", "Stoichkov");
        one.setSalary(2000); //2000
        one.getSalary();
        one.getAnnualSalary(); //2000*12=24000
        one.raiseSalary(5); //5% = 100 - 2100
        one.getAnnualSalary(); //25200
        one.getSalary();
        one.getName(); // Hristo Stoichkov
        System.out.println(one);

    }
}
