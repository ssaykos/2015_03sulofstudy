package _2��;

public class _6����_1Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[]arr=new double[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Math.random();
			System.out.println("arr�迭��"+i+"��°��="+arr[i]);
		}
		
		double max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("arr�迭 �� ���� ū ��="+max);

	}

}
