
import javax.swing.JOptionPane;


public class Administrator {
    private String name;



    public Administrator(){
        System.out.println("Enter the Administrator name: ");
        name= JOptionPane.showInputDialog("Enter your Name: ");

        Person p2;
        p2 = new Person();
    }

    public static void main(String[] args){
        Administrator admin1;
        admin1 = new Administrator();
    }
}
