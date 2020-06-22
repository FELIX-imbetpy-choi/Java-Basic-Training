package voi2;

public class A1_AddMetho {
	//Constructor
	   public A1_AddMetho() {
	   // 이 처음 메소드는 없어도 불러 올 수 있는데 왜 만드나?
	      
	   }
	   
	   //변수를  사용자가 변경하며 쓸 수 있는 도구!
	   public int sumCalc(int ii, int jj) { // sumCalc{1,10}
	      int sum = 0;
	      for(int i = ii; i <= jj; i++) {
	         sum += i;
	      }
	      return sum;
	   }
	   
	   
	   //void 메소드에도 입력값을 줄 수 있다! 단지 리턴할 값이 없을 뿐.
	   public void evenodd(int kk) {
	      String returnString = null;
	      int k = kk % 2;
	      if(k == 0) {
	         returnString = "짝수";
	      }else {
	         returnString = "홀수";
	      }
	      System.out.println(returnString + " 입니다.");
//	      return returnString;
	   }
	   
	   
	}


