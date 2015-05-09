package _1주;
import java.util.Scanner;
public class _3일차_4If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int number = scan.nextInt();
		if(number%2==0)
		{
			System.out.println(number+"는 짝수이다");
		}
		scan.close();

	}

}
