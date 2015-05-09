package _4주;

public class _16일차_01ShapeMain {

	public static void main(String[] args) {
		Circle circle = new Circle( 10.0 ) ; //반지름
		System.out.println( circle );
		
		Rectangle rectangle = new Rectangle( 10.0, 10.0 ) ;  
		System.out.println( rectangle ); 
		
		Triangle triangle = new Triangle( 10.0, 10.0 ) ;  
		System.out.println( triangle );	
		
		//Shape shape = new Shape();
		//추상 클래스는 인스턴스 생성능력이 없으므로 뉴연산자가 안먹힌다. 고로 추상클레스는 객체생성 불가
		Shape shape = new Shape() {
			
			@Override
			public void calcArea() {
				System.out.println("하하하");
			}
		};//여러번 사용 객체
		for (int i = 0; i < 2; i++) {
			shape.calcArea();
		}
		new Shape() {
			
			@Override
			public void calcArea() {
				System.out.println("머엉");
			}
		}.calcArea();//일회용 객체
		
		Shape[] myshape = new Shape[3];
		myshape[0]= new Circle(5.0);
		myshape[1]= new Rectangle(5.0,5.0);
		myshape[2]= new Triangle(5.0,5.0);//추상클래스의 형변환
		for (int i = 0; i < myshape.length; i++) {
			System.out.println(myshape[i].toString());
		}
	}
}
class Rectangle extends Shape{
	private double width ; //밑변
	private double height ; //높이	
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
		this.calcArea();
	}
	public void calcArea() {
		super.area=width*height;
	}
	public String toString() {//현재서브클래스인 서클에도 없고 슈퍼인 셉프에도 없어서 오브젝트에 잇는것을 오버라이딩 한것이다.
		return "사각형"+super.toString();
	}
}

class Triangle extends Shape{
	private double width ; //밑변
	private double height ; //높이	
	public Triangle(double width,double height) {
		this.width=width;
		this.height=height;
		this.calcArea();
	}
	public void calcArea() {
		super.area=width*height/2;
	}
	public String toString() {//현재서브클래스인 서클에도 없고 슈퍼인 셉프에도 없어서 오브젝트에 잇는것을 오버라이딩 한것이다.
		return "삼각형"+super.toString();
	}
}

abstract class Shape{
	double area; 	
	public abstract void calcArea();
	@Override
	public String toString() {//현재서브클래스인 서클에도 없고 슈퍼인 셉프에도 없어서 오브젝트에 잇는것을 오버라이딩 한것이다.
		return "의면적:"+this.area+"입니다.";
	}
}

class Circle extends Shape{
	private double radius ;
	public Circle(double radius){
		this.radius=radius;
		this.calcArea();
	}
	@Override
	public String toString() {//현재서브클래스인 서클에도 없고 슈퍼인 셉프에도 없어서 오브젝트에 잇는것을 오버라이딩 한것이다.
		return "원"+super.toString();
	}
	@Override
	public void calcArea() {
		super.area=Math.PI*Math.pow(this.radius, 2.0);
	}	
}
	