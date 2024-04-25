package Adapter;

class HourlyEmployeeAdapter implements SalaryCalculator {
    private HourlyEmployee hourlyEmployee;
    public HourlyEmployeeAdapter(HourlyEmployee hourlyEmployee){
    this.hourlyEmployee = hourlyEmployee;
    }
    public double calculateSalary(){
        return hourlyEmployee.calculateHourlySalary();
    }
}