package _1��;

public class _5����_3Doublefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� 1");
		int total=0;
		for(int i=1;i<101;i++)
		{
			for(int j=1;j<=i;j++)
			{
				total+=j;
			}
		}
		System.out.println("����="+total);
		
		
		int n=0;
		for(int i=1;i<=100;i++)
		{
			for(int j=1;j<=i;j++)
			{
				n+=i;
			}
		}
		System.out.println("����2");
		System.out.println("����="+n);
		
		int n2=0;
		for(int i=1;i<=100;i++)
		{
			n2+=(Math.pow(i, 2));
		}
		System.out.println("����2�� �ٸ����");
		System.out.println("����="+n2);
	}

}
