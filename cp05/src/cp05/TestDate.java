package cp05;
import java.util.Scanner;

public class TestDate { // cp05_3
	public static void main(String args[]){
		Date date = new Date();
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է� :");
		date.year = input.nextInt();
		
		System.out.print("�� �Է� :");
		date.month = input.nextInt();
		
		System.out.print("�� �Է� :");
		date.day = input.nextInt();
		
		date.printEastern();
		date.printWestern();
		
		input.close();
	}
}