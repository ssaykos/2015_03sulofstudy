package _1��;
import java.util.Scanner;

public class _4����_2switch06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		System.out.println("���� �Է�:");
		int score=scan.nextInt();
		
		switch(score/10)
		{
		case 10:
		
		case 9:
		{
			System.out.println("A����");
			break;
		}
		case 8:
		{
			System.out.println("B����");
			break;
		}
		case 7:
		{
			System.out.println("C����");
			break;
		}
		case 6:
		{
			System.out.println("D����");
			break;
		}
		default:
		{
			System.out.println("F����");
			break;
		}
		}
		
		

	}

}
