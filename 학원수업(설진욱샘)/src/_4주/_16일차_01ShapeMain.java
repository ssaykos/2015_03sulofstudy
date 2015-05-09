package _4��;

public class _16����_01ShapeMain {

	public static void main(String[] args) {
		Circle circle = new Circle( 10.0 ) ; //������
		System.out.println( circle );
		
		Rectangle rectangle = new Rectangle( 10.0, 10.0 ) ;  
		System.out.println( rectangle ); 
		
		Triangle triangle = new Triangle( 10.0, 10.0 ) ;  
		System.out.println( triangle );	
		
		//Shape shape = new Shape();
		//�߻� Ŭ������ �ν��Ͻ� �����ɷ��� �����Ƿ� �������ڰ� �ȸ�����. ��� �߻�Ŭ������ ��ü���� �Ұ�
		Shape shape = new Shape() {
			
			@Override
			public void calcArea() {
				System.out.println("������");
			}
		};//������ ��� ��ü
		for (int i = 0; i < 2; i++) {
			shape.calcArea();
		}
		new Shape() {
			
			@Override
			public void calcArea() {
				System.out.println("�Ӿ�");
			}
		}.calcArea();//��ȸ�� ��ü
		
		Shape[] myshape = new Shape[3];
		myshape[0]= new Circle(5.0);
		myshape[1]= new Rectangle(5.0,5.0);
		myshape[2]= new Triangle(5.0,5.0);//�߻�Ŭ������ ����ȯ
		for (int i = 0; i < myshape.length; i++) {
			System.out.println(myshape[i].toString());
		}
	}
}
class Rectangle extends Shape{
	private double width ; //�غ�
	private double height ; //����	
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
		this.calcArea();
	}
	public void calcArea() {
		super.area=width*height;
	}
	public String toString() {//���缭��Ŭ������ ��Ŭ���� ���� ������ �������� ��� ������Ʈ�� �մ°��� �������̵� �Ѱ��̴�.
		return "�簢��"+super.toString();
	}
}

class Triangle extends Shape{
	private double width ; //�غ�
	private double height ; //����	
	public Triangle(double width,double height) {
		this.width=width;
		this.height=height;
		this.calcArea();
	}
	public void calcArea() {
		super.area=width*height/2;
	}
	public String toString() {//���缭��Ŭ������ ��Ŭ���� ���� ������ �������� ��� ������Ʈ�� �մ°��� �������̵� �Ѱ��̴�.
		return "�ﰢ��"+super.toString();
	}
}

abstract class Shape{
	double area; 	
	public abstract void calcArea();
	@Override
	public String toString() {//���缭��Ŭ������ ��Ŭ���� ���� ������ �������� ��� ������Ʈ�� �մ°��� �������̵� �Ѱ��̴�.
		return "�Ǹ���:"+this.area+"�Դϴ�.";
	}
}

class Circle extends Shape{
	private double radius ;
	public Circle(double radius){
		this.radius=radius;
		this.calcArea();
	}
	@Override
	public String toString() {//���缭��Ŭ������ ��Ŭ���� ���� ������ �������� ��� ������Ʈ�� �մ°��� �������̵� �Ѱ��̴�.
		return "��"+super.toString();
	}
	@Override
	public void calcArea() {
		super.area=Math.PI*Math.pow(this.radius, 2.0);
	}	
}
	