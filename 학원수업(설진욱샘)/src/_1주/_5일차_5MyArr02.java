package _1��;

public class _5����_5MyArr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={10,20,30};
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a�迭��"+i+"��°��:"+a[i]);
		}
		
		int[] b=new int[98/5+1];
		for(int i=0;i<b.length;i++)
		{
			b[i]=5*i+3;
			System.out.println("�迭 b�� "+i+"��° ����"+b[i]);
		}
		
		int[] c=new int [92/10+1];
		for(int i=0;i<c.length;i++)
		{
			c[i]=92-10*i;
			System.out.println("�迭 c�� "+i+"��° ����"+c[i]);
		}
		

	}

}
