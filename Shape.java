import java.util.Scanner;

public abstract class Shape {
    protected String name;
    protected float dimension1;
    protected int dimension2;

    protected static Scanner input= new Scanner(System.in);

    public Shape(){
        System.out.println("Enter name of  shape: ");
        name = input.nextLine();

        System.out.println("Enter the First dimension: ");
        dimension1 = input.nextFloat();

        System.out.println("Enter the Second dimension: ");
        dimension2 = input.nextInt(); 
        
    }

    public String getName(){
        return name;
    }

    public abstract void getArea();

    public final void sample(){
        System.out.println("This is a final method");
    };

    // public abstract final void test();
}
