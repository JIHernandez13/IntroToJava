/*
Objective:	To give students some experience in writing Classes and using properties of inheritance Super and Sub Classes.

Problem:	Design a class called Employee. The Class should keep the following information in
fields:

•	Employee name
•	Employee number in the format XXX-L, where X is a number within range 0-9 and the L is a letter within the range A-M.
•	Hire date

Write appropriate constructor and appropriate accessor methods for the Class.

Next, write a class named ProductionWorker that extends the Employee class. The ProductionWorker class should have the fields to hold the following information:

•	Shift (an interger)
•	Hourly pay rate (a double)

The work day is divided into two shifts: day and night. The shift field has an integer value representing the shift that employee works. The day shift is shift 1 and night shift is shift 2. Write appropriate constructor and methods for the class.

Use Dialog Boxes for input and output. Data should be inputted using both constructor and input Methods. The output display Box should include all the necessary ProductionWorker’s information including shift number, Hourly pay rate, and
Salary/week.

Result:		Demonstrate the Classes by writing a program that uses multiple ProductionWorker
Objects.

*/
import java.util.*;
import java.io.*;

class Employee_number{
  int num;
  char end_num;

  public Employee_number(){
    num=0;
    end_num=0;
  }

  void set_number(int n, char end){
    try {
      //lab formatted it weird, so i'm assuming any 3 digit integer
      if(n>=0 && n<=999  && end >= 'A' && end <= 'M'){
        num=n;
        end_num=end;
      }
      else{
        throw new Exception("bad input");
      }
    } catch(Exception e) {
      System.out.println("exception occurred");
    }
  }

  String get_number(){
    return (String.format("%3d-%c", num, end_num));
  }
}

public class Employee {
  String name;
  Employee_number number = new Employee_number();
  Date start_date = new Date();

  //no need for default constructor
  public Employee(){

  }

  public Employee(String a, Employee_number b, Date c){
    name = a;
    number = b;
    start_date = c;
  }

  public String get_data(){
    return String.format("Name: %s\nID_Number: %s\nDOH: %s\n", name, number.get_number(), start_date);
  }

  public static void main(String[] args) {
    /* code */
  }
}


//enum declaration
//data container for shift_time with accessor function
enum shift_time{
  DAY(1), NIGHT(2);

  private int time;

  private shift_time(int time){
    this.time = time;
  }

  private int get_shift_time(){
    return this.time;
  }
}//end shift_time enum


class ProductionWorker extends Employee implements shift_time {
  int shift;
  double rate;
  shift_time time;

  public void schedule_pay(int s, double r){
    if(shift>=1 || shift <=2){
      switch (s) {
        case(DAY):

        break;

        case(NIGHT):

        break;
      }
    }
    else
    System.out.println("error");
  }
}
