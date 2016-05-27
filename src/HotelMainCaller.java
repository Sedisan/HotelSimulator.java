import java.util.ArrayList;
import java.util.Scanner;

//
//DON'T WORK:
//MAKE SAVE FILE
//MAKE UNIT TEST
//

public class HotelMainCaller {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	ArrayList<String>listOfGuest=new ArrayList<>();
	
	

	
	
	int clientId=0;
	

	
	
	Scanner scanner=new Scanner(System.in);
	AddGuest addGuest;
	List manageList;
	addGuest=new NormalGuest();
	
	while(true){
	
		
		
		
	System.out.println("Hello! What do you like to do ?\n1.Add new Hotel Guest,\n2.Remove Hotel Guest,\n3.Browse Hotel Guest,\n4.Search Client By ID\n5.Edit Payament Hotel Guest\nAnother number, to exit\n");
	
	
	int userDecision=0;
	
	
	userDecision=ValidationClass.validationTest(scanner);
	
	if(addGuest==null)addGuest=new NormalGuest();
	
	if(listOfGuest.isEmpty())
	{
		System.out.println("You can only add");
		userDecision=1;
	}
	
	
	switch(userDecision)
	{
	
	case 1:
	{
		
		
//		if(addGuest==null)addGuest=new NormalGuest();
		addGuest.loadUserData(scanner);
		manageList=new Add();
		manageList.setId(clientId, listOfGuest);
		manageList.setList(addGuest, listOfGuest);
		clientId++;
		
		break;
		
	}
	
	case 2:
	{
//		addGuest=new NormalGuest();
		manageList=new Remove();
		
		System.out.println("Which client delete? ");
		
		manageList.setWhereRemove(ValidationClass.validationTest(scanner));
		
		manageList.setList(addGuest, listOfGuest);
		clientId--;
		break;
	}
	case 3:
	{
//		addGuest=new NormalGuest();
		manageList=new Show();
		
		
		
		
		
		
		manageList.setList(addGuest, listOfGuest);
		
		break;
	}
	case 4:
	{
		manageList=new ExtraShow();
		
		System.out.println("Enter id item\n");
		manageList.setUserDecision(ValidationClass.validationTest(scanner));
		manageList.setList(addGuest, listOfGuest);
		
	break;
	}
	case 5:
	{
		
//			addGuest=new NormalGuest();
			manageList=new EditDatabase();
			manageList.setList(addGuest, listOfGuest);
			
			manageList.editList(scanner, listOfGuest);
			
			
			break;
		
		
	}
	
	default:{
		
		System.out.println("Thanks for use.This project was created by: "+"Szymon Ryl");
		
		scanner.close();
		System.exit(1);
	
	}
	}
	


	
	
	
	
	
	
	
	
	if(clientId>3)break;
	
	}
	
	

	
	
	scanner.close();

	
	
	}

}
