package voi;

import voi2.A1_StoneMetho;

public class A1_Stone_Usingfiled_Gettersetter {

	public static void main(String[] args) {
		//20181014 복습완료 ★
		   
        // 1차관문 - 같은 생성자(메소드.객체)를 불러와도 완전히 다른 독립체로 객체가 생성
         A1_StoneMetho stone = new A1_StoneMetho();
         A1_StoneMetho stone2 = new A1_StoneMetho();
         System.out.println(stone.equals(stone2));
         
         //-------------------------------------------------------
         
         // 2차관문  - 생성자에 값을 입력한다 - 입력한 값을 멤버변수로 받기위해 this 사용
         // 입력한 값을 바탕으로 색과 무게를 나타내줌.
         A1_StoneMetho new_stone = new A1_StoneMetho(80, "red");
//         Stone new_stone2 = new Stone(40, "white"); //새로운객체에 수정하는것
         
         System.out.println("Stone Color : " + new_stone.weight());
         System.out.println("Stone Weight : " + new_stone.color());
         
         //-------------------------------------------------------
         
         // 3차관문 - 새로운 객체를 생성하지 않고 getter setter 로 입력값 수정 
         // 첫번째 수정
         new_stone.setWeight(40);
         new_stone.setColor("white");
         
         System.out.println("Stone Color : " + new_stone.weight());
         System.out.println("Stone Weight : " + new_stone.color());
         
         // 수정값 확인
         System.out.println(new_stone.getWeight());
         System.out.println(new_stone.getColor());
         
         //2차 수정
         new_stone.setColor("Yellow");
         System.out.println(new_stone.getColor());
         
      }

	//--------------------------------------------------------
   }