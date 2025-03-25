// package PAYROLL;

public class Main {

    public static void main(String[] args){
        FullTimeEmp emp1 = new FullTimeEmp();
        emp1.displayDetails();
        emp1.calculateSalary();

        PartTimeEmp emp2 = new PartTimeEmp();
        emp2.displayDetails();
        emp2.calculateSalary(6);
    }
}
