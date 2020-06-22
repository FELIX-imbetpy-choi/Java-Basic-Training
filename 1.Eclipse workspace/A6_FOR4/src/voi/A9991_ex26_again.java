package voi;

public class A9991_ex26_again {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		
		
			int tot = 0;
	        int aoa = 0;
	       
	       
	      for(int i =1; i<=100; i++) {
	          if((i % 3) == 0) {
	            tot = tot + i;
	            aoa = aoa + (i/i);
	            System.out.print(i + "\t");
	         }
	          if((i % 9) == 0) {
	            System.out.println();
	         }
	      }
	                System.out.println();
	      
	      			System.out.println("합계 : " + tot);
	    		    System.out.println("평균 : " + tot / aoa);
	}

}
