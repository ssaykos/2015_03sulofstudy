package _2주;

public class _7일차_2Method02 {

	static int add(int x, int y)
	{
		return x+y;
	}
	static int arrsum(int[] arr)
	{
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			total+=arr[i];
		}
		return total;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int x=4;
		int y=5;
		
		int result=add(x,y);
		System.out.println(result);
		System.out.println();
		
		int[] arr={10,20,30};
		int total =arrsum(arr);
		System.out.println("결과:"+total);
	}

}
