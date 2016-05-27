import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Sedi
 *
 */
public class Show extends List {

	public void setList(AddGuest addGuest,ArrayList<String>listOfGuest)
	{
		
		int tempForJump=1;
		for(int i=0;i<listOfGuest.size();)
		{
			System.out.println("I equal: "+i);
			
			if(tempForJump==1){System.out.print("ID: "+listOfGuest.get(i)+' ');i++;}
			else {System.out.println("Name: "+listOfGuest.get(i)+'\n');i=i+(howFarJump-1);
			tempForJump=2;}
			
			
			
			tempForJump--;
			
		}
		
	}
	
	
}
class ExtraShow extends List
{
	
	
	
	public void setList(AddGuest addGuest,ArrayList<String>listOfGuest)
	{
	int getUsDec=this.getUserDecision()*howFarJump;
	
	int counterVar=0;
	
	for(int i=getUsDec;i<getUsDec+howFarJump;i++)
	{
	
		switch(counterVar)
		{
		
		case 0:
		{
			
			System.out.print("ID: ");
			
			break;
		}
		case 1:
		{
			
			System.out.print("Name: ");
			
			break;
			
		}
		case 2:
		{
			System.out.print("Number Of Room: ");
			
			break;
		}
		case 3:
		{
			System.out.print("He has to pay: ");
			
			break;
		}
		case 4:
		{
//			if(!listOfGuest.get(i).contains("true"))
			System.out.print("Payament: ");
//			else System.out.println("He paid");
		}
		}
		
		System.out.println(listOfGuest.get(i));
		
		counterVar++;
	}
	
	}
	
	
}
