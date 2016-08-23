import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class DataBaseTester {
	
	private static ArrayList<Employee> PayrollArray;
	
	public static void main(String[] args) throws FileNotFoundException
	{
		FileReader DBFile = new FileReader("EmployeeDatabaseText.txt");
		DataBaseTextFile DatabaseText = new DataBaseTextFile(DBFile);
		PayrollArray = DataBaseTextFile.readFile(DBFile);
		//System.out.println(PayrollArray);
		
		Employee bobJones = new Employee("Bob", "Jones", "111-11-1111", "123 Fake Street", "Single", 80.21, 10, 10, 1);
		PayrollArray.add(bobJones);
		DataBaseTextFile.writeToDBTextFile(PayrollArray);
		
		
	}

}
