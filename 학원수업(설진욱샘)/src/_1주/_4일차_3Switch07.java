package _1주;
import java.util.Scanner;

public class _4일차_3Switch07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("주사위 수 입력");
		
		int su=scan.nextInt();
		
		switch(su)
		{
		case 1:
		case 3:
		case 5:
			System.out.println("홀수");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("짝수");
			break;
		default:
			System.out.println("error");
			break;
		}

	}

}
