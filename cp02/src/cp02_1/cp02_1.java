package cp02_1;

import java.util.Scanner;

public class cp02_1 {
	public static void main(String[] args){
		int h;
		int m;
		int s;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȯ�� �� �Է�: ");
		int sec = sc.nextInt();
		
		h = sec /3600;
		m = (sec - h*3600)/60;
		s = sec-h*3600-m*60;
		
		System.out.println(sec+"�ʴ�"+h+"�ð�"+m+"��"+s+"�� �Դϴ�.");
		sc.close();
	}
}
