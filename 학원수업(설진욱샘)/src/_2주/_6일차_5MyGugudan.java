package _2주;

import java.util.Scanner;
public class _6일차_5MyGugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("시작 단수 입력:");
		int begin=scan.nextInt();
		
		System.out.println("끝 단수 입력:");
		int end=scan.nextInt();
		
		if(begin>end)
		{
			int tempswap=begin;
			begin=end;
			end=tempswap;
		}
		
		int row=(end-begin)+1;//행수
		int col=9;//열수
		
		int[][]arr=new int[row][col];
		for(int i=begin;i<=end;i++)
		{
			for(int j=1;j<=col;j++)
			{
				arr[i-begin][j-1]=(row+i)*j;
				String imsi=""+i+"*"+j+"="+i*j+"\t";
				
				System.out.print(imsi);
				
			}
			
			System.out.println();
			
		}
				
		
	}

}
