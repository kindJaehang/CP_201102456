package cp04_2;

import java.util.Scanner;

public class cp04_2 {
	public static void main(String args[]){
		char c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요(영소문자) : ");
		c = sc.next().charAt(0);
		
		switch(c){
		case 'a' : System.out.println("모음입니다."); break;
		case 'e' : System.out.println("모음입니다."); break;
		case 'i' : System.out.println("모음입니다."); break;
		case 'o' : System.out.println("모음입니다."); break;
		case 'u' : System.out.println("모음입니다."); break;
		default : System.out.println("자음입니다."); break;
		}
		sc.close();
	}
}
