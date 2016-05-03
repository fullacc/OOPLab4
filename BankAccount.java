import java.util.*;
import java.lang.*;

public class BankAccount
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Bank WorldBank = new Bank();
		Collections.sort(WorldBank.accounts);
		for(BankAcc b : WorldBank.accounts)
			System.out.println(b.name+" "+b.balance);		

	
	}
}

