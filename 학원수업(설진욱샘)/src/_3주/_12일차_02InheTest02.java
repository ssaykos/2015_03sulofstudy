package _3주;

public class _12일차_02InheTest02 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Mysub2 sub=new Mysub2();
		
		Mysub2 soo=new Mysub2("김철수");
		
		soo.Display();
	}

}
class Mysuper2
{
	private String name;
	public String getName()
	{
		return name;
	}
	public Mysuper2(String name)
	{
		this.name=name;
		System.out.println("DDD");
	}
	public void Display()
	{
		System.out.println("제 이름은 "+this.name+"입니다.");
	}
	public Mysuper2() {
		// TODO Auto-generated constructor stub
		System.out.println("AAA");
	}
	
}
class Mysub2 extends Mysuper2
{
	public Mysub2() 
	{
		// TODO Auto-generated constructor stub
		//super();<<서브클래스에는 암시적으로 숨어있는 문장
		super();
		System.out.println("BBB");
	}
	public void Display()
	{
		super.Display();
		System.out.println("이름:"+super.getName());
	}
	public Mysub2(String name)
	{
		super(name);//<<숨은 디폴트 생성자.쓰나 안쓰나 같다.
		System.out.println("CCC");
	}
}
