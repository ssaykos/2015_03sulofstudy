package _3��;

public class _11����_02Ans29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ans29Sub obj = new Ans29Sub();
		obj.Display();
	}

}
class Ans29Sub
{
	private double width= 5.0;
	private double height = 3.5;
	
	private double area;
	private double hypotenuse;
	private double perimether;
	
	
	//�Ʒ��� �޼ҵ带 ��� void ������ ���� �Ͻÿ�.
	public Ans29Sub()
	{
		this.setArea();//�ﰢ���� ����
		this.setHypotenuse();//���� ����
		this.setPerimeter();//�ѷ� ����
	}

	private void setPerimeter() {
		// TODO Auto-generated method stub
		//this.setHypotenuse();
		this.perimether=width+height+hypotenuse;
		
	}

	private void setHypotenuse() {
		// TODO Auto-generated method stub
		this.hypotenuse=Math.sqrt(width*width+height*height);
		
	}

	private void setArea() {
		// TODO Auto-generated method stub
		this.area=this.width*this.height/2;
		
	}
	public void Display()
	{
		System.out.println("�ﰢ�� ����"+this.area);
		System.out.println("���� ����:"+this.hypotenuse);
		System.out.println("�ѷ�����:"+this.perimether);
	}
}