package _2주;

public class _10일차_4Human {

	static String massage1="으하하하하핫";
	private String name1;
	private int age1=30;
	
	public _10일차_4Human(String name1)
	{
		this.name1=name1;
	}
	public _10일차_4Human(String name1, int age1)
	{
		this.name1= name1;
		this.age1= age1;
		
	}
	public void Display()
	{
		System.out.println("이름:"+this.name1);
		System.out.println("나이:"+this.age1);
	}
	public void y()
	{
		System.out.println("y메소드");
	}
}
