package _3주;

public class _15일차_01Final01 {

	public static void main(String[] args) {

		Cclass obj1 = new Cclass();
		obj1.Display();
		obj1.Some();
	}

}
class Mclass //extends String{// 주석풀면 에러난다
//파이널 클래스는 슈퍼클래스가 될 수 없다.슈퍼클래스는 서브 클래스가 되면 오버라이딩으로 메소드를 변경가능하니깐!..

	{
	static final String message="안녕하세요";//파이널붙은 변수는 읽기 전용 변수가 된다
	public void Display(){
		System.out.println("메렁");
	}
	public final void Some(){//파이널 붙은 메소드는 오버라이딩 불가한 메소드가 된다.
		System.out.println("섬메소드 마더클래스");
		//message="hi";//(주석풀면에러)
	}
}
class Cclass extends Mclass{
	@Override//마더클래스의 같은이름 메소드를 자녀 클래스의 같은이름으로 메소드 만들어서 재정의(리모델링) 하는것이다.
	public void Display() {
		System.out.println("왕메렁");
	}
}
