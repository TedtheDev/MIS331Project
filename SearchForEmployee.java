import java.util.ArrayList;
import java.util.Scanner;


public class SearchForEmployee {
	
	public static int searchForEmployeeIndex(ArrayList<Employee> a){
		
		Scanner in = new Scanner(System.in);

		int employeeIndex;
		
		System.out.println("Press 1 to search by Employee ID or press 2 to search by name: ");
		String choice = in.nextLine();
		
		if(choice.equals("2")){
			
			System.out.println("Enter last name of Employee: ");
			String lastName = in.nextLine();
			System.out.println("Enter first name of Employee: ");
			String firstName = in.nextLine();
	
			employeeIndex = SearchForEmployee.searchForEmployeeByName(a, lastName, firstName);
			
			if(employeeIndex >= 0){
				return employeeIndex;
			}
			else{
				System.out.println("Employee does not exist or input was incorrect");
			}
		}
		else if(choice.equals("1")){
			
			System.out.println("Enter Employee ID: ");
			String IDNumber = in.nextLine();
			int IDNumber1 = Integer.parseInt(IDNumber);
			
			employeeIndex = SearchForEmployee.searchForEmployeeByID(a, IDNumber1);
			
			if(employeeIndex >= 0){
				return employeeIndex;
			}
			else{
				System.out.println("Employee does not exist or input was incorrect");
			}
		}
		else{
			System.out.println("Not a valid option.");
		}
		return -1;
	}
	
	public static int searchForEmployeeByName(ArrayList<Employee> a, String lastName, String firstName){
		
		firstName = firstName.toUpperCase();
		lastName = lastName.toUpperCase();
		
		for(int i = 0; i < a.size(); i++)
		{
			if(lastName.equals(a.get(i).getLastName().toUpperCase()))
			{
				if(firstName.equals(a.get(i).getFirstName().toUpperCase()))
				{
					return i;
				}
			}
		}
		return -1;
	}
	
	public static int searchForEmployeeByID(ArrayList<Employee> a , int ID){
		
		for(int i = 0; i < a.size(); i++)
		{
			if(ID == a.get(i).getEmployeeIDNumber())
			{
				return i;
			}
		}
		return -1;
	}

}
