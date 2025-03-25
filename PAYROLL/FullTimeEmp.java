// package PAYROLL;

public class FullTimeEmp extends Employee{
    private float bonus;

    public FullTimeEmp(){
        super();
        System.out.println("Enter "+ name + "\' Bonus: ");
        bonus = input.nextFloat();
    }

    public void calculateSalary(){
        System.out.println(name +"\' salary is: " + salary+bonus );
    }
}
