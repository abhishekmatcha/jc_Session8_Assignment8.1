

public class Main
{ public static void main(String args[])
{ 
	Bankatm acct = new Bankatm(); 
	Bankatm acct1 = new Bankatm();
	Bankatm acct2 = new Bankatm();
	System.out.println("Current balance : " + acct.balance()); 
	System.out.println("Withdrawing 200");
	acct.withdraw(200);
	System.out.println("Current balance : " + acct.balance());
	System.out.println("Current balance : " + acct1.balance()); 
	System.out.println("Withdrawing 200 From");
	acct1.withdraw(200);
	System.out.println("Current balance : " + acct1.balance());
	System.out.println("Current balance : " + acct2.balance()); 
	System.out.println("Withdrawing 200");
	acct2.withdraw(200);
	System.out.println("Current balance : " + acct2.balance());
	
	}
}

