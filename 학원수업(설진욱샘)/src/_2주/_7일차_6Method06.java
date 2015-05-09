package _2주;

public class _7일차_6Method06 {

	static int square(int x)
	{
		return x*x;
	}
	static int jegob(int x, int y)
	{
		int res1=square(x)+(int)Math.pow(y, 2);
		return res1;
	}
	static int max(int x, int y)
	{
		int res2=Math.max(x,y);
		return res2;
		//return x>y?x:y;
	}
	static void sub(int x, int y)
	{
		System.out.print("x와 y값의 차이:");
		if(x<y)
		{
			int temp =x;
			x=y;
			y=temp;
		}
		System.out.println(""+(x-y));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3,y=6;
		int res1=jegob(x,y);
		int res2=max(x,y);
		sub(res1,res2);
	}

}
