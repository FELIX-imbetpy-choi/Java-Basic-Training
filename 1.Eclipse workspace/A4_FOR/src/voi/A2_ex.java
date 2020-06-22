package voi;

public class A2_ex {
	
	//㈜ 복습 기록 ★20181007 
	
	//심화
	// 1부터 100까지 전체합 짝수합 홀수합 3의배수의합 구하기.

		public static void main(String[] args) {
	    	
	    	int sum = 0;
	    	int zak = 0;
	    	int hor = 0;
	    	int sam = 0;
	    	
	    			
	    	for(int a = 1; a <= 100; a++) {
	    		if(a<=100) {
	    			sum = sum + a;
	    		}
	    		if((a%2)==0) {
	    			zak = zak + a;
	    		}
	    		if((a%2)>0) {
	    			hor = hor + a;
	    		}
	    	    if((a%3)==0) {
	    			sam = sam + a;
	    		}
	    	}
	    		
	    		System.out.println("전체 총합은"+sum);
	    		System.out.println("짝수 총합은"+zak);
	    		System.out.println("홀수 총합은"+hor);
	    		System.out.println("삼배 총합은"+sam);

		
			
		}
		
	// ** 만약 if 절 다음 else if를 사용해서 모든 판별을 했다면 값이 모두 나오지 않는다.
	// else if 절은 제한없이 사용할 수 있지만 그중 true 값이 나오는 구간이 있다면 그 구역을 실행하고 전체 if문을 벗어난다.
	// 모든 조건을 다 검토하려면 else if를 사용하면 안된다.
	
	
	
	
	
	
	
	
	//20181002 복습 및 실험
    public static void explain02(String[] args) {
    	
    	int sum = 0;
    	int zak = 0;
    	int hor = 0;
    	int sam = 0;
    	
    			
    	for(int a = 1; a <= 100; a++) {
    		if(a<=100) {
    			sum = sum + a;
    		}
    		if((a%2)==0) {
    			zak = zak + a;
    		}
    		if((a%2)==1) {
    			hor = hor + a;
    		}
    		if((a%3)==0) {
    			sam = sam + a;
    		}
    	}
    		
    		System.out.println("전체 총합은" + sum);
    		System.out.println("짝수 총합은" + zak);
    		System.out.println("홀수 총합은" + hor);
    		System.out.println("삼배 총합은" + sam);


    	
    }
    	
    	
	
    
    
    //20181002 선생님 설명
	public static void explain01(String[] args) {
		
		int choi = 0;
		int jun = 0;
		int con = 0;
		int tat = 0;
		
        	for(int i = 1; i <= 100; i++) {
        		choi = choi +i;
        		
        		
        		if((i%2)==0) {			
        		jun = jun + i ;
        		}
        		else if((i%2)!=0){
        			con = con + i;
        		}
        		else if((i%5)==0) {
        			tat = tat + i;
        		}
        		
        	}
        		
        		
        		System.out.println("짝수의합은"+jun);
        		System.out.println("홀수의합은"+con);
        		System.out.println("전체의합은"+choi);
        		System.out.println("5의 배수의 합은"+tat);
        	
	
	}
	
}
	
	//1부터 100까지의 수중 짝수의 합과 홀수의 합을 한번에 구하시오			
	
	
		
	

