package _3��;

import java.security.CryptoPrimitive;

public class _14����_01Ref01 {

	public static void main(String[] args) {
		double d=100;
		System.out.println(d);
		//����Ŭ���� �̸� ���۷�������=new ����Ŭ���� �̸�();
		Animal animal = new DogSub();//�Ͻ��� ����ȯ �߻�
		
		System.out.println(animal.x);
		
		print(d);
		showData(animal);
				
		Animal[] myani= new Animal[3];
		
		myani[0] =new DogSub();
		myani[1]=new CatSub();
		myani[2]=new Animal();
		for (int i = 0; i < myani.length; i++) {
			myani[i].cry();
		}
		
		//���������� �����ϸ� �߿��̶�� ��µǰ� �ϼ���.
		//System.out.println(myani[1]);
		System.out.println(myani[1].toString());
		
		
	}

	private static void print(double d) {
		int i=(int)d;
		System.out.println(i);
	}

	private static void showData(Animal animal) {
		DogSub mydog=(DogSub)animal;//����
		System.out.println(mydog.x);
		System.out.println(mydog.y);
	}
}
class Animal{
	int x= 100;
	public void cry(){
		System.out.println("�ִϸ� ����Ŭ����");
		System.out.println("������ �Ҹ�����");
	}

}
class DogSub extends Animal{
	int y=200;
	public void cry(){
		System.out.println("�������� ¢�´�");
		System.out.println("�۸�");
	}
}
class CatSub extends Animal{
	int z=300;
	public void cry(){
		System.out.println("�����̰� ���");
		System.out.println("�߿�");
	}
	@Override
	public String toString() {
		return "�߿�";
	}
}