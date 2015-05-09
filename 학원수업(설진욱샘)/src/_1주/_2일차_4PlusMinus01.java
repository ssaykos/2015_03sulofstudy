package _1ÁÖ;

public class _2ÀÏÂ÷_4PlusMinus01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int c;
		c=	++a	+	b++;//c=11+20=31
		System.out.println("a:"+a);//11
		System.out.println("b:"+b);//21
		System.out.println("c:"+c);//31
		
		System.out.println("-----");
		c=	a++	+	--b;//c=11+20=31
		System.out.println("a:"+a);//12
		System.out.println("b:"+b);//20
		System.out.println("c:"+c);//31
		
		System.out.println("-----");
		a=15;
		b=12;
		c=	--a	+	--b;//c=14+11=25
		System.out.println("a:"+a);//14
		System.out.println("b:"+b);//11
		System.out.println("c:"+c);//25
		
		System.out.println("-----");
		int x=3, y=5,z;
		
		z=	x++	+	--y;//z=3+4=7
		
		System.out.println("x:"+x);//4
		System.out.println("y:"+y);//4
		System.out.println("z:"+z);//7
		
		System.out.println("-----");
		z+=	--x	+	y++;//z=7+3+4=14
		System.out.println("x:"+x);//3
		System.out.println("y:"+y);//5
		System.out.println("z:"+z);//14
		
		
	}

}
