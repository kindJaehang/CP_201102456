package cp07;

import java.util.Scanner;

public class testBankAccount {
	public static void main(String[] args){
		//constructor
		BankAccount[] b = new BankAccount[2]; //array ����
		Scanner input = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		//scanner method�� ���� �Էº�
		for(int i=0; i<2; i++){
			b[i] = new BankAccount(); // class object ����
			System.out.println("����"+(i+1)+ "���� �Է�");
			System.out.print("���¹�ȣ : ");
			b[i].accountNumber = s1.next();
			
			System.out.print("������ : ");
			b[i].owner = s2.next();
			
			System.out.print("�ʱ��ܾ� : ");
			b[i].balance = s3.nextInt();
		}
		System.out.println("========================");
		//�Է� �� ������Ȳ üũ
		System.out.print("���� 1");
		b[0].toString();
		System.out.print("���� 2");
		b[1].toString();	
		System.out.println("========================");
			
		//����&���� ��� üũ
		for(int j=0; j<2; j++){
			System.out.print((j+1)+"���� ������ �ݾ� �Է� : ");
			int a1 = input.nextInt();
			b[j].deposit(a1);
			
			System.out.print((j+1)+"���� ������ �ݾ� �Է� : ");
			int a2 = input.nextInt();
			b[j].withdraw(a2);
		}
		System.out.println("========================");
		//����&���� �� ������Ȳ
		System.out.print("���� 1");
		b[0].toString();
		System.out.print("���� 2");
		b[1].toString();	
		
		System.out.println("========================");
		//�۱�(����1 -> ����2)
		System.out.print("����1���� ����2�� �۱��� �ݾ� : ");
		int a3 = input.nextInt();
		b[0].sendAccount(a3, b[1]);
		//������ü �� ������Ȳ
		System.out.print("���� 1");
		b[0].toString();
		System.out.print("���� 2");
		b[1].toString();
		input.close();
		s1.close();
		s2.close();
		s3.close();
	}

}
