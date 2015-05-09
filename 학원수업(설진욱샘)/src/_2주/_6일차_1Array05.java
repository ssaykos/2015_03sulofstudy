package _2주;

public class _6일차_1Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[]arr=new double[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Math.random();
			System.out.println("arr배열의"+i+"번째값="+arr[i]);
		}
		
		double max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("arr배열 중 가장 큰 값="+max);

	}

}
