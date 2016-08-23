import java.util.ArrayList;
import java.util.Scanner;


public class EditEmployee {

	public static void EditEmployeeMain(ArrayList<Employee> a, int employeeIndex, int typeOfEdit){
		
		Scanner in = new Scanner(System.in);
		
		if(typeOfEdit == 0){
		
			String editSelection;
			
			System.out.println("Please select an attribute to edit:");
			System.out.println("1. First Name");
			System.out.println("2. Last Name");
			System.out.println("3. Social Security Number");
			System.out.println("4. Address");
			System.out.println("5. Employee ID#");
			System.out.println("6. Marital Status");
			System.out.println("7. Hours worked in pay period 1");
			System.out.println("8. Hours worked in pay period 2");
			
			editSelection = in.next();
			
			if(editSelection.equals("1")){
				System.out.println("Please enter the new first name:");
				String firstName = in.next();
				a.get(employeeIndex).changeFirstName(firstName);
			}
			else if(editSelection.equals("2")){
				System.out.println("Please enter the new last name:");
				String lastName = in.next();
				a.get(employeeIndex).changeLastName(lastName);
			}
			else if(editSelection.equals("3")){
				System.out.println("Please enter the new Social Security number:");
				String newSSN = in.next();
				a.get(employeeIndex).changeSSN(newSSN);
			}
			else if(editSelection.equals("4")){
				System.out.println("Please enter the new address:");
				String newAddress = in.next();
				a.get(employeeIndex).changeAddress(newAddress);
			}
			else if(editSelection.equals("5")){
				System.out.println("Please enter the new employee ID:");
				int newEmployeeID = in.nextInt();
				a.get(employeeIndex).changeEmployeeIDNumber(newEmployeeID);
			}
			else if(editSelection.equals("6")){
				System.out.println("Please enter the new marital status, '0' for single and '1' for married:");
				String newMaritalStatus = in.next();
				a.get(employeeIndex).changeMaritalStatus(newMaritalStatus);
			}
			else if(editSelection.equals("7")){
				System.out.println("Please enter the new hours for pay period 1:");
				int newPayPeriod1 = in.nextInt();
				a.get(employeeIndex).changeHoursWorkedPayPeriod1(newPayPeriod1);
			}
			else if(editSelection.equals("8")){
				System.out.println("Please enter the new hours for pay period 2:");
				int newPayPeriod2 = in.nextInt();
				a.get(employeeIndex).changeHoursWorkedPayPeriod2(newPayPeriod2);
			}
			else{
				System.out.println("Invalid input.");
			}
		}
		
		else if(typeOfEdit == 1){
			
			String editSelection;
			
			System.out.println(a.get(employeeIndex).getFirstName() + " " + a.get(employeeIndex).getLastName() + "'s current hours:");
			System.out.println("Pay period 1: " + a.get(employeeIndex).getHoursWorkedPayPeriod1());
			System.out.println("Pay period 2: " + a.get(employeeIndex).getHoursWorkedPayPeriod2());
			System.out.println("----------");
			
			System.out.println("Please select which pay period to edit:");
			System.out.println("1. Period 1");
			System.out.println("2. Period 2");
			
			editSelection = in.next();
			
			if(editSelection.equals("1")){
				System.out.println("Please enter the new hours for pay period 1:");
				int newPayPeriod1 = in.nextInt();
				a.get(employeeIndex).changeHoursWorkedPayPeriod1(newPayPeriod1);
			}
			else if(editSelection.equals("2")){
				System.out.println("Please enter the new hours for pay period 2:");
				int newPayPeriod2 = in.nextInt();
				a.get(employeeIndex).changeHoursWorkedPayPeriod2(newPayPeriod2);
			}
			else{
				System.out.println("Invalid input.");
			}
		}
	}
}
