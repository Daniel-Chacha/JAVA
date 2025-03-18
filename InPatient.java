



public class InPatient extends Patient {
    private String ward;
    private short days;

    // public InPatient(){};
    public InPatient(String w, String x, Short y, String z, Short a){
        super(w, x, y);
        ward =z;
        days = a;
    }

    public void setBill(){
        short drugs = 1000;
        short dailyCharge = 250;
        bill = drugs + (days * dailyCharge);

        System.out.println(name +"\' Bill "+ bill);
    }
}
