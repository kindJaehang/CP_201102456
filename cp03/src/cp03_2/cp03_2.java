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
		System.out.print("�⵵�� �Է��Ͻÿ�: ");
		year = y.nextInt();
		
		Scanner m = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�: ");
		month = m.nextInt();
		
		Scanner d = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�: ");
		day = d.nextInt();
		
		while(i<year){// calc of year
			if((i%4 == 0 && i%100 != 0) || i%400 == 0){ //������ ���
				calcOfYear = calcOfYear + 366; //������ ��� �� year�� dayȯ��
				
				while(i1 < month){ //������ ��� month�� dayȯ��
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
			else{ //������ �ƴѰ��
				calcOfYear = calcOfYear + 365; //����� ��� �� year�� dayȯ��
				
				while(i1 < month){ //����� ��� month�� dayȯ��
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
			case 0 :System.out.println(+year+"��" +month+"��" +day+"���� �������Դϴ�."); break;
			case 1 :System.out.println(+year+"��" +month+"��" +day+"���� ȭ�����Դϴ�."); break;
			case 2 :System.out.println(+year+"��" +month+"��" +day+"���� �������Դϴ�."); break;
			case 3 :System.out.println(+year+"��" +month+"��" +day+"���� ������Դϴ�."); break;
			case 4 :System.out.println(+year+"��" +month+"��" +day+"���� �ݿ����Դϴ�."); break;
			case 5 :System.out.println(+year+"��" +month+"��" +day+"���� ������Դϴ�."); break;
			case 6 :System.out.println(+year+"��" +month+"��" +day+"���� �Ͽ����Դϴ�."); break;
		}
		
		y.close();
		m.close();
		d.close();
	}

}