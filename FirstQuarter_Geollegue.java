import javax.swing.JOptionPane;
public class FirstQuarter_Geollegue {
    public static void main(String[] args){
        
        JOptionPane.showMessageDialog(null, "\n------------------------------------------------------------------------------"
                + "\nThis program will perform basic arithmetic operations"
                + "\n------------------------------------------------------------------------------");
       // creates the first panel.
       
        double x = Double.parseDouble((JOptionPane.showInputDialog(null, "--------------------------------------------------------------"
                + "\nPlease enter input 1 here: ") ));
        //asks for first input.
        double y = Double.parseDouble((JOptionPane.showInputDialog(null, "Please enter input 2 here: "
                + "\n--------------------------------------------------------------") ));
        //asks for second input.
        
        double result1, result2, result3, result4; 
        
        result1 = x + y; 
        //applies addition to both inputs.
        result2 = x - y; 
        //applies subtraction to both inputs. 
        result3 = x * y; 
        //applies multiplication to both inputs
        result4 = x / y; 
        //applies division 
        
        JOptionPane.showMessageDialog(null, "The sum of " + x + " and " + y + " is: " + result1
        + "\nThe difference of " + x + " and " + y + " is: " + result2
        + "\nThe product of " + x + " and " + y + " is: " + result3
        + "\nThe qoutient of " + x + " and " + y + " is: " + result4);
        //shows the result.
        //hanz jay geollegue
    }
}
