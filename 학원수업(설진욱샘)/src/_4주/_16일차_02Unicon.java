package _4��;

interface Bird{
	int speed=300;
	public void fly();
}
class Unicon implements Bird, _16����_02Horse{
	private String name;
	public Unicon(String name) {
		this.name=name;
		this.run();	
		this.fly();
	}
	public void run(){
		System.out.println(this.name+"��(��) �ü�"+ _16����_02Horse.speed+"�� �޸��ϴ�.");
	}
	public void fly(){
		System.out.println(this.name+"��(��) �ü�"+Bird.speed+"�� ���ư��ϴ�.");	
	}
}
public class _16����_02Unicon {

	public static void main(String[] args) {
		Unicon unidol = new Unicon("���ϵ�");
		Unicon unisoon= new Unicon("���ϼ�");
	}
}
//�������̽����� �Ϲ� �޼ҵ尡 ���� ����.
//�������̽��� ��� ������ [�������̽�.�����̸�]���� �Ҽ� �ִ�.
//�������̽��� ��� ������ ������ �Ұ����ϴ�.(final)
//�������̽� ���� ��ӿ��� ���� �������̽��� ���� �������̽��� ��� �޼ҵ带 �ݵ�� �������̵��ؾ� �Ѵ�.
