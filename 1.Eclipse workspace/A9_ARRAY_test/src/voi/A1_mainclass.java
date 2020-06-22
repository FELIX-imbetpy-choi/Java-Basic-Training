package voi;

public class A1_mainclass {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		//  search
      
      int [] data = {50,100,70,-100,25,80,255,45,70};
      int search = 70;
      int i;
      int n = 0;
      
      // 반복을 통해 배열에서 data값을 비교하고 위치를 찾자.
      
      for(i = 0; i<data.length; i++)
      {
         if(search==data[i])
         {
            System.out.println("Found Data ==>"+data[i]);
            System.out.println("Data Loc ====>"+(i+1));
            
            n++;
         }
      }
      if(n==0)
      {
         System.out.println("Not Found");
      }
	}

}
