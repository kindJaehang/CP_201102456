package cp04_2;

import java.util.Scanner;

public class cp04_2 {
	public static void main(String args[]){
		char c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���(���ҹ���) : ");
		c = sc.next().charAt(0);
		
		switch(c){
		case 'a' : System.out.println("�����Դϴ�."); break;
		case 'e' : System.out.println("�����Դϴ�."); break;
		case 'i' : System.out.println("�����Դϴ�."); break;
		case 'o' : System.out.println("�����Դϴ�."); break;
		case 'u' : System.out.println("�����Դϴ�."); break;
		default : System.out.println("�����Դϴ�."); break;
		}
		sc.close();
	}
}
