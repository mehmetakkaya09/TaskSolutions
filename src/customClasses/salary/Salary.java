package customClasses.salary;

public class Salary {
    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;

    public Salary(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }
    public double stateTax(){
        return salary() * stateTaxRate /100;
    }
    public double federalTax(){
        return salary() * federalTaxRate / 100;
    }
    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }
    public String toString(){
        return "{" +
                "Salary = " + salary() +
                ", State Tax =" + stateTax() +
                ", Federal Tax = " + federalTax() +
                " ,Salary After Tax = " + salaryAfterTax() +
                '}';
    }


}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */