
import java.util.ArrayList;
import java.util.Scanner;

public abstract class List {

	
	final int howFarJump=5;
	private int whichElementRemove
	,userDecision;
	abstract void setList(AddGuest addGuest,ArrayList<String>listOfGuest);
	
	public void setId(int idGuest, ArrayList<String>guestList)
	{}
	
	
	
	public void setWhereRemove(int whichElementRemove){
		
		
		
		
		this.whichElementRemove=whichElementRemove;
		
		
	}
	public int getWhereRemove()
	{
		return this.whichElementRemove;
	}
	
	
	public void setUserDecision(int userDecision)
	{
		this.userDecision=userDecision;
	}
	public int getUserDecision()
	{
		return this.userDecision;
	}
	public void editList(Scanner scan,ArrayList<String>listOfGuest)
	{}
	
	
}
class Add extends List
{
	void setList(AddGuest addGuest,ArrayList<String>listOfGuest)
	{
		try{
			listOfGuest.add(addGuest.getNameOfGuest());
			
			
			
			listOfGuest.add(String.valueOf(addGuest.getNumberOfRoom()));
			listOfGuest.add(String.valueOf(addGuest.countFullPrice()));
			listOfGuest.add(addGuest.getpaidOrNo());
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				System.exit(1);
			}
	}
	@Override
	public void setId(int clientId, ArrayList<String>listOfGuest)
	{
		try{
		listOfGuest.add(String.valueOf(clientId));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.exit(1);
		}
		}

}
class Remove extends List
{
	
	void setList(AddGuest addGuest,ArrayList<String>listOfGuest)
	{
		
		int templateForIteration=howFarJump*this.getWhereRemove();
		
		System.out.println("Which element: "+templateForIteration);
		byte temp=howFarJump;
		try{
		for(int i=templateForIteration;temp>0;){
			
			System.out.println("i:-> "+i);
			
			
		//System.out.println("For moment I delete: "+listOfGuest.get(1));
			listOfGuest.remove(i);
		temp--;
		}
		
		for(int i=templateForIteration;i<listOfGuest.size();i+=howFarJump)
		{
			
			int templateForDecrement;
			templateForDecrement=Integer.parseUnsignedInt(listOfGuest.get(i));
			
			templateForDecrement--;
			System.out.println(templateForDecrement);
			
			listOfGuest.set(i,String.valueOf(templateForDecrement));
		}
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.exit(1);
		}
		
		
		
		
		
	}
	

}