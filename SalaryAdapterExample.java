package Adapter;
public class SalaryAdapterExample
{
    public static void main(String args[]){
        HourlyEmployee hourlyEmployee = new HourlyEmployee(20.0, 40);
        SalariedEmployee salariedEmployee = new SalariedEmployee(3000.0);
        SalaryCalculator hourlyEmployeeAdapter = new HourlyEmployeeAdapter(hourlyEmployee);
        SalaryCalculator salariedEmployeeAdapter = new SalariedEmployeeAdapter(salariedEmployee);
        System.out.println("Hourly Employee Salary: $" + hourlyEmployeeAdapter.calculateSalary());
        System.out.println("Salaried Employee Salary: $" + salariedEmployeeAdapter.calculateSalary());
    
    }
}
