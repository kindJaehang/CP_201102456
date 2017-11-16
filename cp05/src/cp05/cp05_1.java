package cp05;
import java.util.Scanner;

public class cp05_1 {
	public static void main(String[] args){
		int a = 0;
		int b = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("문자열을 입력하시오.:");
		String s = input.nextLine();
		for(int i =0; i < s.length(); i++){
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
				a++;
			}else{
				b++;
			}
		}
		System.out.println("모음의 개수 :"+a+"개");
		System.out.println("자음의 개수 :"+b+"개");
		input.close();
	}
}
