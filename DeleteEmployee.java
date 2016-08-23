import java.util.ArrayList;
import java.util.Scanner;


public class DeleteEmployee {
	
	public static void DeleteEmployeeIndex(ArrayList<Employee> a, int employeeIndex) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Are you sure you want to delete the below employee?  If yes, enter 'y', otherwise enter 'n'");
		System.out.println();
		System.out.println(a.get(employeeIndex));
		
		String userSelection = in.next();
		
		if(userSelection.equals("y")){
			a.remove(employeeIndex);
			System.out.println("The employee has been deleted.");
			return;
		}
	}
}
