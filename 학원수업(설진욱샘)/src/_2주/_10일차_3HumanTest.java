package _2주;

public class _10일차_3HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static 변수를 클래스 변수라고 부른다.
		//이유는 클래스이름.변수로 접근이 가능하기 때문이다.
				
		//접근이 가능한 이유는 static 변수가 미리 메모리에 로딩되어 있기 때문이다.
		System.out.println(_10일차_4Human.massage1);
		
		_10일차_4Human hodong=new _10일차_4Human("강호동",40);
		hodong.Display();
		
		_10일차_4Human suji=new _10일차_4Human("강수지");
		suji.Display();
		suji.y();
		x();
		
	}

	private static void x()
	{
		System.out.println("x메소드");
	}
}
