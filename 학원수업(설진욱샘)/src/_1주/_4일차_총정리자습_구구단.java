package _1��;
import java.util.Scanner;
public class _4����_�������ڽ�_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for( ; ; )
		{
			System.out.println("�������� ����");
			System.out.print("����� �������� ���ڷ� �����ض� (����:0)(0�����۰ų�9����ū��):");
			int Sel=scan.nextInt();
			
			if(Sel==0)
			{
				System.out.println("�������� �����ϼ̽��ϴ�");
				break;
			}
			else if(Sel>=1&&Sel<=9)
			{
				for(int i=1;i<10;i++)
				{
					System.out.println(""+Sel+"X"+i+"="+(Sel*i));
				}
			}
			else
			{
				for(int i=1;i<10;i++)
				{
					for(int j=1;j<10;j++)
					{
						System.out.println(""+i+"X"+j+"="+(i*j));
					}
				}
			}
			
			
		}

	}

}
