package _1주;
import java.util.Scanner;

public class _3일차_5If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("정수입력:");
		int num=scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+"는 짝수");
		}
		else
		{
			System.out.println(num+"는 홀수");
		}
		scan.close();
		

	}

}
