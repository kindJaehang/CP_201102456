package cp03_2;

import java.util.Scanner;

public class cp03_2 {
	public static void main(String[] args){
		int i = 1900;
		int i1 = 0;
		
		int year;
		int month;
		int day;
		
		int calcOfYear = 0;
		int calcOfMonth = 0;
		int totalDay;
		
		Scanner y = new Scanner(System.in);
		System.out.print("년도를 입력하시오: ");
		year = y.nextInt();
		
		Scanner m = new Scanner(System.in);
		System.out.print("월을 입력하시오: ");
		month = m.nextInt();
		
		Scanner d = new Scanner(System.in);
		System.out.print("일을 입력하시오: ");
		day = d.nextInt();
		
		while(i<year){// calc of year
			if((i%4 == 0 && i%100 != 0) || i%400 == 0){ //윤년인 경우
				calcOfYear = calcOfYear + 366; //윤년인 경우 의 year의 day환산
				
				while(i1 < month){ //윤년인 경우 month의 day환산
					if(i1 == 1 || i1 == 3|| i1 == 5|| i1 == 7|| i1 == 8|| i1 == 10|| i1 == 12){
						calcOfMonth = calcOfMonth + 31;
						i1++;
					}
					else if(i1 == 2){
						calcOfMonth = calcOfMonth+29;
						i1++;
					}
					else{
						calcOfMonth = calcOfMonth+30;
						i1++;
					}
				}
				i++;
			}
			else{ //윤년이 아닌경우
				calcOfYear = calcOfYear + 365; //평년인 경우 의 year의 day환산
				
				while(i1 < month){ //평년인 경우 month의 day환산
					if(i1 == 1 || i1 == 3|| i1 == 5|| i1 == 7|| i1 == 8|| i1 == 10|| i1 == 12){
						calcOfMonth = calcOfMonth + 31;
						i1++;
					}
					else if(i1 == 2){
						calcOfMonth = calcOfMonth+28;
						i1++;
					}
					else{
						calcOfMonth = calcOfMonth+30;
						i1++;
					}
				}
				i++;
			}
		}
		// calc of total day
		totalDay = calcOfYear + calcOfMonth + day-3;
		switch(totalDay%7){
			case 0 :System.out.println(+year+"년" +month+"월" +day+"일은 월요일입니다."); break;
			case 1 :System.out.println(+year+"년" +month+"월" +day+"일은 화요일입니다."); break;
			case 2 :System.out.println(+year+"년" +month+"월" +day+"일은 수요일입니다."); break;
			case 3 :System.out.println(+year+"년" +month+"월" +day+"일은 목요일입니다."); break;
			case 4 :System.out.println(+year+"년" +month+"월" +day+"일은 금요일입니다."); break;
			case 5 :System.out.println(+year+"년" +month+"월" +day+"일은 토요일입니다."); break;
			case 6 :System.out.println(+year+"년" +month+"월" +day+"일은 일요일입니다."); break;
		}
		
		y.close();
		m.close();
		d.close();
	}

}