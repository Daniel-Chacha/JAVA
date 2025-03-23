import javax.swing.JOptionPane;
import java.util.Scanner;

public class bcsLesson2 {

    public static void main(String[] args){
        String name, temp;
        short yoB;
        int cYear;

        // name =JOptionPane.showInputDialog("Enter your name: ");
        // temp = JOptionPane.showInputDialog(name + " enter year of birth: ");

        // yoB = Short.parseShort(temp);

        // cYear =Integer.parseInt(JOptionPane.showInputDialog("Enter the current year:"));

        // JOptionPane.showMessageDialog(null, name + "you are "+ (cYear- yoB) +"years old.");

        System.out.println("Did I/O using Dialog Boxes");

        bcsLesson2 l2= new bcsLesson2();
        l2.demo();
        setClassVariables();
        l2.setInstanceVariable();
        // main(args);

        System.out.println("Class Variable: "+ classVariable +"\n" + "Instance variable "+ l2.instanceVariable);
    }

    public void demo(){
        System.out.println("Method demo worked.");
        // main(null);
    }

    private static String classVariable;
    private String instanceVariable;

    private static Scanner takeInput = (new Scanner(System.in));

    public static  void setClassVariables(){
        System.out.println("Enter the  value for class Variable");
        classVariable = takeInput.nextLine();
    }

    public  void setInstanceVariable(){
        // bcsLesson2 v1= new bcsLesson2();
        System.out.println("Enter the value for instance variable");
        instanceVariable = takeInput.nextLine();
        
    }
}
