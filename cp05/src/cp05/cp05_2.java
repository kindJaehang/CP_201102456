package cp05;
import java.util.Scanner;

public class cp05_2 {
	public static void main(String[] args){
		int upperA = 65;
		int upperX = 90;
		
		Scanner input = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�.:");
		String s = input.nextLine();
			
		for(int i=0; i < s.length(); i++){
			int a = s.charAt(i); 
			if(a >= upperA && a <= upperX){ //�빮���� ���
				a = a+32;
				System.out.println("��µ� ���ڿ� : "+(char)a);
			}else{ // �ҹ����� ���
				a = a-32;
				System.out.println("��µ� ���ڿ�: "+(char)a);
			}
		}
		input.close();
	}
}