import javax.swing.JOptionPane;
import java.util.Arrays;

public class Demo {
    private String user;
    private Integer year;

    public  Demo(){
        user = JOptionPane.showInputDialog("Enter your name: ");
        year =Integer.parseInt( JOptionPane.showInputDialog(user + "Enter year: ") );
    }

    public Demo(String x, int y){
        user = x;
        year =y;
    }

    public void setUser(){
        user = JOptionPane.showInputDialog("Enter your name: ");
    }

    public void setYear(){
        year =Integer.parseInt( JOptionPane.showInputDialog(user + "Enter year: ") );
    }

    public String getUser() {
        return user;
    }

    public Integer getYear(){
        return year;
    }

    public static void myArray(){
        String[] names = new String[3];
        byte[] marks = { 82, 64,25, 40, 55,};

        // for(byte x=0; x< names.length; x++){
        //     names[x] = JOptionPane.showInputDialog("Enter name " + (x+1));
        // }
        System.out.println("Below are the scores of the Students: ");
        for (byte k: marks){
            System.out.print(k + ", ");
        }

        // Arrays.sort(marks);
        for (byte z=0; z< marks.length; z++){
            for (byte m=0; m <= marks.length-1; m++)
            if (marks[z] < marks[m]){
                byte temp = marks[z];
                marks[z] =marks[m];
                marks[m]=temp;
            }
            
        }

        System.out.println("\n Sorted: ");
        for (byte k: marks){
            System.out.print(k + ", ");
        }
    }

    public static int compute(int ...values){
        int sum =0;
        for (int x: values){
            sum +=x;
        }
        return sum;
    }

    public static void main(String[] arg){
        // Demo d1;
        // d1 = new Demo();
        // d1.getUser();
        // JOptionPane.showMessageDialog(null, "UserName" +  d1.getUser() +  "\n Year" + d1.getYear());
       
        myArray();
        // System.out.println("Sum of three numbers: " + compute(1,2,3));
        // System.out.println("Sum of 5 mutiples of 10 numbers: " + compute(10,20,30,40,50));
    }
}
