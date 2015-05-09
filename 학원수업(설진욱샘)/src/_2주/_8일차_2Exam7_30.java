package _2주;

public class _8일차_2Exam7_30 {

	private static void min1(int a, int b)
	{
		int result=Math.min(a, b);
		System.out.println("결과 값2:"+result);
	}
	private static void min2(int a,int b,int c)
	{
		int result = Math.min(a, b);
		result =Math.min(result, c);
		System.out.println("결과 값2:"+result);
	}
	private static void min3(int[] arr)
	{
		int result= Math.min(arr[1], arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			result=Math.min(result, arr[i]);
		}
		System.out.println("결과값3:"+result);
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
 *선생님이 적어주신 소스
 
public class Exam7_30 {
	public static void main(String[] args) {
		int a = 3, b = 8, c = 4;
		int[] arr = { 20, 50, 10, 30 } ; 
		
		int result ;
		result = min(a, b); //2수중 최소값을 구하기
		System.out.println("최소값1 : " + result );
		
		result = min(a, b, c); //3수중 최소값을 구하기
		System.out.println("최소값2 : " + result ); 
		
		result = min(arr); //배열 요소중 최소값 구하기
		System.out.println("최소값3 : " + result ); 
	}
	private static int min(int[] arr) {
		//0번째 요소를 최소라고 가정한다.
		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if ( result > arr[i]) {
				//현재 최소 보다 더 작은 수가 있다면
				result = arr[i] ; //치환한다.
			}
		}
		return result ; 
	}
	private static int min(int a, int b, int c) {
		//Math 클래스의 min() 메소드를 이용하여 작은 수를 구한다.
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