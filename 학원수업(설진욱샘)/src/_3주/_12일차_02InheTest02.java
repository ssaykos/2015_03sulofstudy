package _3��;

public class _12����_02InheTest02 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Mysub2 sub=new Mysub2();
		
		Mysub2 soo=new Mysub2("��ö��");
		
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
		System.out.println("�� �̸��� "+this.name+"�Դϴ�.");
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
		//super();<<����Ŭ�������� �Ͻ������� �����ִ� ����
		super();
		System.out.println("BBB");
	}
	public void Display()
	{
		super.Display();
		System.out.println("�̸�:"+super.getName());
	}
	public Mysub2(String name)
	{
		super(name);//<<���� ����Ʈ ������.���� �Ⱦ��� ����.
		System.out.println("CCC");
	}
}
