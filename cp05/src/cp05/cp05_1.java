package cp05;
import java.util.Scanner;

public class cp05_1 {
	public static void main(String[] args){
		int a = 0;
		int b = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�.:");
		String s = input.nextLine();
		for(int i =0; i < s.length(); i++){
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
				a++;
			}else{
				b++;
			}
		}
		System.out.println("������ ���� :"+a+"��");
		System.out.println("������ ���� :"+b+"��");
		input.close();
	}
}
