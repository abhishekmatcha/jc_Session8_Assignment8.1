

public class Bankatm 
{
	public String bankname="SBI";
	String location="Bangalore";
	public static int balance = 10300;
	public int balance() 
	{ 
		return balance;
		} 
	public void withdraw(int amount) throws Notsufficient { if (balance < 10000)
	{ 
		throw new Notsufficient(String.format("Balance is less than 10000"));
		} 
	  balance = balance - amount;
	  
	} public void deposit(int amount) 
	{ if (amount <= 0)
	{ 
		throw new IllegalArgumentException(String.format("Invalid deposit amount %s", amount)); 
		} 
	} 
	}

