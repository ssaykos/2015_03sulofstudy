package _4주;

public class _17일차_01myException01 {

	private static void first(String string){
		second(string);
	}
	private static void second(String string){
		int x=Integer.parseInt(string);
	}
	
	public static void main(String[] args) {
		int x= 3, y=0;
		int[]arr={10,20,30};
		try{
			first("aa");
			arr[3]=50;//배열요소 인덱스문제
			System.out.println(x/y);//0으로 나누기 문제
						
			System.out.println("예외 발생시 나는 실행 안됨");
			
		}catch(ArithmeticException e){
			System.out.println("0으로 나누기 예외 발생 조치바람");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 인덱스 예외 발생");
		}catch(NumberFormatException e){
			System.out.println("숫자포맷항목예외발생");
			//System.out.println("문자열:"+e.toString());
			//System.out.println("메세지:"+e.getMessage());
			//e.printStackTrace();
		}catch(Exception e){
			System.out.println("나머지 항목 예외 발생");
		}finally{
			System.out.println("예외발생 여부에 상관없이 수행되는 finally코드");
		}
	}
}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at _4_주._17일차_01myException01.main(_17일차_01myException01.java:8)

//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
//at _4_주._17일차_01myException01.main(_17일차_01myException01.java:9)
