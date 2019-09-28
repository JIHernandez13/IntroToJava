import javax.swing.JOptionPane;

public class MyClass 

{

public static void main(String[] args)

{

        String inputString; //This is what we will put on the input dialouge box

        String name;

        int hours;

        double payRate;

        double grossPay;

        name=JOptionPane.showInputDialog("What is your name ?");

        inputString=JOptionPane.showInputDialog("How many hours"+"Did you work?");

        hours=Integer.parseInt(inputString);//This will convert it to the integer format since we are using String

        inputString=JOptionPane.showInputDialog("What is your payrate?");

        payRate=Double.parseDouble(inputString);

        grossPay=hours*payRate;

        JOptionPane.showMessageDialog(null,"Hello"+name+"Your GrossPay is $"+grossPay);

        //null is a place holder for the dimensions of the box





}

}
