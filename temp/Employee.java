package temp;
import javax.swing.JOptionPane;

public class Employee {
    public String name;
    public int number;
    public String hire_date;

    /**
     * Brief: Default Constructor
     * 
     * @PARAMS: NONE Summary: NONE
     */
    public Employee() {

    }// End Employee

    /**
     * Brief: Employee class that takes in employee information
     * 
     * @PARAM 1: Employee name
     * @PARAM 2: Employee number
     * @PARAM 3: Date of Hire (Date object) Summary: Constructor to set all the
     *        fields via Set_Employee method
     */
    public Employee(String Name, int Number, String DOH) {
      Set_Employee(Name, Number, DOH);
    }// Employee

    public void Set_Employee(String NAME, int NUMBER, String HIRE_DATE) {
      name = NAME;
      hire_date = HIRE_DATE;
      number = NUMBER;
    }// Set_Employee
  

  public static String get_input(String prompt) {
    return JOptionPane.showInputDialog(null, prompt);
  }

  public static void main(String[] args) {
    
  }
}
