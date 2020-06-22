package com.rlec.main;

import java.io.IOException;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.Rserve.RserveException;

import com.rlec.function.RserveTest;
import com.rlec.function.RserveTest2;

public class Main2 {

	public static void main(String[] args) throws RserveException, REXPMismatchException, IOException, REngineException {
		// IRIS plot 저장
		RserveTest2 rtest = new RserveTest2();
		System.out.println("<--------Iris-------->");
		rtest.getIRIS();
	}
}
