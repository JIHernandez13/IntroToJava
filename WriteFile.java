import java.util.Scanner;
import java.io.*;
public class WriteFile
{
  public static void main(String[] args) throws IOException
  {
    String filename;      // File name
    int arrayNumber;    // Array Name

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Get the filename.
    System.out.print("Enter the filename: ");
    filename = keyboard.nextLine();

    // Open the file.
    PrintWriter outputFile = new PrintWriter(filename);
    PrintWriter fil = new PrintWriter(filename);
    fil.println("ass");

    System.out.print("Enter 10 numbers: \n\n");
    // Get data and write it to the file.
    for (int i = 1; i <=10; i++)
    {
      // Get the Numbers.
      System.out.print("Enter Number " + i + ": ");
      arrayNumber = keyboard.nextInt();
      // Write the name to the file.
      outputFile.println(arrayNumber);
    }
    // Close the file.
    outputFile.close();
    System.out.println("Data written to the file.");
  }
}
