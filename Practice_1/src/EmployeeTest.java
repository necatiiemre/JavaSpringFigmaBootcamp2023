
public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee_1 = new Employee("emre");
		Employee employee_2 = new Employee("Mehmet");
		
		employee_1.setAge(23);
		employee_1.setTitle("Son");
		employee_1.setSalary(4250);
		System.out.println(employee_1);
		
		employee_2.setAge(52);
		employee_2.setTitle("Father");
		employee_2.setSalary(50000);
		System.out.println(employee_2);
	}
}
