
package roundingerror;

import javax.swing.JOptionPane;


public class RoundingError {

    
    public static void main(String[] args) {
        String numberStr = JOptionPane.showInputDialog("Enter a number");
        double number = Double.parseDouble(numberStr);
        double numberSquareRoot = Math.pow(Math.sqrt(number), 2);
        double finalanswer = number-numberSquareRoot;
        JOptionPane.showMessageDialog(null, "Square root of "
		+number + " is "+numberSquareRoot+ "\nThe round off error is " +finalanswer);
        
        
        
    
    
    
    
    
    
    
    
    
    }
    
}
