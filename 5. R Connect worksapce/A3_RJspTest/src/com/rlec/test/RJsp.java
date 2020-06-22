package com.rlec.test;

import java.io.FileOutputStream;
import java.io.IOException;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RFileInputStream;
import org.rosuda.REngine.Rserve.RserveException;

// 모든 메소드에 커넥션이 있어야 한다. 한번 돌면 끊어져 버림.
public class RJsp {
	
	public REXP rx = null;
	public RConnection rCon = null;
	public String retStr = "";
	

	
	public RJsp() {
	}
	
	// 합계
	public String getSum() throws RserveException, REXPMismatchException{
		rCon = new RConnection("192.168.99.100", 6311);
		String vector = "seq(1:10)";
		
		rCon.eval("sumVal <- sum(" + vector + ")");
		String sumT = rCon.eval("sumVal").asString();
		rCon.close();
		return sumT;
		
	}
	
	// 평균
	public String getMean() throws RserveException, REXPMismatchException {
		rCon = new RConnection("192.168.99.100", 6311);
		String vector = "seq(1:10)";
		
		rCon.eval("meanVal <- mean("+vector+")");
		String meanT = rCon.eval("meanVal").asString();
		rCon.close();
		return meanT;
		}
	
	// 아이리스 헤더 가져오기
	public String[] getIrisHeader() throws RserveException, REXPMismatchException{
		rCon = new RConnection("192.168.99.100", 6311);
		RList rlist = rCon.eval("head(iris)").asList();
		int cols = rlist.size();
		
		String[] rHead = new String[cols];
		for (int i = 0; i < cols; i++) {
			String namesT = "names(iris)[" + (i+1) +"]";
			rHead[i] = rCon.eval(namesT).asString();
		}
		rCon.close();
		return rHead;
	}
	
	// 컬럼 갯수 보내기
	public int getIrisCols() throws RserveException, REXPMismatchException {
		rCon = new RConnection("192.168.99.100", 6311);
		RList rlist = rCon.eval("head(iris)").asList();
		int cols = rlist.size();
		rCon.close();
		return cols;
	}
	
	// 컬럼 로우수 보내기
	public int getIrisRows() throws RserveException, REXPMismatchException {
		rCon = new RConnection("192.168.99.100", 6311);
		RList rlist = rCon.eval("head(iris)").asList();
		int rows = rlist.at(0).length();
		rCon.close();
		return rows;
	}
	
	public String[][] getIris() throws RserveException, REXPMismatchException{
		rCon = new RConnection("192.168.99.100", 6311);
		RList rlist = rCon.eval("head(iris)").asList();
		int cols = rlist.size();
		
		String[][] s = new String[cols][];
		for (int i = 0; i < cols; i++) {
			s[i] = rlist.at(i).asStrings();
			}
		rCon.close();
		return s;
	}
	
	   // JSP에 그림띄우기 (많이 쓸것)
	   public byte[] getPlot() throws RserveException, REXPMismatchException, IOException{
	      rCon = new RConnection("192.168.99.100", 6311);
	      rCon.eval("png('irisplot.png')");
	      rCon.eval("plot(iris$Sepal.Length)");
	      rCon.eval("dev.off()"); // 이걸해야 그림을 가져올 수 있음
	      
	      // 경로 따로 지정안해줌. 따로 작성안해주면 'data:image/png'에 들어가게 됨. 그래서 base64에서 불러오는 것이고
	      // 이렇게 하는 이유는 사용자 마다 위치가 다르기 떄문에 메모리에서 불러오기 위해
	      RFileInputStream is = rCon.openFile("irisplot.png"); 
	      byte[] buf = new byte[90000];
	      System.out.println("read" + is.read(buf) + " bytes"); // 자바에서 확인용
	      
	      is.close();
	      rCon.close();
	      return buf; // buff : 그림에 대한 이진화 된 문자가 들어있음
	   }
	   

}//---------------------------------------

