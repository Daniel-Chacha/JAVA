

import javax.swing.JOptionPane;
public class Converter {   

    public static void main(String[] args){
        int fahrenHeit;
        float celcious;
    
        fahrenHeit= Integer.parseInt(JOptionPane.showInputDialog("Enter temp. in FahrenHeit: "));
                     
        celcious = (fahrenHeit - 32) * 5/9;
        JOptionPane.showMessageDialog(null, fahrenHeit + "F into celciuos is "+ celcious);
        
    } 
}
