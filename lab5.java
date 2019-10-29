import javax.swing.JOptionPane;
import temp.Temperature;

public class lab5

{

  public static void main(String[] args)

  {
    String input = new String();
    String output = new String();

    input=JOptionPane.showInputDialog("Enter the temperature in degrees F");

    double n = Double.parseDouble(input);
    Temperature ob = new Temperature(n);  //using the default constructor

    output = String.format("%f F\n%f C\n%f K\n",ob.getFahrenheit(),ob.celsius(),ob.kelvin());
    JOptionPane.showMessageDialog(null,output);

    input=JOptionPane.showInputDialog("Enter the temperature in degrees F");
    n = Double.parseDouble(input);
    ob.setFahrenheit(n);  //using the set method

    output = String.format("%f F\n%f C\n%f K\n",ob.getFahrenheit(),ob.celsius(),ob.kelvin());

    JOptionPane.showMessageDialog(null,output);

  }

}
