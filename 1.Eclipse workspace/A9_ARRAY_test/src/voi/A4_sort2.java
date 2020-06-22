package voi;

import java.util.Arrays;

public class A4_sort2 {

	public static void main(String[] args) {

int[]data = {50,100,70,-100,25,80,255,45,70};
		
		System.out.println("Before");
		for(int i = 0; i < data.length; i++) {
			System.out.println(i+"==>"+data[i]);
			
		}
		System.out.println("After");
		Arrays.sort(data);
					
					//서로의 순서를 맞바꾸는 논리이다.
				
			
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(i+"==>"+data[i]);
		}
	}

}
