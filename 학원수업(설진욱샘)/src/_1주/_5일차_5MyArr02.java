package _1주;

public class _5일차_5MyArr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={10,20,30};
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a배열의"+i+"번째값:"+a[i]);
		}
		
		int[] b=new int[98/5+1];
		for(int i=0;i<b.length;i++)
		{
			b[i]=5*i+3;
			System.out.println("배열 b의 "+i+"번째 값은"+b[i]);
		}
		
		int[] c=new int [92/10+1];
		for(int i=0;i<c.length;i++)
		{
			c[i]=92-10*i;
			System.out.println("배열 c의 "+i+"번째 값은"+c[i]);
		}
		

	}

}
