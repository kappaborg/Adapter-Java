package Adapter;

class SalariedEmployeeAdapter implements SalaryCalculator
{
   private SalariedEmployee salariedEmployee;
   public SalariedEmployeeAdapter(SalariedEmployee salariedEmployee){
       this.salariedEmployee = salariedEmployee;
   }
   public double calculateSalary(){
       return salariedEmployee.calculateMonthlySalary();
   }
}
