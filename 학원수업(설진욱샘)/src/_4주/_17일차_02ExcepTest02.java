package _4주;
import java.util.*;

public class _17일차_02ExcepTest02 {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력:");
		int x=Integer.parseInt(scan.next());
		
		System.out.println("두번째 정수 입력:");
		
		try{
			int y=Integer.parseInt(scan.next());
			System.out.println(x/y);
		}catch(NumberFormatException e){
			System.out.println("숫자만 입력해야 하는 곳에 문자를 입력하였다. 아스키 코드값으로 바꾸도록 한다.");
			
		}catch(ArithmeticException e){
			System.out.println("y값은 0보다 커야 하는데 0이 입력되었다. 다시 입력하거나 예외처리 하도록 하자.");
		}
		
		
		scan.close();
	}

}
