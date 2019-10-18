import java.util.regex.*;
import java.util.Date;
import javax.swing.JOptionPane;

public class lab6{
  class Employee{
    String name;
    String number;
    Date hire_date;

    /**
    Brief: Default Constructor
    @PARAMS: NONE
    Summary: NONE
    */
    Employee(){

    }//End Employee

    /**
    Brief: Employee class that takes in employee information
    @PARAM 1: Employee name
    @PARAM 2: Employee number (XXX-L)
    @PARAM 3: Date of Hire (Date object)
    Summary: Constructor to set all the fields via Set_Employee method
    */
    Employee(String Name, String Number, Date DOH){
      Set_Employee(Name,Number,DOH);
    }//Employee

    void Set_Employee(String NAME, String NUMBER, Date HIRE_DATE){
      name=NAME;
      hire_date=HIRE_DATE;

      { //verifies correct format for employee number
        if(Pattern.matches("[0-9]{3}-L",NUMBER)){
          number=NUMBER;
        }

        else{
          System.out.println("pick an employee # in the form of XXX-L where X is any # between 0-9");
        }

      }

    }//Set_Employee

  }//End Class

  class ProductionWorker extends Employee{
    int shift;//1 is day shift, 2 is night shift
    double pay_rate;

    ProductionWorker(int SHIFT, double PAY_RATE){
      if (Pattern.matches("1 | 2",Integer.toString(SHIFT))) {
        shift= SHIFT;
      }
      pay_rate=PAY_RATE;
    }//ProductionWorker

    public String toString(){
      String val = "Employee Name: " + this.name;
      val += "\nEmployee Number: " + this.number;
      val += "\nPay Rate: " + this.pay_rate;
      val += "\nShift Number: " + this.shift;
      val += "\nWeekly Salary: " + Double.toString(pay_rate*40.0);

      return val;
    }//toString

  }//End ProductionWorker

  static String get_input(String prompt){
    return JOptionPane.showInputDialog(null,prompt);
  }

  public static void main(String[] args) {
    String[] input_prompts={
      "Name","Employee Number","pay_rate", "shift","Salary"
    };

    String[] input = new String[5];// = new String();

    for (int i =0; i<input_prompts.length; i=i+1) {
      input[i]=get_input(input_prompts[i]);
    }
  }
}
