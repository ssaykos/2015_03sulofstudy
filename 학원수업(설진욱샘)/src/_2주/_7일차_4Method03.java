package _2��;
import java.util.Scanner;
public class _7����_4Method03 
{
	static void sum( int su)//1���� �Է¹��� ������ �� �հ�
	{
		int total=0;
		for(int i=1;i<=su;i++)
		{
			total+=i;
		}
		System.out.println("�����:"+total);
	}
	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���:");
		int num=scan.nextInt();
		
		sum(num);
		scan.close();
		
	}

}
