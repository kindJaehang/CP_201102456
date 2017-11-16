package cp02_1;

import java.util.Scanner;

public class cp02_1 {
	public static void main(String[] args){
		int h;
		int m;
		int s;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변환할 초 입력: ");
		int sec = sc.nextInt();
		
		h = sec /3600;
		m = (sec - h*3600)/60;
		s = sec-h*3600-m*60;
		
		System.out.println(sec+"초는"+h+"시간"+m+"분"+s+"초 입니다.");
		sc.close();
	}
}
