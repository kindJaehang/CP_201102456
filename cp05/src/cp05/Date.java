package cp05;

public class Date { //cp05_3
	int year;
	int month;
	int day;
	
	public void printEastern(){
		System.out.println("동양식 날짜 표현 :"+year+"."+month+"."+day);
	}
	public void printWestern(){
		System.out.print("서양식 날짜 표현 :");
		switch(month){
		case 1 : System.out.println("january "+day+", "+year); break;
		case 2 : System.out.println("febuary "+day+", "+year); break;
		case 3 : System.out.println("march "+day+", "+year); break;
		case 4 : System.out.println("april "+day+", "+year); break;
		case 5 : System.out.println("may "+day+", "+year); break;
		case 6 : System.out.println("june "+day+", "+year); break;
		case 7 : System.out.println("july "+day+", "+year); break;
		case 8 : System.out.println("august "+day+", "+year); break;
		case 9 : System.out.println("september "+day+", "+year); break;
		case 10 : System.out.println("october "+day+", "+year); break;
		case 11 : System.out.println("november "+day+", "+year); break;
		case 12 : System.out.println("december "+day+", "+year); break;
		default : break;
		}
	}
}
