package cp03_1;

import java.util.Scanner;

public class cp03_1 { //���� ���� equlsTo method�� ������� ����!
	public static void main(String[] args){
		String x;//user RPC
		int n; //game times
		int a = 0 ,b = 0; // win number of user, computer
		
		for(n=1; n<=7; n++){
			int ranNum = (int)(Math.random()*10)+1; // computer RPC
			Scanner sc = new Scanner(System.in);
			System.out.println("����, ����, �� �� �Է�: ");
			x = sc.nextLine();
			
			if(x.equals("����")){
				if(ranNum == 1 || ranNum == 4 || ranNum == 7){ //c
					System.out.println("stage" +n+ " > user" +a+ "��vs computer" +b+ "��");
					//draw
				}
				else if(ranNum == 2 || ranNum == 5 || ranNum == 8){ //p
					a++;//user win
					System.out.println("stage" +n+ " > user" +a+ "��vs computer" +b+ "��");
				}
				else{//(ranNum == 3 || ranNum == 6 || ranNum == 9) //r
					b++; //computer win
					System.out.println("stage" +n+ " > user" +a+ "��vs computer" +b+ "��");
				}
			}
			else if(x.equals("����")){
				if(ranNum == 1 || ranNum == 4 || ranNum == 7){ //c
					a++;
					System.out.println("stage" +n+ " > user" +a+ "��vs computer" +b+ "��");
					//user win
				}
				else if(ranNum == 2 || ranNum == 5 || ranNum == 8){ //p
					b++;//computer win
					System.out.println("stage" +n+ " > user" +a+ "��vs computer" +b+ "��");
				}
				else{//(ranNum == 3 || ranNum == 6 || ranNum == 9) //r
					//draw
					System.out.println("stage" +n+ " > user" +a+ "��vs computer" +b+ "��");
				}
			}
			else{//(x.equals("��"))
				if(ranNum == 1 || ranNum == 4 || ranNum == 7){ //c
					b++;
					System.out.println("stage" +n+ " > user" +a+ "��vs computer" +b+ "��");
					//computer win
				}
				else if(ranNum == 2 || ranNum == 5 || ranNum == 8){ //p
					//draw
					System.out.println("stage" +n+ " > user" +a+ "��vs computer" +b+ "��");
				}
				else{//(ranNum == 3 || ranNum == 6 || ranNum == 9) //r
					a++; 
					System.out.println("stage" +n+ " > user" +a+ "��vs computer" +b+ "��");
					//user win
				}
			}
			sc.close();
		}
		
	}

}
