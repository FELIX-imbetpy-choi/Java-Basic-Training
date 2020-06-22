package voi2;

public class A3_GuguMetho {
	
	public static int dan = 2;
	
	public static void gugu() { //이렇게 빈 생성자를 디폴트 생성자라함
		
	}
	
	public void calc() {
		for(int a = 1; a <= 9; a++) {
			System.out.print(dan+" X "+a+" = "+(dan*a)+"\t");
			if((a%2)==0){
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("--------------------------");
		dan = dan + 1;
	}

}
