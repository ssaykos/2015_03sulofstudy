package _2��;

public class _8����_1Overadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		add(3,5);
		int result=add(3,5,7);
		System.out.println("��� 1 :"+result);
		add(2.0,3.0);
	}
	private static void add(double d, double e)
	{
		double result =d+e;
		System.out.println("��� 2:"+result);
	}
	private static int add(int i ,int j , int k)
	{
		int result = i+j+k;
		return result;
	}
	private static void add(int i, int j)
	{
		int result =i+j;
		System.out.println("��� 3:"+result);
	}
	/*
	 * �������� �����ֽ� �ҽ�
	 * public class OverAdd {
	public static void main(String[] args) {
		Add(3, 5) ;
		int result = Add(3, 5, 7) ;
		System.out.println("���1:" + result );
		Add(2.0, 3.0) ;
	}
	private static void Add(double d, double e) {
		double result = d + e ;
		System.out.println("���2:" + result );
	}
	private static int Add(int i, int j, int k) {
		int result = i + j + k ;
		return result ;
	}
	private static void Add(int i, int j) {
		int result = i + j ;
		System.out.println("���3:" + result );

	}
}
	 */
	

}
