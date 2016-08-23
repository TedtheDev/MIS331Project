
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Runner {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Employee> PayrollArray = new ArrayList<Employee>();
		//Gets EmployeeDatabaseText.txt file ready for searching
		FileReader DBFile = new FileReader("EmployeeDatabaseText.txt");
		PayrollArray = DataBaseTextFile.readFile(DBFile);
		
		System.out.println("Welcome to the EW Payroll System, version 1.0");
		if(PayrollArray == null){
			System.out.println("No existing employees loaded");
		}
		else{
			if(PayrollArray.size() == 1){
				System.out.println("1 employee has been loaded");
			}
			else{
				System.out.println(PayrollArray.size() + " employees have been loaded");
			}
		}
		
		System.out.println("     ___           ___                    ___           ___           ___           ___           ___           ___           ___");
		System.out.println("    /\\  \\         /\\__\\                  /\\  \\         |\\__\\         /\\  \\         /\\  \\         /\\  \\         /\\__\\         /\\  \\    ");
		System.out.println("   /::\\  \\       /:/ _/_                /::\\  \\        |:|  |       /::\\  \\        \\:\\  \\       /::\\  \\       /::|  |       /::\\  \\   ");
		System.out.println("  /:/\\:\\  \\     /:/ /\\__\\              /:/\\ \\  \\       |:|  |      /:/\\ \\  \\        \\:\\  \\     /:/\\:\\  \\     /:|:|  |      /:/\\ \\  \\  ");
		System.out.println(" /::\\~\\:\\  \\   /:/ /:/ _/_            _\\:\\~\\ \\  \\      |:|__|__   _\\:\\~\\ \\  \\       /::\\  \\   /::\\~\\:\\  \\   /:/|:|__|__   _\\:\\~\\ \\  \\ ");
		System.out.println("/:/\\:\\ \\:\\__\\ /:/_/:/ /\\__\\          /\\ \\:\\ \\ \\__\\     /::::\\__\\ /\\ \\:\\ \\ \\__\\     /:/\\:\\__\\ /:/\\:\\ \\:\\__\\ /:/ |::::\\__\\ /\\ \\:\\ \\ \\__\\");
		System.out.println("\\:\\~\\:\\ \\/__/ \\:\\/:/ /:/  /          \\:\\ \\:\\ \\/__/    /:/~~/~    \\:\\ \\:\\ \\/__/    /:/  \\/__/ \\:\\~\\:\\ \\/__/ \\/__/~~/:/  / \\:\\ \\:\\ \\/__/");
		System.out.println(" \\:\\ \\:\\__\\    \\::/_/:/  /            \\:\\ \\:\\__\\     /:/  /       \\:\\ \\:\\__\\     /:/  /       \\:\\ \\:\\__\\         /:/  /   \\:\\ \\:\\__\\  ");		
		System.out.println("  \\:\\ \\/__/     \\:\\/:/  /              \\:\\/:/  /     \\/__/         \\:\\/:/  /     \\/__/         \\:\\ \\/__/        /:/  /     \\:\\/:/  /  ");	
		System.out.println("   \\:\\__\\        \\::/  /                \\::/  /                     \\::/  /                     \\:\\__\\         /:/  /       \\::/  /   ");
		System.out.println("    \\/__/         \\/__/                  \\/__/                       \\/__/                       \\/__/         \\/__/         \\/__/    ");
		System.out.println();
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		

		
		int runCounter = 0;
		boolean isRunning = true;
		
		if(runCounter != 0){
			isRunning = false;
		}
		
		
		while(isRunning){
			Scanner in = new Scanner(System.in);
			String userSelection;
			
			System.out.println("Please select an option:  (example input: '1')");
			System.out.println("1. Add Employee");
			System.out.println("2. Edit Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Search For Employee");
			System.out.println("5. Enter Hours Worked");
			System.out.println("6. Export Payroll Information to File");
			System.out.println("7. Print Payroll Information");
			System.out.println("8. Print Checks");
			System.out.println("9. Exit");
			System.out.println("10. Enter New Pay Period");
			
			userSelection = in.nextLine();
			
			if(userSelection.equals("1")){ // creates a new employee object
				
				boolean valid = false;
				while(!valid)
				{
				System.out.println("Please enter the employee's first name:");
				String firstName = in.nextLine();
				
				System.out.println("Please enter the employee's last name:");
				String lastName = in.nextLine();
				
				System.out.println("Please enter the employee's Social Security number(no dashes):");
				String sSN = in.nextLine();
				
				System.out.println("Please enter the employee's address (in one line):");
				String address = in.nextLine();
				
				System.out.println("Please enter the employee's ID Number:");
				int ID = in.nextInt(); in.nextLine();
				
				System.out.println("Please enter the employee's marital status (0 for single, 1 for married; if neither is entered single will be assumed):");
				String maritalStatus = in.nextLine();
				if(maritalStatus.equals("0") || maritalStatus.equals("1")){}
				else{maritalStatus = "0";}
				
				System.out.println("Please enter the employee's hourly pay rate:");
				double hourlyPayRate = in.nextDouble(); in.nextLine();
				
				System.out.println("Please enter the employee's work hours in pay period 1:");
				double hoursWorkedPayPeriod1 = in.nextDouble(); in.nextLine();
				
				System.out.println("Please enter the employee's work hours in pay period 2:");
				double hoursWorkedPayPeriod2 = in.nextDouble(); in.nextLine();
				
					if(!valid && !firstName.equals(""))
					{
						for(char c : firstName.toCharArray())
						{
							if (!Character.isDigit(c))
							{
								//do nothing
							}
							else
							{
								valid = true;
								System.out.println("First name is an invalid input. Must contain only letters");
							}
						}
						if(!valid && !lastName.equals(""))
						{
							for(char c : lastName.toCharArray())
							{
								if(!Character.isDigit(c))
								{
									//do nothing
								}
								else
								{
									valid = true;
									System.out.println("Last name is an invalid input. Must contain only letters.");
								}
							}
							if(!valid && !sSN.equals(""))
							{
								for(char c : sSN.toCharArray())
								{
									if(Character.isDigit(c))
									{
										//do nothing
									}
									else
									{
										valid = true;
										System.out.println("Social Securty Number is invalid input. Must contain only numbers.");
									}
								}
								if(!valid && !address.equals(""))
								{
									String toStringHrlyPayRate = "" + hourlyPayRate;
									if(!valid && !toStringHrlyPayRate.equals(""))
									{
										String NEWtoStringHrlyPayRate = "";
										for(char c : toStringHrlyPayRate.toCharArray())
										{
											if(Character.isDigit(c))
											{
												NEWtoStringHrlyPayRate = NEWtoStringHrlyPayRate + c;
											}
												
										}
										for(char c : NEWtoStringHrlyPayRate.toCharArray())
										{
											if(Character.isDigit(c))
											{
												//do nothing
											}
											else
											{
												valid = true;
												System.out.println("Hourly Pay Rate is an invalid input. Must contain only numbers.");
											}
										}
										String toStringHrsWrkdPayPeriod1 = "" + hoursWorkedPayPeriod1;
										if(!valid && !toStringHrsWrkdPayPeriod1.equals(""))
										{
											String NEWtoStringHrsWrkdPayPeriod1 = "";
											for(char c : toStringHrsWrkdPayPeriod1.toCharArray())
											{
												if(Character.isDigit(c))
												{
													NEWtoStringHrsWrkdPayPeriod1 = NEWtoStringHrsWrkdPayPeriod1 + c;
												}
													
											}
											for(char c : NEWtoStringHrsWrkdPayPeriod1.toCharArray())
											{
												if(Character.isDigit(c) || Character.isSpaceChar(c))
												{
													//do nothing
												}
												else
												{
													valid = true;
													System.out.println("Work hours in pay period 1 is an invalid input. Must contain only numbers.");
												}
											}
											String toStringHrsWrkdPayPeriod2 = "" + hoursWorkedPayPeriod2;
											if(!valid && !toStringHrsWrkdPayPeriod2.equals(""))
											{
												String NEWtoStringHrsWrkdPayPeriod2 = "";
												for(char c : toStringHrsWrkdPayPeriod2.toCharArray())
												{
													if(Character.isDigit(c))
													{
														NEWtoStringHrsWrkdPayPeriod2 = NEWtoStringHrsWrkdPayPeriod2 + c;
													}
														
												}
												for(char c : NEWtoStringHrsWrkdPayPeriod2.toCharArray())
												{
													if(Character.isDigit(c) || Character.isSpaceChar(c))
													{
														//do nothing
													}
													else
													{
														valid = true;
														System.out.println("Work hours in pay period 2 is an invalid input. Must contain only numbers.");
													}
												}
												String toStringID = "" + ID;
												if(!valid && !toStringID.equals(""))
												{
													for(char c : toStringID.toCharArray())
													{
														if(Character.isDigit(c))
														{
															//do nothing
														}
														else
														{
															valid = true;
															System.out.println("ID is an invalid input. Must contain only numbers.");
														}
													}
													PayrollArray.add(new Employee(firstName, lastName, sSN, address, maritalStatus, hourlyPayRate, hoursWorkedPayPeriod1, hoursWorkedPayPeriod2, ID ));
													valid = true;
												}//eighth if statement with ID
												else
												{
													System.out.println("Must have an ID number.");
												}
											}// seventh if statement with pay period 2
											else
											{
												System.out.println("Must have weekly number of hours for pay period 2, even 0.");
											}
										}//sixth if statement with pay period 1
										else
										{
											System.out.println("Must have weekly number of hours for pay period 1, even 0.");
										}
									}//fifth if statement with hourly pay rate
									else
									{
										System.out.println("Must have a hourly pay rate.");
									}
								}//fourth if statement with address
								else
								{
									System.out.println("Need to have an address.");
								}
								
							}//third if statement with SSN != ""
							else
							{
								System.out.println("Must have a SS number.");
							}
							
						
							
						}//second if statement with last name !null
						else
						{
							System.out.println("Must have a last name.");
						}
					}//first if statement with first name !null
					else
					{
						valid = true;
						System.out.println("Must have a first name.");
					}
					
					if(!valid)
					{
					System.out.println("Incorrect data input. Reenter please.");
					}
				}
				System.out.println("-------------------------------------------------------------------");
			}
				
			else if(userSelection.equals("2")){ // calls method to search for an employee, then asks what information to change
				
				int employeeIndex = SearchForEmployee.searchForEmployeeIndex(PayrollArray);
				
				if(employeeIndex >= 0){
					EditEmployee.EditEmployeeMain(PayrollArray, employeeIndex, 0);
					System.out.println("-------------------------------------------------------------------");
				}
			}
			else if(userSelection.equals("3")){ // calls method to search for an employee, then asks if they're sure they want to delete
				
				int employeeIndex = SearchForEmployee.searchForEmployeeIndex(PayrollArray);
						
				if(employeeIndex >= 0){
					DeleteEmployee.DeleteEmployeeIndex(PayrollArray, employeeIndex);
				}
				
				System.out.println("-------------------------------------------------------------------");
			}
			else if(userSelection.equals("4")){ // calls method to search for an employee
				
				int employeeIndex = SearchForEmployee.searchForEmployeeIndex(PayrollArray);
				
				if(employeeIndex >= 0){
					System.out.println();
					System.out.println(PayrollArray.get(employeeIndex));
				}
				
				System.out.println("-------------------------------------------------------------------");
			}
			else if(userSelection.equals("5")){ // calls method to search for an employee, then enters payroll information
				
				int employeeIndex = SearchForEmployee.searchForEmployeeIndex(PayrollArray);
				
				if(employeeIndex >= 0){
					EditEmployee.EditEmployeeMain(PayrollArray, employeeIndex, 1);
				}
				
				System.out.println("-------------------------------------------------------------------");
			}
			else if(userSelection.equals("6")){ // calls method to export the array list to a text file
				
				ExportPayrollInformation.ExportPayrollInfo(PayrollArray);
				
			}
			else if(userSelection.equals("7")){ // prints the array list to the console
				
				for(int i = 0; i < PayrollArray.size(); i++)
				{
					System.out.println(PayrollArray.get(i).toString());
					System.out.println("Current projected:");
					System.out.println("Total pay: $" + Paycheck.computeTotalPay(PayrollArray.get(i)));
					System.out.println("Net pay: $" + Paycheck.computeNetPay(PayrollArray.get(i)));
					System.out.println("Total deductions: $" + Paycheck.calculateTotalDeductions(PayrollArray.get(i)));
					System.out.println("Federal deductions: $" + Paycheck.calculateFederalDeductions(PayrollArray.get(i)));
					System.out.println("FICA deductions: $" + Paycheck.calculateFicaDeductions(PayrollArray.get(i)));
					System.out.println("Medicare deductions: $" + Paycheck.calculateMedicareDeductions(PayrollArray.get(i)));
					System.out.println("State (IA) deductions: $" + Paycheck.calculateStateDeductions(PayrollArray.get(i)));
					
					if(i >= 0)
					{
						System.out.println("-------------------------------------------------------------------");
					}
					else
					{
						System.out.println("-------------------------------------------------------------------");
					}
				}
				System.out.println("-------------------------------------------------------------------");
				
			}
			else if(userSelection.equals("8")){ // calls the createChecks method, exporting all checks to a text file
				
				System.out.println("Press 1 to print all checks or 2 to print a single check for an employee: ");
				String checkAnswer = in.nextLine();
				if(checkAnswer.equals("1"))
				{
					for(int i = 0; i < PayrollArray.size(); i++)
					{
						Paycheck.printPayCheck(PayrollArray.get(i));
					}
				}
				else if(checkAnswer.equals("2"))
				{
					int employeeIndex = SearchForEmployee.searchForEmployeeIndex(PayrollArray);
					
					if(employeeIndex >= 0){
						Paycheck.printPayCheck(PayrollArray.get(employeeIndex));
					}
				}
				else
				{
					System.out.println("Invalid input, please try again.");
				}
			}
			else if(userSelection.equals("9")){ // calls method to save off the array list data to a text file, then exits
				
				runCounter++;
				isRunning = false;
			}
			else if(userSelection.equals("10")){// sets every employee's pay periods to 0
				double setToZero = 0;
				System.out.println("Are you sure you want to set EVERY employee's hours to 0? Enter 'y' for yes and 'n' for no.");
				String setAnswer = in.nextLine();
				if(setAnswer.equalsIgnoreCase("y"))
				{
					for(int i = 0; i < PayrollArray.size(); i++)
					{
						PayrollArray.get(i).changeHoursWorkedPayPeriod1(setToZero);
						PayrollArray.get(i).changeHoursWorkedPayPeriod2(setToZero);
					}
					System.out.println("All hours set to 0.");
				}
				else if(setAnswer.equalsIgnoreCase("n"))
					; //do nothing
				else
				{
					System.out.println("Invalid input, please try again.");
				}
			}
			else{
				System.out.println("Invalid input.");
				System.out.println("-------------------------------------------------------------------");
				
			}
		}
		DataBaseTextFile.writeToDBTextFile(PayrollArray);
	}
}
