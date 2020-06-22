package voi;

import java.util.ArrayList;

public class A5_ArraylistMain {

	public static void main(String[] args) {
		
		//20181014 복습완료 ★
		
		System.out.println("===============");
		System.out.println("ArrayList");
		System.out.println("===============");
		
		// 배열은 갯수가 짐작되지 않으면 설정하기 힘든 단점이 있다.
		// 이럴때 Array List 를 사용한다.
		
		//Array list 선언 - <> 안에는 담고자 하는 데이터 형식을 쓰면 된다
		ArrayList<String> arraylist = new ArrayList<String>();
		
		//list 추가
		arraylist.add("str1");
		arraylist.add("str2");
		arraylist.add("str3");
		arraylist.add("str4");
		arraylist.add("str5");
		
		//출력
		System.out.println(arraylist);    
		System.out.println(arraylist.toString()); //첫번째 출력과 똑같다.
		System.out.println(arraylist.get(3));     //리스트에 4번째의 값을 가지고 온다. 
		System.out.println("-------------------------------------");
		
		//수정
		arraylist.set(2, "str33333"); // 인덱스값과 수정할 값을 넣어주면 수정을 진행.
		System.out.println(arraylist);
		
		//arraylist.size() 는 배열의 length와 같다.
		for(int i = 0; i < arraylist.size(); i++)  {
			System.out.println(arraylist.get(i));
		}
		
		//삭제
		//remove 인덱스값을 입력하면 해당 인덱스의 값이 삭제된다.
		arraylist.remove(2);
		System.out.println(arraylist);    
		//clear 는 모든 값을 삭제시킨다.
		arraylist.clear();
		System.out.println(arraylist);  
		

	}

}
