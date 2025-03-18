



public class Admin {
    public static void main(String[] args){
        //OutPatient 
        OutPatient p1;
        p1 = new OutPatient("Daniel", "Chacha", (short) 2004, 300.5f);
        p1.getPatientDetails();
        p1.setBill();

        InPatient p2;
        p2 = new InPatient("Daniel", "Chacha", (short) 2004, "Ward 7",(short) 5);
        p2.getPatientDetails();
        p2.setBill();
    }
}
