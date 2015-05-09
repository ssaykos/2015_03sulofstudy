package _4주;
/*package _4_주;

interface Animal{
	public abstract void cry(); //울기(짖기)
	public abstract void run(); //달리기
}
abstract class Feed implements Animal{
	String name = "동물"; //동물 이름
	String feed = "사료" ; //사료
	String anicry = "울기"; //짖는 방법
	
	public abstract void eat(); //추상 메소드 먹기 
	
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
		System.out.println(super.name + "(이)가 " + super.anicry  + "하고 짖는다.");
	}
	@Override
	public void run() {
		System.out.println(super.name + "(이)가 달린다.");
	}
	@Override
	public void eat() {		
		System.out.println(super.name + "(이)가 " + super.feed  + "를 먹는다.");
	}
}
class Cat extends Feed{
	public Cat() { }
	public Cat(String name, String feed, String anicry) {
		super(name, feed, anicry) ;
	}
	@Override
	public void cry() {		
		System.out.println(super.name + "(이)가 " + super.anicry  + "하고 짖는다.");
	}
	@Override
	public void run() {
		System.out.println(super.name + "(이)가 달린다.");		
	}
	@Override
	public void eat() {
		System.out.println(super.name + "(이)가 " + super.feed  + "를 먹는다.");
	}	
}
public class _16일차_과제1답{
	public static void main(String[] args) {
		Animal[] animal = new Animal[2] ;
		animal[0] = new Dog("치와와", "사료", "멍멍") ;		
		animal[1] = new Cat("나비", "고등어", "야옹") ;
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].cry() ;
			animal[i].run() ;
			
			//강등
			Feed feed = (Feed)animal[i] ;
			feed.eat() ;
		}
		
		//배열 초기화 기법
		Animal[] myani = { 
					new Dog("강아지1", "먹이1", "멍멍1"),
					new Cat("고양이1", "먹이2", "야옹1"),
					new Dog()
				} ;
		
		for (int i = 0; i < myani.length; i++) {
			myani[i].cry() ;
			myani[i].run() ;			
			//강등
			Feed feed = (Feed)myani[i] ;
			feed.eat() ;
		}		
	}
}*/