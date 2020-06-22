package com.rlec.function;

import java.io.FileOutputStream;
import java.io.IOException;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RFileInputStream;
import org.rosuda.REngine.Rserve.RserveException;

public class RserveTest2 {
	// Main에서 사용할 것이기 때문에 Main이 없음
	
	// Field
	private RConnection rCon = null;
	
	// Constructor 
	public RserveTest2() throws RserveException{
		System.out.println("Start Connection");
		rCon = new RConnection("192.168.99.100", 6311);
		System.out.println("End Connection");
	}

	
	// 산점도 그리기
	public void getIRIS() throws  REXPMismatchException, REngineException, IOException {
		
		// plot - 그림을 그냥 파일로 저장 / jsp 에서 구현
		rCon.eval("png('iris.png')");
		rCon.eval("plot(iris$Sepal.Length)");
		rCon.eval("title(main='iris')");
		rCon.eval("dev.off()"); // 쥬피터에선 이 코드가 자동으로 써지는 것 써주어야 저장이 된다.
		
		RFileInputStream is = rCon.openFile("iris.png");
		byte[] buf = new byte[20000];
		System.out.println("read "+ is.read(buf) + " bytes");
		FileOutputStream output = new FileOutputStream("c:\\temp\\IRIS.png");
		output.write(buf);
		
		is.close();
		output.close();
		}
	
}//-----------------------------------------------------
