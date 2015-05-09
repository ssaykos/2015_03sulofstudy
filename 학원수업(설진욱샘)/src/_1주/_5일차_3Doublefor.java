package _1주;

public class _5일차_3Doublefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제 1");
		int total=0;
		for(int i=1;i<101;i++)
		{
			for(int j=1;j<=i;j++)
			{
				total+=j;
			}
		}
		System.out.println("총합="+total);
		
		
		int n=0;
		for(int i=1;i<=100;i++)
		{
			for(int j=1;j<=i;j++)
			{
				n+=i;
			}
		}
		System.out.println("문제2");
		System.out.println("총합="+n);
		
		int n2=0;
		for(int i=1;i<=100;i++)
		{
			n2+=(Math.pow(i, 2));
		}
		System.out.println("문제2의 다른방식");
		System.out.println("총합="+n2);
	}

}
