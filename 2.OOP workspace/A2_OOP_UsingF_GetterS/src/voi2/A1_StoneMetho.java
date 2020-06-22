package voi2;

public class A1_StoneMetho {

    // 멤버변수의 선언
    int weight;
    String color;
    
    // 1차관문
    public A1_StoneMetho() { //Basic Constructor(생성자) 입니다.
       System.out.println("I'm a stone");
    }
    
    //------------------------------------------------------
    
    // 2차관문
    // 멤버변수 선언 후 오른쪽클릭 - source - generate using filed 에서
    // 변수를 선택하고 만들면, 입력값을 받을 수 있는 생성자가 만들어진다
    public A1_StoneMetho(int weight, String color) {
       //super();
       this.weight = weight;
       this.color = color;
       // 여기서 this는 멤버변수를 받아와서 쓸 수 있게 하는 것
       // 멤버변수에 사용자의 매개변수를 입력함으로써 메소드 전체에서 입력값을 쓸 수 있게됨
       // System.out.println(weight + " : " + color);
    }
    
    public String weight() {
       String w_color;
       if(weight > 50) {
          w_color = "white";
       }else {
          w_color = "black";
       }
       return w_color;
    }
    
    public int color() {
       int w_weight = 0;
       if(color.equals("white")) {
          w_weight = 80;
          
       }else {
          w_weight = 40;
       }
       return w_weight;
    }

    
    //-----------------------------------------------
    
    //3차관문 - getter setter
    // 오른쪽 클릭 후 source - generate getter setter 를 선택하면
    // 멤버변수를 입력값 받아 불러오거나 수정할 수 있는 생성자를 자동으로 만들어준다.
    
    public int getWeight() {
       return weight;
    }

    public void setWeight(int weight) {
       this.weight = weight;
    }

    public String getColor() {
       return color;
    }

    public void setColor(String color) {
       this.color = color;
    }
    
    
    //--------------------------------------------------
 }

