package voi2;

public class A3_BankMetho {
	
	public A3_BankMetho() {
		
		
	}
	
	int [] customer = {0,0,0,0,0}; //고객들 잔고 초기화
	
	public int input(int i, int j) {
		customer[i-1] += j;
		System.out.println("입금결과 : 고객번호 : "+i+"잔액 : " + customer[i-1]);
		System.out.println("----------------------");
		
		return customer[i-1];
	    }
	

	
	public int  minu (int i ,int  j) {
		
		if(customer[i-1]<j) {
			System.out.println("훠이훠이~");
		}
		else {
			customer[i-1] -= j;
			System.out.println("출금결과 : 고객번호 : "+i+"잔액 : " + customer[i-1]);
			System.out.println("----------------------");
		}
		
		return customer[i-1];
	}
	
	public void gold () {
		
		System.out.println("고객번호" + "\t"+ "잔액");
		for(int k = 0; k < 5; k++) {
			System.out.println((k+1)+"\t" +customer[k]);
		}
		System.out.println("----------------------");
	
	}
	
	public void kkt () {
		System.out.println("-------Thank you-------");
	}
}
