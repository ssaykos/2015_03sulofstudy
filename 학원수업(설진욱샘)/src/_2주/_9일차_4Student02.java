package _2��;

public class _9����_4Student02 {

	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int result;
	private double avge;
	
	public _9����_4Student02(String string, int i, int j, int k) {
		// TODO Auto-generated constructor stub
	this.name=string;
	this.kor=i;
	this.eng=j;
	this.math=k;
	this.result=i+j+k;
	this.avge=(double)(i+j+k)/3;
	}
	public void Display()
	{
		System.out.println("�̸�:"+this.name);
		System.out.println("��������:"+this.kor);
		System.out.println("��������:"+this.eng);
		System.out.println("��������:"+this.math);
		System.out.println("����:"+this.result);
		System.out.println("���:"+this.avge);
	}
	
}
