package _2��;

public class _8����_3Overload02 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output(5,"hi");
		output(7);
		output('a','A','��');
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
		System.out.println("�νǼ��� ���� ������ ���� ��:"+result);
	}



	static void output(char c, char d, char e) {
		// TODO Auto-generated method stub
		char result=c > d ? c : d;
		result=result > e ? result : e;
		System.out.println("���� ū ���� ���� :"+result);
	}



	static void output(int i) {
		// TODO Auto-generated method stub
		int result=0;
		for(int _i=i;_i>0;_i--)
		{
			result+=_i;
		}
		System.out.println("1���� ������ ������ �� ��:"+result);
	}
}
/*
public class Overload02 
{
	static void overload(String msg, int cnt)
	{
	//�ش� msg�� cnt��ŭ �ݺ� ����Ѵ�.
	for (int i = 1; i <= cnt ; i++) 
		{
		System.out.println( msg ); 
		}
	}
	static void overload(int n)
	{
	//1���� n������ ������ ���Ѵ�.
	int total = 0 ;
	for (int i = 1; i <= n ; i++) 
		{
		total += i ; 
		}
	System.out.println( "���� : " + total  ); 
	}
	static void overload(char x, char y, char z)
	{
	//����ȯ�� �̿��Ͽ� ���� �߿��� ���� ū ���� ���Ѵ�.
		char result = x > y ? x : y ; //���� ������
		result =  result > z ? result : z ;
		System.out.println("�ִ� �� : " + result );  		
	}	
	static void overload(double x, double y)
	{
		double imsi = Math.pow(x, 2) + Math.pow(y, 2) ;
		System.out.println( imsi ); 
	}
	public static void main(String[] args) 
	{
	overload("�¸��", 5) ;
	overload(10) ;
	overload('a', 'A', 'f') ;
	overload(2.0, 3.0 ) ;
	}
}*/