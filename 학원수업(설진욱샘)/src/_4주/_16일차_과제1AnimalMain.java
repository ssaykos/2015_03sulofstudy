package _4주;
interface Animal{
	public abstract void cry(); //울기(짖기)
	public abstract void run(); //달리기
	public abstract void eat();//이거 여기에 올리면 안된다(오답)
	
}
abstract class Feed{
	static String name = "동물"; //동물 이름
	static String feed = "사료" ; //사료
	static String anicry = "울기"; //짖는 방법

	public Feed(String name,String feed, String anicry){
		this.name=name;
		this.feed=feed;
		this.anicry=anicry;
	}
	public abstract void eat();//추상 메소드 먹기 	
	
}
class Dog implements Animal{
	public Dog(String name,String feed, String anicry) {
		Feed.name=name;
		Feed.feed=feed;
		Feed.anicry=anicry;
	}
	
	@Override
	public void cry() {
		System.out.println(""+Feed.name+"가 달린다.");		
	}
	@Override
	public void run() {
		System.out.println(""+Feed.name+"가 "+Feed.feed+"를 먹는다.");		
	}
	public void eat() {
		System.out.println(""+Feed.name+"가 "+Feed.anicry+"하고 짖는다.");
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
		System.out.println(""+Feed.name+"가 달린다.");		
	}
	@Override
	public void run() {
		System.out.println(""+Feed.name+"가 "+Feed.feed+"를 먹는다.");		
	}
	public void eat() {
		System.out.println(""+Feed.name+"가 "+Feed.anicry+"하고 운다.");
	}
}

public class _16일차_과제1AnimalMain {

	public static void main(String[] args) {
		Animal[] animal = new Animal[2] ;
		animal[0] = new Dog("치와와", "사료", "멍멍") ;		
		animal[1] = new Cat("나비", "고등어", "야옹") ;		

		for (int i = 0; i < animal.length; i++) {
			animal[i].cry();
			animal[i].run();
			animal[i].eat();//문제 : eat() 메소드를 호출하는 방법은 무엇인가요?
			//강등----------------------------요게 답이었다..= 0=
			//Feed feed = (Feed)animal[i] ;
			//feed.eat() ;
			System.out.println();
		}
		
	}
	
}