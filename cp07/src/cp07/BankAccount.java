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
		System.out.println("계좌번호 : "+accountNumber);
		System.out.println("예금주 : "+owner);
		System.out.println("잔액 : "+balance);
		return ("");
	}
	public int sendAccount(int amount, BankAccount OtherAccount){
		if(balance<amount){
			System.out.println("잔액이 부족합니다.");
			return 0;
		}else{
			balance = balance - amount;
			OtherAccount.balance = OtherAccount.balance + amount;
			return 0;
		}
	}
}