package Bank;
import java.util.Scanner;
public class BankDriver 
{

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
		Helper h=new Helper();
		
		boolean logout=true;
		while(logout)
		{
			System.out.println("Enter \n1.create account\n2.login\n3.Logout");
			int cho=s.nextInt();
			switch(cho)
			{
			case 1:h.creatAcc();
			break;
			case 2:h.login();
			break;
			case 3:logout=false;
			break;
			default : System.out.println("Enter a  valid option ");
			
			}
		}
		
	}
}
