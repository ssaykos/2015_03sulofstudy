package _1��;
import java.util.Scanner;

public class _3����_6If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է�:");
		int num=scan.nextInt();
		
		//Math �ڹٿ��� ���а����� �����ϱ� ���� Ŭ����
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
