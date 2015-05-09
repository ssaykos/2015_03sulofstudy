package _2ÁÖ;

public class _6ÀÏÂ÷_3ArrayExam2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] arr=new int[2][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		for(int i=0;i<arr.length;i++)
		{
			for(int k=0;k<arr[i].length;k++)
			{
				System.out.println(arr[i][k]);
			}
			System.out.println();
		}
		
		
		int[][]brr=
			{	
				{10,20},
				{30,40,50}
			};
		for(int i=0;i<brr.length;i++)
		{
			for(int k=0;k<brr[i].length;k++)
			{
				System.out.println(brr[i][k]);
			}
			System.out.println();
		}
	}
}
