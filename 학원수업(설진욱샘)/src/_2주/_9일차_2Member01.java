package _2��;

public class _9����_2Member01 
{

	private String ID;
	private String password;
	
	
	public _9����_2Member01(String iD, String password) 
	{
		ID = iD;
		this.password = password;
	}

	public _9����_2Member01()
	{
		this.ID="��ö��";
		this.password="12345";
	}

	public void Display() 
	{
		System.out.println("���̵�:"+this.ID);
		System.out.println("���:"+this.password);
	}
	//this�� �ǵ��� ����ϴµ� ������ ������ �����̰�
	//this�� �޼ҵ峻�� ���������� �ƴ� ��ü�� �ν��Ͻ� ������ ����ų�� ����Ѵ�.
	//this�µ��� Ŭ������ �ٸ� ������ ȣ��� ����Ѵ�.

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
