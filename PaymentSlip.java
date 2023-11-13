// PaymentSlip Class
public class PaymentSlip {
  private String employeeName;
  private int hourlyRate;
  private int hoursWorked;
  final private double taxRate = 0.7;

  //Constructor w no parameters
  public PaymentSlip(){
    
  }

 //Constructor w parameters
  public PaymentSlip(String employeeName, int hourlyRate, int hoursWorked) {
    this.employeeName = employeeName;
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  //Getters and Setters Method

  //Why do we have to have Getters and Setters? Couldn't we just return the values when needed instead of writing a whole method?

  public String getEmployeeName() {
   return employeeName;
  }
  public void setEmployeeName(String employeeName) {
  this.employeeName = employeeName;
  }
  public int getHourlyRate() {
   return hourlyRate;
  }
  public void setHourlyRate(int hourlyRate) {
   this.hourlyRate = hourlyRate;
  }
  public int getHoursWorked() {
   return hoursWorked;
  }
  public void setHoursWorked(int hoursWorked)   {
  this.hoursWorked = hoursWorked;
  }
  public int calculateSalary(int hourlyRate, int hoursWorked) {
    return hourlyRate*hoursWorked;
  }
  //According to case, tax is always 30%, thus a multiplier of 0.7
  public double calculateNetSalary(){
    double baseSalary = this.calculateSalary(hourlyRate, hoursWorked);
    return baseSalary*taxRate;
  }
}
