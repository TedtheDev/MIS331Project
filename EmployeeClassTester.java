
public class EmployeeClassTester {
	
	public static void main(String[] args)
	{
		Employee bobJones = new Employee("Bob", "Jones", "111-11-1111", "123 Fake Street", "Single", 80.21, 10, 10, 1);
		System.out.println(bobJones.getFirstName());
		
		System.out.println(bobJones);
	}

}
