


import java.util.Scanner;

public class Patient {
    protected String name, gender, prescription;
    protected short yoB;
    protected float bill;

    protected  static Scanner input = new Scanner(System.in);

    // public()
    // public Patient(){};
    public Patient(String x, String y, Short z){
        name = x;
        gender =y;
        yoB = z;
    }

    public void setBill(){}

    public void setPrescription(){
        System.out.println("Enter " +name+ "\' prescription");
        prescription = input.nextLine();
    }

    public void getPatientDetails(){
        System.out.println("----PATIENT---- \n Name:" + name + "\n Gender: " + gender +"\n Year of Birth: "+ yoB + "\n Bill: " + bill + "\n Prescription: " + prescription);
    }

    public static void main(String[] args){};
}
