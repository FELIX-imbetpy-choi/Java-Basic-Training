package voi;

public class A9993_ex27_ing {
	
	//미제

	public static void main(String[] args) {
		
		//1부터 100 까지 소수들을 표현하고 그 합과 평균을 구하세요
		// 소수는 1과 자기자신으로만 나누어 지는 수 
		
		
		int count = 0;
		
		for(int i = 2; i<= 100; i++) {
			for( int j = 2; j <= 100; j++) {
				
				if(i%j==0) {
					count++;     // count++  는 count = count + 1  과 같다. 
				}
				
				}
				if(count==1) {
				System.out.println(i);
				}
					count = 0;   // 비교할 변수를 초기화 시킨다.!!!! 중요
		}
		
		  
	} 
//------------
}
