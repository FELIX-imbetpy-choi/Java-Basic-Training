package com.rlec.function;

import java.io.FileOutputStream;
import java.io.IOException;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RFileInputStream;
import org.rosuda.REngine.Rserve.RserveException;

public class RserveTest {
	// Main에서 사용할 것이기 때문에 Main이 없음
	
	// Field Name 
	// Constructor
	// Method
	
	// Field
	private RConnection rCon = null;
	
	// Constructor 
	// throws RserveException - 에러방지
	public RserveTest() throws RserveException{
		System.out.println("Start Connection");
		rCon = new RConnection("192.168.99.100", 6311);
		System.out.println("End Connection");
	}
	
	// Method
	// 어하기 sum()
	// throws RserveException, REXPMismatchException - 에러방지
	public void getSum() throws RserveException, REXPMismatchException {
		String vector = "seq(1:10)";
		rCon.eval("sumVal <- sum("+vector+")");
		int sumT = rCon.eval("sumVal").asInteger();
		System.out.println("1부터 10까지의 합은 " + sumT + "입니다. ");
		}
	
	// 평균
	public void getMean() throws RserveException, REXPMismatchException {
		String vector = "seq(1:10)";
		rCon.eval("meanVal <- mean("+vector+")");
		double meanT = rCon.eval("meanVal").asDouble();
		System.out.println("1부터 10까지의 평균은 " + meanT + "입니다. ");
		}
	
	// lm & plot chart
	public void getLm() throws  REXPMismatchException, REngineException, IOException {
		// R의 vector 값을 이렇게 사용 - R의 숫자는 다 double로 받아와야 한다.
		// R의 vector 는 자바에서 double 배열로
		double[] x = new double[] {1,2,3,4,5,6,7,8,9,10};
		double[] y = new double[] {2,4,6,8,10,12,14,16,18,20};
		
		rCon.assign("x", x); // R의 X에 자바에서 선언한 x를 넣어줘라
		rCon.assign("y", y);
		
		rCon.eval("ols <- lm(y~x)");
		double[] coef = rCon.eval("ols$coefficient").asDoubles();
		System.out.println("기울기 :" + coef[1]);
		System.out.println("절편 :" + coef[0]);
		
		// plot - 그림을 그냥 파일로 저장 / jsp 에서 구현
		rCon.eval("png('myplot.png')");
		rCon.eval("plot(x,y)");
		rCon.eval("abline(ols)");
		rCon.eval("title(main='Test')");
		rCon.eval("dev.off()"); // 쥬피터에선 이 코드가 자동으로 써지는 것 써주어야 저장이 된다.
		
		RFileInputStream is = rCon.openFile("myplot.png");
		byte[] buf = new byte[9000];
		System.out.println("read "+ is.read(buf) + " bytes");
		FileOutputStream output = new FileOutputStream("c:\\temp\\myplot.png");
		output.write(buf);
		
		is.close();
		output.close();
		}
	
    public void getIris() throws RserveException, REXPMismatchException{
        RList rList = rCon.eval("head(iris)").asList();
        int cols = rList.size();
        int rows = rList.at(0).length(); // 첫번째 컬럼의 데이터값들의 길이(가로로 들어가는게 아니고 세로로 쭉 들어감), R은 1번부터 시작이지만 자바오는순간  0번이 첫번째 ㅎ
        
        String[][] s = new String[cols][]; // 2차원 배열은 하나만 사이즈 말해주면 다음꺼는 안써도됨
        
        for (int i = 0; i < cols; i++) {
           s[i] = rList.at(i).asStrings(); // String[cols][] 여기서 [] 부분만 넣어주면 됨. 그러면 cols는 그게 맞게 알아서 잡아줌.
        }
        
        for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
              System.out.print(s[j][i]);
              System.out.print("\t\t");
           }
           System.out.println("");
        }
        
     }
     
     public void getIrisHeader() throws RserveException, REXPMismatchException{
        RList rList = rCon.eval("head(iris)").asList();
        int cols = rList.size();
        
        String[] rHead = new String[cols];
        for (int i = 0; i < cols; i++) {
           String nameT = "names(iris)[" + (i+1) + "]"; // R에는 1번부터있기 때문에 +1한것
           rHead[i] = rCon.eval(nameT).asString();
           System.out.print(rHead[i] + '\t');
        }
        System.out.println("");
        
        for (int i = 0; i < cols; i++) {
           System.out.print("---------" + "\t");
        }
        System.out.println("");
     }
	

}//------------------------------------------------------
