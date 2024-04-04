package Basic;
import java.util.Scanner;
public class Banking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name : ");
		String name = sc.nextLine();

		System.out.print("Enter account number : ");
		int cId = sc.nextInt();

		BankAccount obj1 = new BankAccount(name, cId);
		obj1.showMenu();

		}
		}

		class BankAccount{
		int balence = 0;
		int previousTransaction = 0;
		String customerName;
		int customerId;
		boolean ptw = false, ptd = false;

		Design D = new Design();

		BankAccount(){

		}

		BankAccount(String cname,int cid)
		{
		customerName = cname;
		customerId = cid;
		}

		private void deposit(int amount)
		{
		if(amount != 0)
		{
		balence = balence + amount;
		previousTransaction = amount;
		ptw = false;
		ptd = true;
		}
		}

		private void withdraw(int amount)
		{
		if(amount != 0)
		{
		balence = balence - amount;
		previousTransaction = amount;

		ptw = true;
		ptd = false;
		}
		}
		private void getPreviousTransaction()
		{
		if(ptd)
		{
		System.out.println("Deposit : "+previousTransaction);
		}
		else if(ptw)
		{
		System.out.println("withdraw: "+(previousTransaction));
		}
		else
		{
		System.out.println("No transaction occurd");
		}
		}
		void showMenu()
		{
		char option='\0';
		Scanner scanner = new Scanner(System.in);

		System.out.print("\n");
		System.out.println("Welcome "+customerName);

		System.out.print("Your AC is "+customerId);
		System.out.println("\n");
		System.out.println("Banking System Menu: ");
		System.out.println("1. Check Balence");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Previous Transaction");
		System.out.println("5. Exit");

		do
		{
		D.equ();
		System.out.println("Enter your choice : ");
		D.equ();

		option = scanner.next().charAt(0);

		switch(option)
		{
		case '1':
		D.min();
		System.out.println("Balence = "+balence);
		D.min();
		break;

		case '2':

		D.min();
		System.out.println("Enter an amount to deposit: ");
		D.min();
		int amount = scanner.nextInt();
		deposit(amount);
		break;

		case '3':
		D.min();
		System.out.println("Enter an amount to withdraw: ");
		D.min();
		int amount2 = scanner.nextInt();
		withdraw(amount2);
		break;

		case '4':
		D.min();
		getPreviousTransaction();
		D.min();
		break;

		case '5':
		System.out.println("Thank you for using our services.");
		break;

		default:

		System.out.println("Invalid option!!. Please enter again");
		break;

		}
		}
		while(option != '5');
		}

		}
		class Design{
		public void equ(){

		System.out.println("===========================================");
		}
		public void min(){
		System.out.println("----------------------------");
		}
		}


