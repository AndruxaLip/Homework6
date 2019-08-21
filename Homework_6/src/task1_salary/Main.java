package task1_salary;

public class Main {

	public static void main(String[] args) {
		HourlySalary employee1 = new HourlySalary(20, 160);
		FixedMonthlySalary employee2 = new FixedMonthlySalary(200, 25);
		employee1.salary();
		employee2.salary();

	}

}
