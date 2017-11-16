package cp05;
import java.util.Scanner;

public class TestDate { // cp05_3
	public static void main(String args[]){
		Date date = new Date();
		
		Scanner input = new Scanner(System.in);
		System.out.print("연도 입력 :");
		date.year = input.nextInt();
		
		System.out.print("월 입력 :");
		date.month = input.nextInt();
		
		System.out.print("일 입력 :");
		date.day = input.nextInt();
		
		date.printEastern();
		date.printWestern();
		
		input.close();
	}
}