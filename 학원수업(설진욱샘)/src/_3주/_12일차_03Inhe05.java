package _3주;
class Mother05{
	private String name;
	private int age;
	
	public Mother05(){
		//안써먹어도 만들어 둬라능..
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void Display(){
		System.out.println("이름:"+this.name+"\n 나이:"+this.age);
	}
	
}
class Child05 extends Mother05{
	
	public Child05() {
		//안써먹어도 만들어 둬라능..
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
		//1부터 data까지의 총합을 구한다.		
	}
	private void overload(int first, int second) {
		//first와 second의 합을 구하여 출력한다. 		
		int result= first+second;
		System.out.println("합계:"+result);
	}
}
public class _12일차_03Inhe05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child05 jessica = new Child05("제시카", 20) ;
		jessica.getData() ; 		
		Child05 obj = new Child05(10, 20) ;
	}

}
