package _4��;
import java.util.*;

public class _17����_02ExcepTest02 {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է�:");
		int x=Integer.parseInt(scan.next());
		
		System.out.println("�ι�° ���� �Է�:");
		
		try{
			int y=Integer.parseInt(scan.next());
			System.out.println(x/y);
		}catch(NumberFormatException e){
			System.out.println("���ڸ� �Է��ؾ� �ϴ� ���� ���ڸ� �Է��Ͽ���. �ƽ�Ű �ڵ尪���� �ٲٵ��� �Ѵ�.");
			
		}catch(ArithmeticException e){
			System.out.println("y���� 0���� Ŀ�� �ϴµ� 0�� �ԷµǾ���. �ٽ� �Է��ϰų� ����ó�� �ϵ��� ����.");
		}
		
		
		scan.close();
	}

}
