import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PayrollInformation {
	
	public static void main(String[] args)
	{
		printPayCheck();
	}
	
	public static void printPayCheck()
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
					System.out.print("North Pole, CN 13372");
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
//				if(j == 4 && i > 0 && i < 2)
//				{
//					System.out.print("Pay to the order of: " + PayrollArray.get(firstName) + PayrollArray.get(lastName));
//					int firstNameLength = PayrollArray.get(firstName).length();
//					int lastNameLength = PayrollArray.get(lastName).length();
//					i += (21 + firstNameLength + lastNameLength);
//				}
//				// prints the dollar amount
//				if(j == 4 && i > 0 && i < 2)
//				{
//					System.out.print(PayrollArray.get(totalPay));
//					int totalPayLength = PayrollArray.get(totalPay).length();
//					i += firstNameLength + lastNameLength;
//				}
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
					System.out.print("North Pole, CN 13372");
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
	}
}
