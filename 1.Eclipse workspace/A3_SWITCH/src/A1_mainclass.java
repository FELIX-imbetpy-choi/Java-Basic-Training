import java.util.Scanner;

public class A1_mainclass {

	public static void main(String[] args) {

		//사용자로 부터 숫자를 입력 받는다
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
        int i = scanner.nextInt();

        
        	// 이러한 if문을 switch문으로 해결해 보자.
            //if(k>0) {
        	//		System.out.println("홀수입니다");
        	//	}else {
        	//		System.out.println("짝수입니다");
        	//	}
        	//	System.o
		
        //입력한 숫자가 짝수인지 홀수인지 판별하여 결과 출력
        int k = i%2;
        	switch (k) {
			case 0:
				System.out.println("짝수입니다");
				break; //0이 실행되면 break를 만나서 바로 작업이 종료된다
			case 1:
				System.out.println("홀수입니다");
				break;
			default:
				break;
				
	}
}
}

