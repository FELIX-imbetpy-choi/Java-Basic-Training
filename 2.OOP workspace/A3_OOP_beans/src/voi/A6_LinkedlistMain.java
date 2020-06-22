package voi;

import java.util.LinkedList;

public class A6_LinkedlistMain {

	public static void main(String[] args) {
		
		//20181015 복습완료 ★
		
		System.out.println("=============");
		System.out.println("LinkedList");
		System.out.println("=============");
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("str1");
		linkedList.add("str2");
		linkedList.add("str3");
		linkedList.add("str4");
		linkedList.add("str5");
		
		// 가져와 확인
		System.out.println(linkedList);
		System.out.println(linkedList.get(3));
		
		// 삽입 수정
		linkedList.set(2,"str3333333");
		System.out.println(linkedList); 
		
		// 삭제
		linkedList.remove(2);
		System.out.println(linkedList);
		
		// 완전히 삭제
		linkedList.clear();
		System.out.println(linkedList);
		
		//쓰는 방법이 어레이 리스트랑 똑같음 - 같은 사람이 만듬
		

	}

}
