import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sedi
 *
 */
public class EditDatabase extends List{

	String Payament;
	public void setPayament(String Payament)
	{
		this.Payament=Payament;
	}
	public String getPayament()
	{
		return this.Payament;
	}
	
	
	
	void setList(AddGuest addGuest,ArrayList<String>listOfGuest)
	{
		
		
		
	}
	
	@Override
	public void editList(Scanner scanner,ArrayList<String>listOfGuest)
	{
		
		System.out.println("What do you like to do ?");
		System.out.println("1.Edit Payaments\n2.Edit all fields");
		int tempForUserDecision=0;
		
		tempForUserDecision=ValidationClass.validationTest(scanner);
		
		int whichClientEdit=0;
		
		System.out.println("Which item edit? ");
		
		switch(tempForUserDecision)
		{
		
		case 1:
		{
			
			
			whichClientEdit=ValidationClass.validationTest(scanner);
			
			this.editPayaments(whichClientEdit,scanner,listOfGuest);
			
			break;
		}
		
		
		}
		
		
		
	}
	public void editPayaments(int who,Scanner scanner,ArrayList<String>listOfGuest)
	{
		
		
		int where=who+1;
				
				where*=howFarJump;
				where-=1;
				
			
				System.out.println("Select your new status of payament: ");
				listOfGuest.set(where, scanner.next());
				
		
	}
	
	
	
	
	public EditDatabase() {
		// TODO Auto-generated constructor stub
	super();
	}

}
