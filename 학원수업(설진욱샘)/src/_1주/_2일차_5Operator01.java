package _1주;

public class _2일차_5Operator01 {

	public static void main(String[] args) {
		int a=10,b=8;
		boolean bool1,bool2,bool3,bool4,bool5;
		
		bool1=a!=b;//에이(10) 는 비(8) 와 같지 않다 [(참)]
		bool2=--a==b++;//에이-1(9) 은 비(8)와 같다[(거짓)]그리고 비를 +1 한다
		bool3=a++!=--b;//에이(9)는 비(8)와 같지 않다[(참)] 그리고 에이를 +1 한다
		bool4=bool3&&(5>7);//(참)and(&&,교집합,and연산) 5는 7보다 크다(거짓) [(거짓)]
		bool5= !bool4||(bool1&&bool2);//(참)or(||,합집합,or연산){(참)and(&&,교집합,and연산)(거짓)}[(참)]
		
		System.out.println("bool1:"+bool1);
		System.out.println("bool2:"+bool2);
		System.out.println("bool3:"+bool3);
		System.out.println("bool4:"+bool4);
		System.out.println("bool5:"+bool5);

	}

}
