package _3주;

public class _11일차_02Ans29 {

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
	
	
	//아래의 메소드를 모두 void 형으로 구현 하시오.
	public Ans29Sub()
	{
		this.setArea();//삼각형의 넓이
		this.setHypotenuse();//빗변 길이
		this.setPerimeter();//둘레 길이
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
		System.out.println("삼각형 넓이"+this.area);
		System.out.println("빗변 길이:"+this.hypotenuse);
		System.out.println("둘레길이:"+this.perimether);
	}
}