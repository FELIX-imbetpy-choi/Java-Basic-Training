package voi;

import java.util.StringTokenizer;

public class A3_TokenizerMain {

	public static void main(String[] args) {
		
		//20181014 복습완료 ★
		
		// 문자열 생성
		String str1 = "오늘은 날씨가 쌀쌀하겠습니다." ;
		String str2 = "2018/12/31";
		// 시험 출력  -  각 문자열이 있는 그대로 출력 
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("-----------------------------------");
		
		//--------------------------------------------------------------------------
		
		//토크나이저 생성
		StringTokenizer stringtokenizer1 = new StringTokenizer(str1);
		
		// 1. countTokens - 문자열의 갯수를 파악함.
		System.out.println("1의 문자열수 : " + stringtokenizer1.countTokens()); 
		// 2. hashMoreTokens - 토큰이 더이상 없을 때 까지 띄어쓰기를 기준으로 내려줌 - 분석에서 많이 쓰는 기능
		while(stringtokenizer1.hasMoreTokens()) {
		      // 3. nextToken 다음 토큰으로 이동함
		System.out.println(stringtokenizer1.nextToken());
		}
		// 처음에 나온 문자열 갯수가 0 이됨? 와일문에서 토큰이 제일 끝으로 가서  - 더이상 읽어들일 문자열이 없어서 0 이 나온다.
		System.out.println("1의 문자열수 : " + stringtokenizer1.countTokens());
		
		System.out.println("----------------------------------");
		
		//----------------------------------------------------------------------------
		
		// 4. 문자열을 나누는 기준을 정하는 법.
		//뒤에 ,"/"를 주면 /를 기준으로 나누어서 문자열을 다시 카운트 한다.
		StringTokenizer stringtokenizer2 = new StringTokenizer(str2, "/"); 
		// "/"를 기준으로 두지 않았다면 띄어쓰기 기준이므로 문자열이 하나가 나온다. 지금은 기준 설정되어 3개가 나온다.
		System.out.println("2의 문자열수 : " + stringtokenizer2.countTokens()); 
		
		
		while(stringtokenizer2.hasMoreTokens()) {
			System.out.println(stringtokenizer2.nextToken());
		}
		
		System.out.println("2의 문자열수 : " + stringtokenizer2.countTokens());

	}

}
