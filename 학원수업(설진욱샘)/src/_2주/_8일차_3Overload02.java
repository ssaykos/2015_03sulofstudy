package _2주;

public class _8일차_3Overload02 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output(5,"hi");
		output(7);
		output('a','A','★');
		output(2.0,4.0);
	}
	
	static void output(int a,String hi) {
		for(int i=0;i<a;i++)
		{
			System.out.println(hi);
		}
	}		
	static void output(double d, double e) {
		// TODO Auto-generated method stub
		double result=(Math.pow(d, 2))+(Math.pow(e, 2));
		System.out.println("두실수를 각각 제곱한 수의 합:"+result);
	}



	static void output(char c, char d, char e) {
		// TODO Auto-generated method stub
		char result=c > d ? c : d;
		result=result > e ? result : e;
		System.out.println("가장 큰 문자 값은 :"+result);
	}



	static void output(int i) {
		// TODO Auto-generated method stub
		int result=0;
		for(int _i=i;_i>0;_i--)
		{
			result+=_i;
		}
		System.out.println("1부터 임의의 수까지 총 합:"+result);
	}
}
/*
public class Overload02 
{
	static void overload(String msg, int cnt)
	{
	//해당 msg를 cnt만큼 반복 출력한다.
	for (int i = 1; i <= cnt ; i++) 
		{
		System.out.println( msg ); 
		}
	}
	static void overload(int n)
	{
	//1부터 n까지의 총합을 구한다.
	int total = 0 ;
	for (int i = 1; i <= n ; i++) 
		{
		total += i ; 
		}
	System.out.println( "총합 : " + total  ); 
	}
	static void overload(char x, char y, char z)
	{
	//형변환을 이용하여 문자 중에서 가장 큰 수를 구한다.
		char result = x > y ? x : y ; //조건 연산자
		result =  result > z ? result : z ;
		System.out.println("최대 값 : " + result );  		
	}	
	static void overload(double x, double y)
	{
		double imsi = Math.pow(x, 2) + Math.pow(y, 2) ;
		System.out.println( imsi ); 
	}
	public static void main(String[] args) 
	{
	overload("굿모닝", 5) ;
	overload(10) ;
	overload('a', 'A', 'f') ;
	overload(2.0, 3.0 ) ;
	}
}*/