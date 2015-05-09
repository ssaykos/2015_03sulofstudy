package _2��;

public class _8����_2Exam7_30 {

	private static void min1(int a, int b)
	{
		int result=Math.min(a, b);
		System.out.println("��� ��2:"+result);
	}
	private static void min2(int a,int b,int c)
	{
		int result = Math.min(a, b);
		result =Math.min(result, c);
		System.out.println("��� ��2:"+result);
	}
	private static void min3(int[] arr)
	{
		int result= Math.min(arr[1], arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			result=Math.min(result, arr[i]);
		}
		System.out.println("�����3:"+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10,b=30,c=15;
		
		min1(a,b);
		
		min2(a,b,c); 
		
		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=((int)(Math.random()*15));
		}
		
		min3(arr);
		
		
	}

}

/*
 *�������� �����ֽ� �ҽ�
 
public class Exam7_30 {
	public static void main(String[] args) {
		int a = 3, b = 8, c = 4;
		int[] arr = { 20, 50, 10, 30 } ; 
		
		int result ;
		result = min(a, b); //2���� �ּҰ��� ���ϱ�
		System.out.println("�ּҰ�1 : " + result );
		
		result = min(a, b, c); //3���� �ּҰ��� ���ϱ�
		System.out.println("�ּҰ�2 : " + result ); 
		
		result = min(arr); //�迭 ����� �ּҰ� ���ϱ�
		System.out.println("�ּҰ�3 : " + result ); 
	}
	private static int min(int[] arr) {
		//0��° ��Ҹ� �ּҶ�� �����Ѵ�.
		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if ( result > arr[i]) {
				//���� �ּ� ���� �� ���� ���� �ִٸ�
				result = arr[i] ; //ġȯ�Ѵ�.
			}
		}
		return result ; 
	}
	private static int min(int a, int b, int c) {
		//Math Ŭ������ min() �޼ҵ带 �̿��Ͽ� ���� ���� ���Ѵ�.
		int result = Math.min(a, b) ;
		result = Math.min(result, c) ;
		return result ;
	}
	private static int min(int a, int b) {
		int result = Math.min(a, b) ;
		return result ;
	}
}
*/