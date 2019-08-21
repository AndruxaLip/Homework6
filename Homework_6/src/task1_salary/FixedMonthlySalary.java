package task1_salary;

public class FixedMonthlySalary implements Salary {
	private int salaryOfDay;
	private int workDays;
	public FixedMonthlySalary(int salaryOfDay, int workDays) {
		super();
		this.salaryOfDay = salaryOfDay;
		if((workDays < 30) && (workDays >= 0) ) {
			this.workDays = workDays;
		}
		else {
			this.workDays = 0;
		}
		
	}
	public int getSalaryOfDay() {
		return salaryOfDay;
	}
	public void setSalaryOfDay(int salaryOfDay) {
		this.salaryOfDay = salaryOfDay;
	}
	public int getWorkDays() {
		return workDays;
	}
	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}
	@Override
	public void salary() {
		int salary = getSalaryOfDay() * getWorkDays();
		System.out.println("Employee with fixed monthly salary  gets " + salary + " $");
		
	}
	
	
}
