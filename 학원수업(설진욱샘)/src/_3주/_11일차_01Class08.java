package _3주;

public class _11일차_01Class08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variable obj = new Variable();
		
	}


}
class PlayingCard
{
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n)
	{
		kind=k;
		num=n;
	}
}
class Variable
{
	static int x= 100;
	int y=200;
	private static final int z = 300;
	
	public void Display()
	{
		int xx= 999;
		System.out.println("지역 변수는 생성시 초기화 하는게 필수?");
		System.out.println("지역변수:"+xx);
	}
}
