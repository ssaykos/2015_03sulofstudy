package _2주;

public class _7일차_1Method01 {

		static int Plus5( int x)
		{
			int result=x+5;
			return result;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		String str="Korea";
		/
		int len =str.length();
		System.out.println("글자수:"+len);
		
		char ch =str.charAt(2);
		System.out.println("2번째 글자:"+ch);
		*/
		int x= 3;
		int result=Plus5(x);
		System.out.println("결과:"+result);
		
		x= 3;
		result=Plus5(100);
		System.out.println("결과:"+result);
		
	}

}
