package cp07;

import java.util.Scanner;

public class testBankAccount {
	public static void main(String[] args){
		//constructor
		BankAccount[] b = new BankAccount[2]; //array 생성
		Scanner input = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		//scanner method를 통한 입력부
		for(int i=0; i<2; i++){
			b[i] = new BankAccount(); // class object 생성
			System.out.println("계좌"+(i+1)+ "정보 입력");
			System.out.print("계좌번호 : ");
			b[i].accountNumber = s1.next();
			
			System.out.print("예금주 : ");
			b[i].owner = s2.next();
			
			System.out.print("초기잔액 : ");
			b[i].balance = s3.nextInt();
		}
		System.out.println("========================");
		//입력 후 계좌현황 체크
		System.out.print("계좌 1");
		b[0].toString();
		System.out.print("계좌 2");
		b[1].toString();	
		System.out.println("========================");
			
		//저금&인출 기능 체크
		for(int j=0; j<2; j++){
			System.out.print((j+1)+"계좌 저금할 금액 입력 : ");
			int a1 = input.nextInt();
			b[j].deposit(a1);
			
			System.out.print((j+1)+"계좌 인출할 금액 입력 : ");
			int a2 = input.nextInt();
			b[j].withdraw(a2);
		}
		System.out.println("========================");
		//저금&인출 후 계좌현황
		System.out.print("계좌 1");
		b[0].toString();
		System.out.print("계좌 2");
		b[1].toString();	
		
		System.out.println("========================");
		//송금(계좌1 -> 계좌2)
		System.out.print("계좌1에서 계좌2로 송금할 금액 : ");
		int a3 = input.nextInt();
		b[0].sendAccount(a3, b[1]);
		//계좌이체 후 계좌현황
		System.out.print("계좌 1");
		b[0].toString();
		System.out.print("계좌 2");
		b[1].toString();
		input.close();
		s1.close();
		s2.close();
		s3.close();
	}

}
