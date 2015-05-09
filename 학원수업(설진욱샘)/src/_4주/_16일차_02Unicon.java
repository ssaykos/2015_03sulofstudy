package _4주;

interface Bird{
	int speed=300;
	public void fly();
}
class Unicon implements Bird, _16일차_02Horse{
	private String name;
	public Unicon(String name) {
		this.name=name;
		this.run();	
		this.fly();
	}
	public void run(){
		System.out.println(this.name+"이(가) 시속"+ _16일차_02Horse.speed+"로 달립니다.");
	}
	public void fly(){
		System.out.println(this.name+"이(가) 시속"+Bird.speed+"로 날아갑니다.");	
	}
}
public class _16일차_02Unicon {

	public static void main(String[] args) {
		Unicon unidol = new Unicon("유니돌");
		Unicon unisoon= new Unicon("유니순");
	}
}
//인터페이스에는 일반 메소드가 들어갈수 없다.
//인터페이스의 모든 변수는 [인터페이스.변수이름]접근 할수 있다.
//인터페이스의 모든 변수는 수정이 불가능하다.(final)
//인터페이스 간의 상속에서 하위 인터페이스는 상위 인터페이스의 모든 메소드를 반드시 오버라이딩해야 한다.
