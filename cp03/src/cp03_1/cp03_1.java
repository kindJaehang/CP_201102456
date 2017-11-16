package cp03_1;

import java.util.Scanner;

public class cp03_1 { //ÃßÈÄ ¼öÁ¤ equlsTo method¸¦ »ç¿ëÇÏÁö ¸»°Í!
	public static void main(String[] args){
		String x;//user RPC
		int n; //game times
		int a = 0 ,b = 0; // win number of user, computer
		
		for(n=1; n<=7; n++){
			int ranNum = (int)(Math.random()*10)+1; // computer RPC
			Scanner sc = new Scanner(System.in);
			System.out.println("°¡À§, ¹ÙÀ§, º¸ Áß ÀÔ·Â: ");
			x = sc.nextLine();
			
			if(x.equals("°¡À§")){
				if(ranNum == 1 || ranNum == 4 || ranNum == 7){ //c
					System.out.println("stage" +n+ " > user" +a+ "½Âvs computer" +b+ "½Â");
					//draw
				}
				else if(ranNum == 2 || ranNum == 5 || ranNum == 8){ //p
					a++;//user win
					System.out.println("stage" +n+ " > user" +a+ "½Âvs computer" +b+ "½Â");
				}
				else{//(ranNum == 3 || ranNum == 6 || ranNum == 9) //r
					b++; //computer win
					System.out.println("stage" +n+ " > user" +a+ "½Âvs computer" +b+ "½Â");
				}
			}
			else if(x.equals("¹ÙÀ§")){
				if(ranNum == 1 || ranNum == 4 || ranNum == 7){ //c
					a++;
					System.out.println("stage" +n+ " > user" +a+ "½Âvs computer" +b+ "½Â");
					//user win
				}
				else if(ranNum == 2 || ranNum == 5 || ranNum == 8){ //p
					b++;//computer win
					System.out.println("stage" +n+ " > user" +a+ "½Âvs computer" +b+ "½Â");
				}
				else{//(ranNum == 3 || ranNum == 6 || ranNum == 9) //r
					//draw
					System.out.println("stage" +n+ " > user" +a+ "½Âvs computer" +b+ "½Â");
				}
			}
			else{//(x.equals("º¸"))
				if(ranNum == 1 || ranNum == 4 || ranNum == 7){ //c
					b++;
					System.out.println("stage" +n+ " > user" +a+ "½Âvs computer" +b+ "½Â");
					//computer win
				}
				else if(ranNum == 2 || ranNum == 5 || ranNum == 8){ //p
					//draw
					System.out.println("stage" +n+ " > user" +a+ "½Âvs computer" +b+ "½Â");
				}
				else{//(ranNum == 3 || ranNum == 6 || ranNum == 9) //r
					a++; 
					System.out.println("stage" +n+ " > user" +a+ "½Âvs computer" +b+ "½Â");
					//user win
				}
			}
			sc.close();
		}
		
	}

}
