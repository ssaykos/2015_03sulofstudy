package _1주;
import java.util.Scanner;

public class _4일차_2switch06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		System.out.println("점수 입력:");
		int score=scan.nextInt();
		
		switch(score/10)
		{
		case 10:
		
		case 9:
		{
			System.out.println("A학점");
			break;
		}
		case 8:
		{
			System.out.println("B학점");
			break;
		}
		case 7:
		{
			System.out.println("C학점");
			break;
		}
		case 6:
		{
			System.out.println("D학점");
			break;
		}
		default:
		{
			System.out.println("F학점");
			break;
		}
		}
		
		

	}

}
