package _3주;

class Mysuper{
	int x=100;
	private String hello="안녕하세요.";
	public void sayhello()
	{
		System.out.println("메세지:"+this.hello);
	}
}
class Mysub extends Mysuper
{
	int y =200;
	
}
public class _12일차_01InheTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mysub sub=new Mysub();
		sub.y=500;
		System.out.println("sub.y:"+sub.y);
		
		sub.x=888;
		System.out.println("sub.x:"+sub.x);
		
		sub.sayhello();
	}

}
