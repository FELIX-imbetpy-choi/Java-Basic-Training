import java.util.Scanner;

public class A2_ex {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
        int i = scanner.nextInt();
        
        int k = i/10;
        
        switch (k) {
        case 10:
		case 9:
			System.out.println("귀하의 점수는  A 입니다");
			
			break;
		case 8:
			System.out.println("귀하의 점수는  B 입니다");
			
			break;
		case 7:
			System.out.println("귀하의 점수는  C 입니다");
			
			break;
		case 6:
			System.out.println("귀하의 점수는  D 입니다");
			
			break;
		case 5:
			System.out.println("귀하의 점수는  F 입니다");
			
			break;
		default:
			System.out.println("자퇴각");
			break;
		

		
		}
        
        
	}

}
