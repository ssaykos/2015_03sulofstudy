package _3주;

import java.security.CryptoPrimitive;

public class _14일차_01Ref01 {

	public static void main(String[] args) {
		double d=100;
		System.out.println(d);
		//슈퍼클래스 이름 레퍼런스변수=new 서브클래스 이름();
		Animal animal = new DogSub();//암시적 형변환 발생
		
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
		
		//다음문장을 실행하면 야옹이라고 출력되게 하세용.
		//System.out.println(myani[1]);
		System.out.println(myani[1].toString());
		
		
	}

	private static void print(double d) {
		int i=(int)d;
		System.out.println(i);
	}

	private static void showData(Animal animal) {
		DogSub mydog=(DogSub)animal;//강등
		System.out.println(mydog.x);
		System.out.println(mydog.y);
	}
}
class Animal{
	int x= 100;
	public void cry(){
		System.out.println("애니멀 슈퍼클래스");
		System.out.println("동물이 소리낸다");
	}

}
class DogSub extends Animal{
	int y=200;
	public void cry(){
		System.out.println("강아지가 짖는당");
		System.out.println("멍멍");
	}
}
class CatSub extends Animal{
	int z=300;
	public void cry(){
		System.out.println("꼬양이가 운당");
		System.out.println("야옹");
	}
	@Override
	public String toString() {
		return "야옹";
	}
}