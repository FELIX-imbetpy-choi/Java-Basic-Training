package voi;

public class A3_mainclass {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		
		      int[] array1 = {10,20,30,40,50};
		      int[] array2 = array1;
		      
		      System.out.println("Before Calc");
		      for(int i = 0; i < array1.length; i++) {
		         System.out.println(array1[i] + "\t" + array2[i]);
		      }
		      
		      array2[0] = 100;
		      array2[1] = 200;
		      array2[2] = 300;
		      array2[3] = 400;
		      array2[4] = 500;
		      
		      
		      
		      System.out.println("After Calc");
		      for(int i = 0; i < array1.length; i++) {
		         System.out.println(array1[i] + "\t" + array2[i]);
		      }

	}

}
