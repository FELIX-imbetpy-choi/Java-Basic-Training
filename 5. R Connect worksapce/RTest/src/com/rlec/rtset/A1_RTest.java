package com.rlec.rtset;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class A1_RTest {

   public static void main(String[] args) {
      
      // 1줄로 표현할 수 있는 결과물 (R에서 실행했을때 1줄만 나올때)
      RConnection connection = null;
      
      try {
         // R 서버와 연결하는 부분, 자기 아이피 + 포트번호 순서
         connection = new RConnection("192.168.99.100", 6311);
         String vector = "seq(1:10)"; // R 커맨드 (1~10), 자바는 문장으로 아는거고 이걸 R로 넘겨줘야 명령어로 인식
         
         connection.eval("sumVal <- sum("+vector+")"); // R 커맨드, R에서 실행되는 부분
         connection.eval("meanVal <- mean("+vector+")");
         int sumT = connection.eval("sumVal").asInteger(); // 결과를 가져오는 부분
         double meanT = connection.eval("meanVal").asDouble();
         
         // ctrl + alt 밑 화살표
         System.out.println("주어진 벡터의 합은 "+ sumT + " 입니다.");
         System.out.println("주어진 벡터의 평균은 "+ meanT + " 입니다.");
         
      } catch (RserveException e) {
         e.printStackTrace();
      } catch (REXPMismatchException e) {
         e.printStackTrace();
      } finally {
         connection.close();
      }

   }

}