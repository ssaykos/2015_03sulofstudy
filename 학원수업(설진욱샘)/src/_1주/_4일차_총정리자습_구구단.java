package _1주;
import java.util.Scanner;
public class _4일차_총정리자습_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for( ; ; )
		{
			System.out.println("구구단을 하자");
			System.out.print("출력할 구구단을 숫자로 선택해라 (종료:0)(0보다작거나9보다큰수):");
			int Sel=scan.nextInt();
			
			if(Sel==0)
			{
				System.out.println("구구단을 종료하셨습니다");
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
