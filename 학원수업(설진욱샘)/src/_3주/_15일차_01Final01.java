package _3��;

public class _15����_01Final01 {

	public static void main(String[] args) {

		Cclass obj1 = new Cclass();
		obj1.Display();
		obj1.Some();
	}

}
class Mclass //extends String{// �ּ�Ǯ�� ��������
//���̳� Ŭ������ ����Ŭ������ �� �� ����.����Ŭ������ ���� Ŭ������ �Ǹ� �������̵����� �޼ҵ带 ���氡���ϴϱ�!..

	{
	static final String message="�ȳ��ϼ���";//���̳κ��� ������ �б� ���� ������ �ȴ�
	public void Display(){
		System.out.println("�޷�");
	}
	public final void Some(){//���̳� ���� �޼ҵ�� �������̵� �Ұ��� �޼ҵ尡 �ȴ�.
		System.out.println("���޼ҵ� ����Ŭ����");
		//message="hi";//(�ּ�Ǯ�鿡��)
	}
}
class Cclass extends Mclass{
	@Override//����Ŭ������ �����̸� �޼ҵ带 �ڳ� Ŭ������ �����̸����� �޼ҵ� ���� ������(���𵨸�) �ϴ°��̴�.
	public void Display() {
		System.out.println("�ո޷�");
	}
}
