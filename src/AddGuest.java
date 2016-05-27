import java.util.Scanner;

public abstract class AddGuest {

	String nameOfGuest;
	int numberOfGuest
	,numberOfRoom
	,howLongWillHeBe
	,priceForOneDay;
//	boolean specialGuestOrNo;
	String paidOrNo;
	
	
	public AddGuest()
	{
		this.nameOfGuest="Unrecognized Value";
		this.numberOfGuest=1;
		this.numberOfRoom=1;
		this.howLongWillHeBe=1;
		this.priceForOneDay=1;
		//this.specialGuestOrNo=false;
		this.paidOrNo="false";
	}
	
	public String getNameOfGuest(){return this.nameOfGuest;}
	public void setNameOfGuest(String nameOfGuest){this.nameOfGuest=nameOfGuest;}
	
	public int getNumberOfGuest(){return this.numberOfGuest;}
	public void setNumberOfGuest(int numberOfGuest){this.numberOfGuest=numberOfGuest;}
	
	public int getNumberOfRoom(){return this.numberOfRoom;}
	public void setNumberOfRoom(int numberOfRoom){this.numberOfRoom=numberOfRoom;}
	
	public int gethowLongWillHeBe(){return this.howLongWillHeBe;}
	public void setHowLongWillHeBe(int howLongWillHeBe){this.howLongWillHeBe=howLongWillHeBe;}
	
	public int getPriceForOneDay(){return this.priceForOneDay;}
	public void setPriceForOneDay(int priceForOneDay){this.priceForOneDay=priceForOneDay;}
	
//	public boolean getSpecialGuestOrNo(){return this.specialGuestOrNo;}
//	public void setSpecialGuestOrNo(boolean specialGuestOrNo){this.specialGuestOrNo=specialGuestOrNo;}
	
	
	public String getpaidOrNo(){return this.paidOrNo;}
	public void setpaidOrNo(String paidOrNo){this.paidOrNo=paidOrNo;}
	
	abstract public void loadUserData(Scanner scanner);
	
	
	public int countFullPrice()
	{
				
		return this.howLongWillHeBe*this.priceForOneDay;
	}
	
}

class NormalGuest extends AddGuest
{
	
	public NormalGuest()
	{
		super();
	}
	
public void loadUserData(Scanner scanner)
{

	
	System.out.println("Enter user name: ");
	this.setNameOfGuest(scanner.next());
	
	System.out.println("Okay... Now enter user numberOfRoom");
	this.setNumberOfRoom(ValidationClass.validationTest(scanner));
	
	System.out.println("Okay... How many days this guest will be with us? ");
	this.setHowLongWillHeBe(ValidationClass.validationTest(scanner));
	
	System.out.println("Okay... Now enter price For One Day");
	this.setPriceForOneDay(ValidationClass.validationTest(scanner));
	
	System.out.println("Paid? Enter information, which help you with this client");
	this.setpaidOrNo(scanner.next());
	
	
	
	
}



}
/*
class VipUser extends AddGuest
{
	
	public VipUser()
	{
		super();
	}
	
	
public void loadUserData(Scanner scanner)
{
	
}
	
}

*/