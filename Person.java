
import java.util.Scanner;

public class Person {
    private String name, gender;
    private Short yearOfBirth;
    private static Short currentYear = 2025;

    private static Scanner input = new Scanner(System.in);

    // constructor
    public Person() {
        setName();
        setGender();
        setYearOfBirth();
    }

    public void setName() {
        System.out.println("Enter your name: ");
        name = input.nextLine();
    }

    public void setGender() {
        System.out.println("Enter your gender: ");
        gender = input.next();
    }

    public void setYearOfBirth() {
        System.out.println("Enter your year of Birth: ");
        yearOfBirth = input.nextShort();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Short getYearOfBirth() {
        return yearOfBirth;
    }

    public void getDetails() {
        System.out.println("Name: " + getName() + "\n" + "Gender: " + getGender() + "\n" + "Year of Birth: "
                + getYearOfBirth() + "\n" + "Age: " + (currentYear - getYearOfBirth()));

    }

    public static void main(String[] args) {
        Person p1;
        p1 = new Person();
        p1.getDetails();
        p1.setName();
        // p1.setGender();
        p1.setYearOfBirth();
        p1.getDetails();
    }

}





