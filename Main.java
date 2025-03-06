import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to Java!");
        System.out.println("5+3");
        System.out.println(5+3);
        System.out.println("Sum of 3 & 4 is " + (3+4));

        Scanner input= new Scanner(System.in);
        int yoB; String name;

        System.out.println("Enter your name: ");
        name= input.nextLine();

        System.out.println(name +" Enter your year of Birth: ");
        yoB =input.nextInt();

        System.out.println(name + " you are "+ (2025-yoB) +" years old.");
    }
} 