

public class Employee {
	
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeSSN;
	private String employeeAddress;
	private String employeeMaritalStatus;
	private double employeeHourlyPayRate;
	private double employeeHoursWorkedPayPeriod1;
	private double employeeHoursWorkedPayPeriod2;
	private int employeeIDNumber;
	
	//Construct an Employee object
	Employee (String firstName, String lastName, String SSN, String address, String maritalStatus, double hourlyPayRate, 
				double hoursWorkedPayPeriod1, double hoursWorkedPayPeriod2, int employeeID)
	{
		employeeFirstName = firstName;
		employeeLastName = lastName;
		employeeSSN = SSN;
		employeeAddress = address;
		employeeMaritalStatus = maritalStatus;
		employeeHourlyPayRate = hourlyPayRate;
		employeeHoursWorkedPayPeriod1 = hoursWorkedPayPeriod1;
		employeeHoursWorkedPayPeriod2 = hoursWorkedPayPeriod2;
		employeeIDNumber = employeeID;
		
	}
	
	public String getFirstName()
	{
		String firstName = employeeFirstName;
		return firstName;
	}
	public void changeFirstName(String newFirstName){
		employeeFirstName = newFirstName;
	}
	
	public String getLastName()
	{
		String lastName = employeeLastName;
		return lastName;
	}
	public void changeLastName(String newLastName){
		employeeLastName = newLastName;
	}
	
	public String getSSN()
	{
		String SSN = employeeSSN;
		return SSN;
	}
	public void changeSSN(String newSSN){
		employeeSSN = newSSN;
	}
	
	public String getAddress()
	{
		String address = employeeAddress;
		return address;
	}
	public void changeAddress(String newAddress){
		employeeAddress = newAddress;
	}
	
	public String getMaritalStatus()
	{
		String maritalStatus = employeeMaritalStatus;
		return maritalStatus;
	}
	public void changeMaritalStatus(String newMaritalStatus){
		employeeMaritalStatus = newMaritalStatus;
	}
	
	public double getHourlyPayRate()
	{
		double hourlyPayRate = employeeHourlyPayRate;
		return hourlyPayRate;
	}
	public void changeHourlyPayRate(double newHourlyPayRate){
		employeeHourlyPayRate = newHourlyPayRate;
	}
	
	public int getEmployeeIDNumber()
	{
		int employeeID = employeeIDNumber;
		return employeeID;
	}
	public void changeEmployeeIDNumber(int newEmployeeIDNumber){
		employeeIDNumber = newEmployeeIDNumber;
	}
	
	public double getHoursWorkedPayPeriod1()
	{
		double payPeriod1 = employeeHoursWorkedPayPeriod1;
		return payPeriod1;
	}
	public void changeHoursWorkedPayPeriod1(double newHoursPeriod1){
		employeeHoursWorkedPayPeriod1 = newHoursPeriod1;
	}
	
	public double getHoursWorkedPayPeriod2()
	{
		double payPeriod2 = employeeHoursWorkedPayPeriod2;
		return payPeriod2;
	}
	public void changeHoursWorkedPayPeriod2(double newHoursPeriod2){
		employeeHoursWorkedPayPeriod2 = newHoursPeriod2;
	}
	
	public String toString()
	{
		String employee = "Employee ID Number: " + employeeIDNumber + "\nEmployee First Name: " + employeeFirstName + "\nEmployee Last Name: " + employeeLastName + 
				"\nEmployee SSN: " + employeeSSN + "\nEmployee Address: " + 
				employeeAddress + "\nEmployee Marital Status: " + employeeMaritalStatus + 
				"\nEmployee Hourly Pay Rate: " + employeeHourlyPayRate + "\nHours worked in pay period 1: " + employeeHoursWorkedPayPeriod1
				+ "\nHours worked in pay period 2: " + employeeHoursWorkedPayPeriod2;
		return employee;
	}
	
	public String toStringForDB()
	{
		String employee = employeeFirstName + "\n" + employeeLastName + "\n" + employeeSSN + "\n" + employeeAddress + "\n" +
							employeeMaritalStatus + "\n" + employeeHourlyPayRate + "\n" + employeeHoursWorkedPayPeriod1 + "\n" + employeeHoursWorkedPayPeriod2
							+ "\n" + employeeIDNumber;
		return employee;
	}
}
