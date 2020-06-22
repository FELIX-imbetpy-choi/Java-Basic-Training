package com.rlec.main;

import java.io.IOException;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.Rserve.RserveException;

import com.rlec.function.RserveTest;

public class Main {

	public static void main(String[] args) throws RserveException, REXPMismatchException, IOException, REngineException {
		// Sum 과 Mean을 class 호출하여 사용
		
		// Sum
		// 첫 째 RserveTest는 class  rtest는 instance 마지막 RserveTest는 생성자이다.
		RserveTest rtest = new RserveTest();
		System.out.println("<--------sum-------->");
		rtest.getSum();
		System.out.println("<--------mean-------->");
		rtest.getMean();
		System.out.println("<--------LM-------->");
		rtest.getLm();
		System.out.println("<--------Iris-------->");
		rtest.getIrisHeader();
		rtest.getIris();
		
	}

}
