import javax.swing.JOptionPane;
import temp.Employee;

class ProductionWorker extends Employee {
    int shift;// 1 is day shift, 2 is night shift
    double pay_rate;
    ProductionWorker(){
      Set_Employee("NAME", 123, "HIRE_DATE");
      shift =1;
      pay_rate = 12.0;
    }
    ProductionWorker(int SHIFT, double PAY_RATE) {
      if (SHIFT ==1 | SHIFT ==2) {
        shift = SHIFT;
      }
      else{
        shift = 1;
        System.out.println("improper number you doughnut");
      }
      pay_rate = PAY_RATE;
      
      Set_Employee("NAME", 123, "HIRE_DATE");
    }// ProductionWorker

    

    public String toString() {
      String val = "Employee Name: " + this.name;
      val += "\nEmployee Number: " + String.format("%3d-L", this.number);
      val += "\nPay Rate: " + this.pay_rate;
      val += "\nShift Number: " + this.shift;
      val += "\nWeekly Salary: " + Double.toString(pay_rate * 40.0);

      return val;
    }// toString
    public static void main(String[] args) {
      String[] input_prompts = { "Name", "Employee Number", "hire date", "pay rate" };
      String[] input = new String[4];// = new String();
      ProductionWorker worker1 = new ProductionWorker(1, 20.0);

      for (int i = 0; i < input_prompts.length; i = i + 1) {
        input[i] = get_input(input_prompts[i]);
      }

      worker1.Set_Employee(input[0], Integer.parseInt(input[1]), input[2]);
      JOptionPane.showMessageDialog(null, worker1);
    }
  }// End ProductionWorker  