package _4��;
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

public class _16����_03Interface implements Display{
	int speed = Speed.speed ;
	
	public static void main(String[] args) {
		_16����_03Interface obj = new _16����_03Interface();

		System.out.println("���� �ӵ� : " + obj.speed);
		obj.speedUp( 80 ) ;
		obj.display() ;
		obj.speedDown( 50 ) ;
		obj.display() ;
		
	}

	private void display() {
		
		System.out.println("�����ӵ�:"+speed);
	}
	@Override
	public void speedUp(int increase) {
		System.out.print(""+increase+"��ŭ ���� ��ŵ�ϴ�.");
		this.speed+=increase;		
	}

	@Override
	public void speedDown(int decrease) {
		System.out.print(""+decrease+"��ŭ ���� ��ŵ�ϴ�.");
		this.speed-=decrease;	
	}

	@Override
	public void dispaly() {
		
		System.out.println("�����ӵ�:"+speed);
	}	 
	
}