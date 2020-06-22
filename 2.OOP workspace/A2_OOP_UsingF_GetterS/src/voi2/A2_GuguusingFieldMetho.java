package voi2;

public class A2_GuguusingFieldMetho {
	
	//오버라이딩  
	
	int i;

	public void calc() {
		    System.out.println("┌────────────┐");
		for(int a = 1; a <= 9; a++) {
			System.out.print("| "+i+" X "+a+" = "+(i*a)+"\t|");
			System.out.println();
		}
		
	}
    //--------------getter setter
	
	public int getI() {
		return i;
	}//get은 반대로 메소드의 값을 상위로 가져감

	public void setI(int i) {
		this.i = i;
	}//set은 메인에서 메소드로 가지고옴.
	
	//----------------using field
	
	// 이 클래스 안의 변수 i를 상위에서도 호환하게 해줌 
	// 이게 없으면 제일 처음 메소드 선언에 변수를 사용하지 못함
	public A2_GuguusingFieldMetho(int i) {
		super();
		this.i = i;
	}
	
}
//--------------------------------

