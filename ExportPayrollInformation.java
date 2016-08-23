
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ExportPayrollInformation {
	
	static ArrayList<Employee> PayrollArray;
	
	ExportPayrollInformation(ArrayList<Employee> a)
	{
		PayrollArray = a;
	}
	
	//Writes employee data to each line in txt file
	//PrintWriter out = new PrintWriter("EmployeeDatabaseText.txt");
	public static void ExportPayrollInfo(ArrayList<Employee> a) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Name the file in which you want to export the information to: ");
		String file = console.nextLine();
		File inputFile = new File(file);
		PrintWriter out = new PrintWriter(inputFile);
		for(int i = 0; i < a.size(); i++)
		{
			out.println(a.get(i).toString());
			out.println(PayrollArray.get(i).toString());
			out.println("Current projected:");
			out.println("Total pay: $" + Paycheck.computeTotalPay(PayrollArray.get(i)));
			out.println("Net pay: $" + Paycheck.computeNetPay(PayrollArray.get(i)));
			out.println("Total deductions: $" + Paycheck.calculateTotalDeductions(PayrollArray.get(i)));
			out.println("Federal deductions: $" + Paycheck.calculateFederalDeductions(PayrollArray.get(i)));
			out.println("FICA deductions: $" + Paycheck.calculateFicaDeductions(PayrollArray.get(i)));
			out.println("Medicare deductions: $" + Paycheck.calculateMedicareDeductions(PayrollArray.get(i)));
			out.println("State (IA) deductions: $" + Paycheck.calculateStateDeductions(PayrollArray.get(i)));
			out.println("-------------------------------------------------------------");
		}
		out.close();
	}

}
