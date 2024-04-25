package Adapter;

interface SalaryCalculator{
    double calculateSalary();
}
class HourlyEmployee {
    private double hourlyRate;
    private int hoursWorked;
    public HourlyEmployee(double hourlyRate, int hoursWorked){
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateHourlySalary(){
        return hourlyRate*hoursWorked;
    }
}
class SalariedEmployee{
  private double monthlySalary;
  public SalariedEmployee(double monthlySalary){
      this.monthlySalary = monthlySalary;
  }
  public double calculateMonthlySalary(){
      return monthlySalary;
  }
}