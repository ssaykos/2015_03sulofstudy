package _2ÁÖ;

public class _6ÀÏÂ÷_4MyTansform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[][]=
			{
				{1,2,3,4},
				{5,6,7,8}
			};
		int[][] arr2=new int[4][2];
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				arr2[i][j]=arr1[j][i];
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		int brr1[][]=
			{
				{1,2,3,4},
				{5,6,7,8}
			};
		int[][]brr2=new int[4][2];
		for(int i=0;i<brr2.length;i++)
		{
			for(int j=0;j<brr2[i].length;j++)
			{
				brr2[i][j]=brr1[j][(brr1.length-i-1)];	
			}
		
		}
		for(int i=0;i<brr2.length;i++)
		{
			for(int j=0;j<brr2[i].length;j++)
			{
				System.out.print(brr2[i][j]+"\t");
			}
			System.out.println();
		}		
	}

}
