import java.util.Scanner;
//testing git upload again. 
//Program running code

public class Main {
  public static void main(String[] args) {
    //Generate objects
    Scanner myScanner = new Scanner(System.in);
    PaymentSlip slip1 = new PaymentSlip();
    int testForGit= 0;
    //Take User input
    
    System.out.println("Welcome to the payment slip generator, please enter the employee's name: ");
    slip1.setEmployeeName(myScanner.nextLine());
    System.out.println("What is "+slip1.getEmployeeName()+"'s hourly pay rate?");
    slip1.setHourlyRate(myScanner.nextInt());
    System.out.println("How many hours has "+     slip1.getEmployeeName()+" worked?");
    slip1.setHoursWorked(myScanner.nextInt());
    System.out.println("");
    System.out.println("Thank you for your input, here is " + slip1.getEmployeeName() + "'s payment slip:");
    
    System.out.println(testForGit+"This is a change to test for git.");
    
//Calculations and print out
    System.out.println("");
    System.out.println("--------------------");
    System.out.println("## PAYMENT INFORMATION ##");
    System.out.println("Name:       " + slip1.getEmployeeName());
    System.out.println("Hourly Rate:     "+ slip1.getHourlyRate());
    System.out.println("Hours Worked:     "+ slip1.getHoursWorked());
    System.out.println("");
    System.out.println("Salary before tax:    "+ slip1.calculateSalary(slip1.getHourlyRate(), slip1.getHoursWorked()));
    System.out.println("Salary after tax:    "+ slip1.calculateNetSalary());
    System.out.println("");
    System.out.println("If you have any questions regarding your salary, please contact Bob");
    System.out.println("--------------------");

  }
}

