package pratice;

public class cp06 {
	public static void main(String[] args){
		int ranNum[] = new int[10];
		int max = 0;
		int min = 0;
		
		System.out.println("1~100���� �������� �� ����.");
		for(int i=0; i<10; i++){
			ranNum[i] = (int)(Math.random()*100)+1;
			System.out.println(i+"���� �� :"+ranNum[i]);	
		}
		
		if(ranNum[0]<ranNum[1]){ //�ʱ� �� array ranNum index0,1
			max = ranNum[1];
			min = ranNum[0];
		}else{
			max = ranNum[0];
			min = ranNum[1];
		}
		for(int j=2;j<10;j++){ // index 2�� ������ ��
			if(ranNum[j]>max){
				max = ranNum[j];
			}else if(ranNum[j]<max){
				if(ranNum[j]<min){
					min = ranNum[j];
				}
			}
		}
		System.out.println("10���� �� �� ���� ū ���� : "+max);
		System.out.println("10���� �� �� ���� ���� ���� : "+min);
		
	}

}
