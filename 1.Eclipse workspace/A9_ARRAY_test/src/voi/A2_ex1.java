package voi;

public class A2_ex1 {

	public static void main(String[] args) {
		
		//Max value
		int[]data = {50,100,70,-100,25,80,255,45,70};
		int max = 0;
		int maxloc = 0;
		int min = 0;
		int minloc = 0;
		
		// int max = data [0]; 으로 두어도 상관없음
		
		for(int i = 0; i < data.length; i++) {
			
			if(min > data[i]) {
				min = data[i];
				minloc = i+1;
				
			}
			if(max<data[i]) {
				max = data[i];
				maxloc = i + 1;
				
			}
		}
		System.out.println("최대값은 : "+max+" 입니다");
		System.out.println("위치는 :  "+maxloc + " 입니다");
		System.out.println("최소값은 : "+min+" 입니다");
		System.out.println("위치는 :  "+minloc + " 입니다");
	}

}
