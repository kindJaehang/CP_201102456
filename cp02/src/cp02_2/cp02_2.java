package cp02_2;

import java.util.Scanner;

public class cp02_2 {
	public static void main(String[] args){
		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��Ͻÿ�: ");
		year = sc.nextInt();
		if((year%4 == 0 && year%100 != 0) || year%400 == 0){
			System.out.println(year+"���� �����Դϴ�.");}
		else{
				System.out.println(year+"���� ������ �ƴմϴ�.");
			}
		sc.close();
	}

}
