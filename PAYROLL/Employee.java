// package PAYROLL;
import java.util.Scanner;

public class Employee {
    protected String name;
    protected short empID;
    protected float salary;

    protected static Scanner input = new Scanner(System.in);

    public Employee(){
        System.out.println("Enter Employee name: ");
        name = input.nextLine();

        System.out.println("Enter Employee ID: ");
        empID = input.nextShort();

        System.out.println("Enter Employee Salary: ");
        salary = input.nextFloat();
    }

    public  void displayDetails(){
        System.out.println("----Employee Details---- \n" + "Name: "+ name +"\n ID :"+ empID + "\nSalary: "+ salary);
    }
}
