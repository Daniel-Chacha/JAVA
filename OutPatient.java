



public class OutPatient extends Patient {
    private float consultFee;
    
    // public OutPatient(){}
    public OutPatient(String w, String x, Short y ,Float z){
        super(w, x, y);
        consultFee = z;
    }
    public void setBill(){
        short drugs = 1000;
                
        bill = consultFee + drugs;
        System.out.println( name + "\'s Bill:" + bill); 
    }
}
