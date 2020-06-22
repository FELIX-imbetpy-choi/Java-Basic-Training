package voi;

import voi2.A3_GuguMetho;

public class A3_Gugu {

	public static void main(String[] args) {
		//20181014 복습완료 ★
		
		//문제. 메소드를 실행할 때마다 단수가 늘어나며 출력
		A3_GuguMetho gugu = new A3_GuguMetho();
		
		gugu.calc();//1단
		gugu.calc();//2단
		gugu.calc();
		gugu.calc();
		gugu.calc();
		gugu.calc();
		gugu.calc();
		gugu.calc();//9단

	}

}
