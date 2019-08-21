package task1_salary;

public class HourlySalary implements Salary {

	 private int horhyWage;
	 private int hoursPerMonth;
	public HourlySalary(int horhyWage, int hoursPerMonth) {
		super();
		this.horhyWage = horhyWage;
		this.hoursPerMonth = hoursPerMonth;
	}
	public int getHorhyWage() {
		return horhyWage;
	}
	public void setHorhyWage(int horhyWage) {
		this.horhyWage = horhyWage;
	}
	public int getHoursPerMonth() {
		return hoursPerMonth;
	}
	public void setHoursPerMonth(int hoursPerMonth) {
		this.hoursPerMonth = hoursPerMonth;
	}
	@Override
	public void salary() {
		int salary = getHorhyWage() * getHoursPerMonth();
		System.out.println("Employee with hourly salary gets at the end of the month " + salary + " $");
		
	}
	 
	 
}
