
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Paycheck {
	
	public static double computeNetPay(Employee a){
		
		double netPay = Paycheck.computeTotalPay(a) - Paycheck.calculateTotalDeductions(a);
		
		//round to 2 decimal places
		netPay = netPay * 100;
		netPay = Math.round(netPay);
		netPay = netPay / 100;
		
		return netPay;
	}
	
	public static double computeTotalPay(Employee a){
		
		double totalPay = a.getHourlyPayRate() * (a.getHoursWorkedPayPeriod1() + a.getHoursWorkedPayPeriod2());
		
		//round to 2 decimal places
		totalPay = totalPay * 100;
		totalPay = Math.round(totalPay);
		totalPay = totalPay / 100;
		
		return totalPay;
	}
	
	public static double calculateTotalDeductions(Employee a){
		
		double totalDeductions = Paycheck.calculateFederalDeductions(a) + Paycheck.calculateFicaDeductions(a) + Paycheck.calculateMedicareDeductions(a) + Paycheck.calculateStateDeductions(a);
		
		//round to 2 decimal places
		totalDeductions = totalDeductions * 100;
		totalDeductions = Math.round(totalDeductions);
		totalDeductions = totalDeductions / 100;
        
		return totalDeductions;
	}
		
	public static double calculateFederalDeductions(Employee a){
		
		final double federalTaxBracket1 = .35;
		final double federalTaxBracket2 = .33;
		final double federalTaxBracket3 = .28;
		final double federalTaxBracket4 = .25;
		final double federalTaxBracket5 = .15;
		final double federalTaxBracket6 = .1;
		
		double totalAnnualEstimatedPay = Paycheck.computeTotalPay(a) * 26;
		double remainingPay = totalAnnualEstimatedPay;
		
		double fedDeductions = 0;
		
		if(a.getMaritalStatus().equals("0")){
		
			if(totalAnnualEstimatedPay >= 379150){
				fedDeductions += ((totalAnnualEstimatedPay - 379150) * federalTaxBracket1) / 26;
				remainingPay = 379149;
			}
			if(remainingPay >= 174400){
				fedDeductions += ((remainingPay - 174400) * federalTaxBracket2) / 26;
				remainingPay = 174399;
			}
			if(remainingPay >= 83600){
				fedDeductions += ((remainingPay - 83600) * federalTaxBracket3) / 26;
				remainingPay = 83599;
			}
			if(remainingPay >= 34500){
				fedDeductions += ((remainingPay - 34500) * federalTaxBracket4) / 26;
				remainingPay = 34499;
			}
			if(remainingPay >= 8500){
				fedDeductions += ((remainingPay - 8500) * federalTaxBracket5) / 26;
				remainingPay = 8499;
			}
			if(remainingPay >= 0){
				fedDeductions += (remainingPay * federalTaxBracket6) / 26;
			}
			
			//round to 2 decimal places
			fedDeductions = fedDeductions * 100;
			fedDeductions = Math.round(fedDeductions);
			fedDeductions = fedDeductions / 100;
			
			return fedDeductions;
		}
		else{
			
			if(totalAnnualEstimatedPay >= 379150){
				fedDeductions += ((totalAnnualEstimatedPay - 379150) * federalTaxBracket1) / 26;
				remainingPay = 379149;
			}
			if(remainingPay >= 212300){
				fedDeductions += ((remainingPay - 212300) * federalTaxBracket2) / 26;
				remainingPay = 212299;
			}
			if(remainingPay >= 139350){
				fedDeductions += ((remainingPay - 139350) * federalTaxBracket3) / 26;
				remainingPay = 139349;
			}
			if(remainingPay >= 69000){
				fedDeductions += ((remainingPay - 69000) * federalTaxBracket4) / 26;
				remainingPay = 68899;
			}
			if(remainingPay >= 17000){
				fedDeductions += ((remainingPay - 17000) * federalTaxBracket5) / 26;
				remainingPay = 16999;
			}
			if(remainingPay >= 0){
				fedDeductions += (remainingPay * federalTaxBracket6) / 26;
			}
			
			//round to 2 decimal places
			fedDeductions = fedDeductions * 100;
			fedDeductions = Math.round(fedDeductions);
			fedDeductions = fedDeductions / 100;
			
			return fedDeductions;
		}
	}
		
		// fica taxes
	public static double calculateFicaDeductions(Employee a){
		
		final double ficaTaxRate = .042;
		final double ficaTaxBracket = 106800;
		
		double totalAnnualEstimatedPay = Paycheck.computeTotalPay(a) * 26;
		double ficaDeductions = 0;
		
		if(totalAnnualEstimatedPay > ficaTaxBracket){
			ficaDeductions = (ficaTaxBracket * ficaTaxRate) / 26;
			
			//round to 2 decimal places
			ficaDeductions = ficaDeductions * 100;
			ficaDeductions = Math.round(ficaDeductions);
			ficaDeductions = ficaDeductions / 100;
			
			return ficaDeductions;
		}
		else{
			ficaDeductions = (totalAnnualEstimatedPay * ficaTaxRate) / 26;
			
			//round to 2 decimal places
			ficaDeductions = ficaDeductions * 100;
			ficaDeductions = Math.round(ficaDeductions);
			ficaDeductions = ficaDeductions / 100;
			
			return ficaDeductions;
		}
	}
	
	public static double calculateMedicareDeductions(Employee a){
		
		final double medicareTaxRate = .0145;

		double medicareDeductions = Paycheck.computeTotalPay(a) * medicareTaxRate;
		
		//round to 2 decimal places
		medicareDeductions = medicareDeductions * 100;
		medicareDeductions = Math.round(medicareDeductions);
		medicareDeductions = medicareDeductions / 100;
		
		return medicareDeductions;
	}
		
		// state taxes
	public static double calculateStateDeductions(Employee a){
		
		final double iowaTaxBracket1 = .09;
		final double iowaTaxBracket2 = .08;
		final double iowaTaxBracket3 = .07;
		final double iowaTaxBracket4 = .06;
		final double iowaTaxBracket5 = .05;
		final double iowaTaxBracket6 = .02;
		final double iowaTaxBracket7 = .01;
		
		double totalAnnualEstimatedPay = Paycheck.computeTotalPay(a) * 26;
		double remainingPay = totalAnnualEstimatedPay;
		double stateDeductions = 0;
		
		if(totalAnnualEstimatedPay >= 65315){
			stateDeductions += ((totalAnnualEstimatedPay - 65315) * iowaTaxBracket1) / 26;
			remainingPay = 65314;
		}
		if(remainingPay >= 42210){
			stateDeductions += ((remainingPay - 42210) * iowaTaxBracket2) / 26;
			remainingPay = 42209;
		}
		if(remainingPay >= 28140){
			stateDeductions += ((remainingPay - 28140) * iowaTaxBracket3) / 26;
			remainingPay = 28139;
		}
		if(remainingPay >= 12663){
			stateDeductions += ((remainingPay - 12663) * iowaTaxBracket4) / 26;
			remainingPay = 12662;
		}
		if(remainingPay >= 5628){
			stateDeductions += ((remainingPay - 5628) * iowaTaxBracket5) / 26;
			remainingPay = 5627;
		}
		if(remainingPay >= 2814){
			stateDeductions += ((remainingPay - 2814) * iowaTaxBracket6) / 26;
			remainingPay = 2813;
		}
		if(remainingPay >= 1407){
			stateDeductions += ((remainingPay - 1407) * iowaTaxBracket7) / 26;
		}
		
		//round to 2 decimal places
		stateDeductions = stateDeductions * 100;
		stateDeductions = Math.round(stateDeductions);
		stateDeductions = stateDeductions / 100;
		
		return stateDeductions;
	}
	
	public static void printPayCheck(Employee a)
	{
		//prints ---------- on top of check
		for(int i = 0; i < 85; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		
		//prints sides of check |             |
		for(int j = 0; j < 12; j++){
			
			for(int i = 0; i < 85; i++){
				
				if(i == 0 || i == 84){
					System.out.print("|");
				}
				// prints company name
				else if(j == 0 && i > 0 && i < 2){
					System.out.print("Company EW");
					i += 9;
				}
				// prints the check number
				else if(j == 0 && i == 77 ){
					System.out.print("12345");
					i += 6;
				}
				// prints the company address
				else if(j == 1 && i > 0 && i < 2 ){
					System.out.print("1234 North Pole LN");
					i += 18;
				}
				// prints the company address line 2
				else if(j == 2 && i > 0 && i < 2 ){
					System.out.print("North Pole, IA 13372");
					i += 20;
				}
				// prints the date
				else if(j == 2 && i == 65){
					DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
					Date date = new Date();
					System.out.print(dateFormat.format(date));
					i += 10;
				}
				// prints the payee
				if(j == 4 && i > 0 && i < 2)
				{
					String firstName = a.getFirstName();
					String lastName = a.getLastName();
					System.out.print("Pay to the order of: " + firstName + " " + lastName);
					i += (22 + firstName.length() + lastName.length());
				}
				// prints the dollar amount
				if(j == 4 && i == 73)
				{
					double totalPay = computeNetPay(a);
					System.out.print("$" + totalPay);
					String totalPayString = Double.toString(totalPay);
					int totalPayLength = totalPayString.length();
					
					i += totalPayLength + 1;
				}
				// prints the bank name
				else if(j == 6 && i > 0 && i < 2){
					System.out.print("Santa Bank");
					i += 10;
				}
				// prints the bank address
				else if(j == 7 && i > 0 && i < 2){
					System.out.print("123 North Pole Dr");
					i += 17;
				}
				// prints the bank address line 2
				else if(j == 8 && i > 0 && i < 2){
					System.out.print("North Pole, IA 13372");
					i += 20;
				}
				// prints what the check is for
				else if(j == 10 && i > 0 && i < 2){
					System.out.print("For: Bi-Weekly Employee Pay");
					i += 26;
				}
				// prints the 'signature'
				else if(j == 10 && i == 59){
					System.out.print("Signed: Santa Claus");
					i += 20;
				}
				// prints the routing and bank account number
				if(j == 11 && i > 0 && i < 2){
					System.out.print(":791234084:  52348912345");
					i += 23;
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		//prints bottom of check -------------
		for(int i = 0; i < 85; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.println();
	}
}

