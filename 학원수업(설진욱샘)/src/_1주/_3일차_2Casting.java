package _1��;

public class _3����_2Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=100;
		System.out.println("d:"+d);//100.0
		
		int a=(int)15.5;//�Ǽ����� ���������� ��ȯ�� �ڵ�(�Ͻ���)���� ��ȯ�� �Ұ��� �ϱ⶧���� ����(�����)�� �ٲ���߸� �Ѵ� ���־�Ʃ����ʹ� �ٸ���?�ε� �ϴ�.
		System.out.println("a:"+a);//15
		
		System.out.println(14/5);
		System.out.println((double)14/5);//2.8
		//(double) 14/5
		//14.0 /5.0<-����� ����ȯ
		//2.8
		System.out.println((double)(14/5));//?2.0?
		//(double)(14/5)
		//(double)2
		//2
		
		int kor=50,eng=60,math=80;
		int total=kor+eng+math;
		double average=(double)total/3;
		double average1=total/3;
		System.out.println("����:"+total);//190
		System.out.println("���1:"+average);//63.333333
		System.out.println("���2:"+average1);//63.0
		
		
		char ch1='c';
		char ch2='a';
		boolean bool1=ch1>ch2;//99>97
		System.out.println(bool1);//True
		
		int result=ch1-ch2+3;
		System.out.println(result);//5
		
		char ch3='D';
		String str=ch3>='A'&&ch3<='Z'?"�빮��":"�ҹ���";
		System.out.println(str);//�빮��
		

	}

}
