package _4��;
interface Animal{
	public abstract void cry(); //���(¢��)
	public abstract void run(); //�޸���
	public abstract void eat();//�̰� ���⿡ �ø��� �ȵȴ�(����)
	
}
abstract class Feed{
	static String name = "����"; //���� �̸�
	static String feed = "���" ; //���
	static String anicry = "���"; //¢�� ���

	public Feed(String name,String feed, String anicry){
		this.name=name;
		this.feed=feed;
		this.anicry=anicry;
	}
	public abstract void eat();//�߻� �޼ҵ� �Ա� 	
	
}
class Dog implements Animal{
	public Dog(String name,String feed, String anicry) {
		Feed.name=name;
		Feed.feed=feed;
		Feed.anicry=anicry;
	}
	
	@Override
	public void cry() {
		System.out.println(""+Feed.name+"�� �޸���.");		
	}
	@Override
	public void run() {
		System.out.println(""+Feed.name+"�� "+Feed.feed+"�� �Դ´�.");		
	}
	public void eat() {
		System.out.println(""+Feed.name+"�� "+Feed.anicry+"�ϰ� ¢�´�.");
	}
}

class Cat implements Animal {
	public Cat(String name,String feed, String anicry) {
		Feed.name=name;
		Feed.feed=feed;
		Feed.anicry=anicry;
		//super(name,feed,anicry);
	}
	
	@Override
	public void cry() {
		System.out.println(""+Feed.name+"�� �޸���.");		
	}
	@Override
	public void run() {
		System.out.println(""+Feed.name+"�� "+Feed.feed+"�� �Դ´�.");		
	}
	public void eat() {
		System.out.println(""+Feed.name+"�� "+Feed.anicry+"�ϰ� ���.");
	}
}

public class _16����_����1AnimalMain {

	public static void main(String[] args) {
		Animal[] animal = new Animal[2] ;
		animal[0] = new Dog("ġ�Ϳ�", "���", "�۸�") ;		
		animal[1] = new Cat("����", "����", "�߿�") ;		

		for (int i = 0; i < animal.length; i++) {
			animal[i].cry();
			animal[i].run();
			animal[i].eat();//���� : eat() �޼ҵ带 ȣ���ϴ� ����� �����ΰ���?
			//����----------------------------��� ���̾���..= 0=
			//Feed feed = (Feed)animal[i] ;
			//feed.eat() ;
			System.out.println();
		}
		
	}
	
}