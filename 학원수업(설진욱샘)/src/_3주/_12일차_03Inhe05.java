package _3��;
class Mother05{
	private String name;
	private int age;
	
	public Mother05(){
		//�Ƚ�Ծ ����� �ֶ��..
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void Display(){
		System.out.println("�̸�:"+this.name+"\n ����:"+this.age);
	}
	
}
class Child05 extends Mother05{
	
	public Child05() {
		//�Ƚ�Ծ ����� �ֶ��..
	}
	public Child05(String name, int age) 
	{
		setName(name);
		setAge(age);
		//super(name,age);
	}
	public void getData() {	
		super.Display();
	}	
	public Child05(int x, int y) {
		this.overload( x, y ) ;
		this.overload( x ) ;
	}
	private void overload(int data) {
				
		for(int i=data;i>0;--i)
		{
			data+=i;
		}
		//1���� data������ ������ ���Ѵ�.		
	}
	private void overload(int first, int second) {
		//first�� second�� ���� ���Ͽ� ����Ѵ�. 		
		int result= first+second;
		System.out.println("�հ�:"+result);
	}
}
public class _12����_03Inhe05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child05 jessica = new Child05("����ī", 20) ;
		jessica.getData() ; 		
		Child05 obj = new Child05(10, 20) ;
	}

}
