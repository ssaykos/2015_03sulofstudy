package _2주;

public class _7일차_5MyDeviation {

	static double deviation(int [] arr)
	{
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			total+=arr[i];
		}
		double imsi=0.0;
		double average=(double)total/arr.length;
		for(int i=0;i<arr.length;i++)
		{
			imsi+=Math.pow((arr[i]-average),2.0);
		}
		imsi/=arr.length;
		
		return Math.sqrt(imsi);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {10,30,40,80};
		double result=deviation(arr);
		System.out.println("결과:"+result);
	}

}
