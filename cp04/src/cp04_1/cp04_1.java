package cp04_1;

public class cp04_1 {
	public static void main(String[] args){
		int i = 1;
		int a1 = 0;
		int a2 = 1;
		int a3;
		
		System.out.println("1��:"+a1);
		System.out.println("2��:"+a2);
		
		while(i < 11){
			a3 = a1 + a2;
			System.out.println(i+"��:"+a3);
			a1 = a2;
			a2 = a3;
			i++;
		}
	}

}
