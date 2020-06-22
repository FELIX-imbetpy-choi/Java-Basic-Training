package voi;

import java.util.HashMap;

public class A7_HashmapMain {

	public static void main(String[] args) {
		
		//20181015 복습완료 ★
		
		//HashMap<K, V>
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();  
		
		//값설정
		// 1번째 정수는 키값으로 이용할 수 있고 2번째는 입력값으로 이용할 수 있음
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		hashMap.put(4, "str4");
		hashMap.put(5, "str5");
		
		
		// 시험출력
		System.out.println(hashMap);
		// 키값으로 출력 - 인덱스값과의 차이점 알기 
		System.out.println(hashMap.get(2)); 
		// 키값으로 삭제  - 삭제해도 인덱스처럼 앞으로 값들이 밀리지 않는다 - 각 키값에 고유하게 들어가는 값들
		hashMap.remove(2);
		System.out.println(hashMap);
		// 역시나 완전히 삭제 가능
		hashMap.clear();
		System.out.println(hashMap);
		
	}

}
