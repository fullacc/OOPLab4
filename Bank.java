import java.util.*;
import java.lang.*;
public class Bank{
	public ArrayList<BankAcc> accounts = new ArrayList<BankAcc>();
	public Bank(){
		for (int i=0;i<20;i++){
			accounts.add(new BankAcc(generateName(),(int)(Math.random()*5000+2)));
		}
	}
	public String generateName(){
		final int rn = (int)(Math.random()*7+1);
		char[] an = new char[rn+1];		
		for(int i=0;i<rn;i++){
			an[i]=(char)((int)'a'+((int)(Math.random()*('z'-'a'))));
		}
		String out = String.valueOf(an);
		return out;
	}
}
