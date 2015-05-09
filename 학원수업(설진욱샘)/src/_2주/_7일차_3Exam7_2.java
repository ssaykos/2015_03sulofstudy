package _2주;

public class _7일차_3Exam7_2 {

	static int min(int a, int b, int c)
	{
		int result=0;
		result = Math.min(a, b);
		result = Math.min(result, c);
		
		return result;
	}
	static int max(int a, int b,int c)
	{
		int result=0;
		result = Math.max(a, b);
		result = Math.max(result, c);
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=3,y=8,z=5;
		int result;
		result=min(x,y,z);
		System.out.println("최소값:"+result);
		
		result=max(x,y,z);
		System.out.println("최대값:"+result);
	}

}
