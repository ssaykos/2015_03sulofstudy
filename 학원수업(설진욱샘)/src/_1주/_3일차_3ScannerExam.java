package _1주;


import java.util.Scanner;//스캔기능을 쓸 수 있도록 전처리문?
public class _3일차_3ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.print("이름을 입력하세요:");
		String name=scan.next();
		System.out.println("이름:"+name);
		
		System.out.print("나이를 입력하세요:");
		int age=scan.nextInt();
		System.out.println("나이:"+age+"살");
		}

}
