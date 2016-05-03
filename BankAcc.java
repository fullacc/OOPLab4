import java.util.*;
import java.lang.*;
public class BankAcc implements Comparable<BankAcc>{
	public String name;
	public int balance;
	public BankAcc(String name, int balance){
		this.name = name;
		this.balance = balance;
	}/*
	public String toString(){
		String s="Owner: "+name+"\nBalance: "+(String)balance;
		return s;
	}*/
	public int compareTo(final BankAcc o){
		return Integer.compare(this.balance,o.balance);
	}
	
}
