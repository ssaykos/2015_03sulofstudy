package _1��;

public class _2����_6Condition02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a�� ū���̸� 5�� a�� ū���� �ƴϸ� (a+2)�� �����ϴ� ���� �����ڸ� ���弼��.
		int a=3,b=5;
		int x=(a>b)?5:(a+2);//���� x�� 5
		System.out.println("x:"+x);//5
		
		int n=5;
		int result=n%2==0?n+3:n*n;//x�� ¦���ΰ�?(����)result�� 25
		System.out.println("result:"+result);//25
		
		x=3;
		int y=8;
		result=x>y?x:y;//�� �߿� ū ����?result��8
		System.out.println("result:"+result);//8
		
		x=5;y=12;
		String str=y%x==0?"yes":"no";//12������2�� ������ �������� 0�̴� str��No
		System.out.println("str:"+str);//No
		
		
		
	}

}
