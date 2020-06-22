package voi;

public class A94_ex12 {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {

		
		// 문제. for문이 돌면서 각 숫자별로 다른 문양이 찍히도록 하라!
		
	    for(int a = 1; a<=10; a++) {
	    	for(int b = 1; b<a+1; b++ ) {
	    				
	    		switch(a) {
	    		case 1:
	    		System.out.print("★");
	    		 break;
	        	case 2:
    			System.out.print("■");
    		     break;
	            case 3:
		     	System.out.print("＠");
		         break;
	            case 4:
 		        System.out.print("※");
             	 break;		
              	case 5:
                System.out.print("☆");
                break;
             	case 6:
		        System.out.print("◎");
		        break;
                case 7:
     	        System.out.print("▲");
     	        break;
                case 8:
                System.out.print("◁");
         	    break;
                case 9:
                System.out.print("♠");
             	break;
	        }
	    }
	    	System.out.println();
		
	
	}
	}
}
