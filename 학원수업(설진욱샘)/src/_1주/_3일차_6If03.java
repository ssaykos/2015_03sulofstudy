package _1주;
import java.util.Scanner;

public class _3일차_6If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		
		//Math 자바에서 수학공식을 지원하기 위한 클레스
		if(num%3==0)
		{
			System.out.println(Math.pow(num,2));
		}
		else
		{
			System.out.println(num+5);
		}
		scan.close();
	}

}
