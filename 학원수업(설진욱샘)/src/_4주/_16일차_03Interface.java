package _4주;
interface Speed{ 
	int speed =10;
	public void speedUp(int increase);
	public void speedDown(int decrease);
}
interface Display extends Speed{
	public void dispaly();
	@Override
	public String toString();
	
}

public class _16일차_03Interface implements Display{
	int speed = Speed.speed ;
	
	public static void main(String[] args) {
		_16일차_03Interface obj = new _16일차_03Interface();

		System.out.println("최초 속도 : " + obj.speed);
		obj.speedUp( 80 ) ;
		obj.display() ;
		obj.speedDown( 50 ) ;
		obj.display() ;
		
	}

	private void display() {
		
		System.out.println("최종속도:"+speed);
	}
	@Override
	public void speedUp(int increase) {
		System.out.print(""+increase+"만큼 가속 시킵니다.");
		this.speed+=increase;		
	}

	@Override
	public void speedDown(int decrease) {
		System.out.print(""+decrease+"만큼 감속 시킵니다.");
		this.speed-=decrease;	
	}

	@Override
	public void dispaly() {
		
		System.out.println("최종속도:"+speed);
	}	 
	
}