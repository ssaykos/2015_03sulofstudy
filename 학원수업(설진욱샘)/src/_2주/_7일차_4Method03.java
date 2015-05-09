package _2주;
import java.util.Scanner;
public class _7일차_4Method03 
{
	static void sum( int su)//1부터 입력받은 값까지 의 합계
	{
		int total=0;
		for(int i=1;i<=su;i++)
		{
			total+=i;
		}
		System.out.println("결과는:"+total);
	}
	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		int num=scan.nextInt();
		
		sum(num);
		scan.close();
		
	}

}
