package _4��;
/*package _4_��;

interface Animal{
	public abstract void cry(); //���(¢��)
	public abstract void run(); //�޸���
}
abstract class Feed implements Animal{
	String name = "����"; //���� �̸�
	String feed = "���" ; //���
	String anicry = "���"; //¢�� ���
	
	public abstract void eat(); //�߻� �޼ҵ� �Ա� 
	
	public Feed() { }
	public Feed(String name, String feed, String anicry) {
		this.name = name ;
		this.feed = feed ;
		this.anicry = anicry ;
	}
}
class Dog extends Feed{
	public Dog() { }
	public Dog(String name, String feed, String anicry) {
		super(name, feed, anicry) ;
	}
	@Override
	public void cry() {
		System.out.println(super.name + "(��)�� " + super.anicry  + "�ϰ� ¢�´�.");
	}
	@Override
	public void run() {
		System.out.println(super.name + "(��)�� �޸���.");
	}
	@Override
	public void eat() {		
		System.out.println(super.name + "(��)�� " + super.feed  + "�� �Դ´�.");
	}
}
class Cat extends Feed{
	public Cat() { }
	public Cat(String name, String feed, String anicry) {
		super(name, feed, anicry) ;
	}
	@Override
	public void cry() {		
		System.out.println(super.name + "(��)�� " + super.anicry  + "�ϰ� ¢�´�.");
	}
	@Override
	public void run() {
		System.out.println(super.name + "(��)�� �޸���.");		
	}
	@Override
	public void eat() {
		System.out.println(super.name + "(��)�� " + super.feed  + "�� �Դ´�.");
	}	
}
public class _16����_����1��{
	public static void main(String[] args) {
		Animal[] animal = new Animal[2] ;
		animal[0] = new Dog("ġ�Ϳ�", "���", "�۸�") ;		
		animal[1] = new Cat("����", "����", "�߿�") ;
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].cry() ;
			animal[i].run() ;
			
			//����
			Feed feed = (Feed)animal[i] ;
			feed.eat() ;
		}
		
		//�迭 �ʱ�ȭ ���
		Animal[] myani = { 
					new Dog("������1", "����1", "�۸�1"),
					new Cat("�����1", "����2", "�߿�1"),
					new Dog()
				} ;
		
		for (int i = 0; i < myani.length; i++) {
			myani[i].cry() ;
			myani[i].run() ;			
			//����
			Feed feed = (Feed)myani[i] ;
			feed.eat() ;
		}		
	}
}*/