package _1��;
import java.util.Scanner;

public class _4����_3Switch07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("�ֻ��� �� �Է�");
		
		int su=scan.nextInt();
		
		switch(su)
		{
		case 1:
		case 3:
		case 5:
			System.out.println("Ȧ��");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("¦��");
			break;
		default:
			System.out.println("error");
			break;
		}

	}

}
