package cp05;
import java.util.Scanner;

public class cp05_2 {
	public static void main(String[] args){
		int upperA = 65;
		int upperX = 90;
		
		Scanner input = new Scanner(System.in);
		System.out.print("문자열을 입력하시오.:");
		String s = input.nextLine();
			
		for(int i=0; i < s.length(); i++){
			int a = s.charAt(i); 
			if(a >= upperA && a <= upperX){ //대문자인 경우
				a = a+32;
				System.out.println("출력된 문자열 : "+(char)a);
			}else{ // 소문자인 경우
				a = a-32;
				System.out.println("출력된 문자열: "+(char)a);
			}
		}
		input.close();
	}
}