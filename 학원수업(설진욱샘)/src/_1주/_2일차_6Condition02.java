package _1주;

public class _2일차_6Condition02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a가 큰수이면 5를 a가 큰수가 아니면 (a+2)를 연산하는 조건 연산자를 만드세요.
		int a=3,b=5;
		int x=(a>b)?5:(a+2);//거짓 x는 5
		System.out.println("x:"+x);//5
		
		int n=5;
		int result=n%2==0?n+3:n*n;//x가 짝수인가?(거짓)result는 25
		System.out.println("result:"+result);//25
		
		x=3;
		int y=8;
		result=x>y?x:y;//둘 중에 큰 수는?result는8
		System.out.println("result:"+result);//8
		
		x=5;y=12;
		String str=y%x==0?"yes":"no";//12나누기2를 했을때 나머지는 0이다 str는No
		System.out.println("str:"+str);//No
		
		
		
	}

}
