package cp07;

public class BankAccount {
	//field
	public String accountNumber;
	public String owner;
	public int balance;
	
	//methods
	public void deposit(int amount){
		balance = balance + amount;
	}
	public void withdraw(int amount){
		balance = balance - amount;
	}
	public String toString(){
		System.out.println("���¹�ȣ : "+accountNumber);
		System.out.println("������ : "+owner);
		System.out.println("�ܾ� : "+balance);
		return ("");
	}
	public int sendAccount(int amount, BankAccount OtherAccount){
		if(balance<amount){
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}else{
			balance = balance - amount;
			OtherAccount.balance = OtherAccount.balance + amount;
			return 0;
		}
	}
}