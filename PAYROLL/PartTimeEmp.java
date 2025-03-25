// package PAYROLL;

public class PartTimeEmp extends Employee{
    private float hourlyRate;

    public PartTimeEmp(){
        super();
        System.out.println("Enter "+ name +"\' Hourly Rate: ");
        hourlyRate = input.nextFloat();
    }

    public void calculateSalary(int hoursWorked){
        System.out.println(name+ "\' salary: " + salary+(hourlyRate * hoursWorked));
    }
}
