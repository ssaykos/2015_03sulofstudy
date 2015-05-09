package _2주;

public class _9일차_2Member01 
{

	private String ID;
	private String password;
	
	
	public _9일차_2Member01(String iD, String password) 
	{
		ID = iD;
		this.password = password;
	}

	public _9일차_2Member01()
	{
		this.ID="김철수";
		this.password="12345";
	}

	public void Display() 
	{
		System.out.println("아이디:"+this.ID);
		System.out.println("비번:"+this.password);
	}
	//this는 되도록 사용하는데 이유는 가독성 때문이고
	//this는 메소드내의 지역변수가 아닌 객체의 인스턴스 변수를 가르킬때 사용한다.
	//this는동일 클래스의 다른 생성자 호출시 사용한다.

	public String getID() 
	{
		return ID;
	}

	public void setID(String iD) 
	{
		ID = iD;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
}
