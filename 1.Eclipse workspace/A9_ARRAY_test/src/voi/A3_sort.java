package voi;

public class A3_sort {

	public static void main(String[] args) {
		//sort
		int[]data = {50,100,70,-100,25,80,255,45,70};
		
		System.out.println("Before");
		for(int i = 0; i < data.length; i++) {
			System.out.println(i+"==>"+data[i]);
			
		}
		System.out.println("After");
		
		for(int i = 0; i < data.length; i++) {
			for(int j = i + 1; j <data.length; j++) {
				if(data[i]>data[j]) {
					int k = data[i];
					data[i]=data[j];
					data[j]= k;
					
					//서로의 순서를 맞바꾸는 논리이다.
				}
			}
		}
		for(int i = 0; i < data.length; i++) {
			System.out.println(i+"==>"+data[i]);
		}
	}

}
