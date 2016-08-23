
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataBaseTextFile {
	
	
	private static ArrayList<Employee> PayrollArray = new ArrayList<Employee>();
	public static int textFileCounter = 0;
	private FileReader dataBaseFile;
	public DataBaseTextFile(FileReader a)
	{
			dataBaseFile = a;
	}
	
	public static ArrayList<Employee> readFile(FileReader a) throws FileNotFoundException
	{
		Scanner in = new Scanner(a);
		
		while(in.hasNextLine())
		{
			 
			in.useDelimiter(",");
			String firstName = in.nextLine().trim();
			String lastName = in.nextLine().trim();
			String SSN = in.nextLine().trim();
			String address = in.nextLine().trim();
			String maritalStatus = in.nextLine().trim();
			String hourlyPayRate = in.nextLine().trim();
			double hourlyPayRateParsed = Double.parseDouble(hourlyPayRate);
			String hourlyPayRatePayPeriod1 = in.nextLine().trim();
			double hourlyPayRatPayPeriod1Parsed = Double.parseDouble(hourlyPayRatePayPeriod1);
			String hourlyPayRatePayPeriod2 = in.nextLine().trim();
			double hourlyPayRatePayPeriod2Parsed = Double.parseDouble(hourlyPayRatePayPeriod2);
			String ID = in.nextLine().trim();
			int IDParsed = Integer.parseInt(ID);
			
			Employee aEmployee = new Employee(firstName, lastName, SSN, address, maritalStatus, hourlyPayRateParsed, hourlyPayRatPayPeriod1Parsed, 
								hourlyPayRatePayPeriod2Parsed, IDParsed);
			
			PayrollArray.add(aEmployee);
			
		}
		return PayrollArray;
	}
	
	public static void writeToDBTextFile(ArrayList<Employee> a) throws FileNotFoundException
	{
		PrintWriter out = new PrintWriter("EmployeeDatabaseText.txt");
		
		for(int i = 0; i < a.size(); i++)
		{
			String stringForDB = a.get(i).toStringForDB();
			out.println(stringForDB);
			out.flush();
		}
	}
	

}
