import java.util.Scanner;

public abstract class ValidationClass {

	public static int validationTest(Scanner scanner)
	{
		
		while(scanner.hasNext()){
		if(scanner.hasNextInt())
		break;
		else
		{
			System.out.println("Try again...");
			
			scanner.next();
			
		}
		
		}
		
		
		return scanner.nextInt();
	}
	private ValidationClass(){}
	
}
