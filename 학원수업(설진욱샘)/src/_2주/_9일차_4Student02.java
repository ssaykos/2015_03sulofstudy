package _2주;

public class _9일차_4Student02 {

	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int result;
	private double avge;
	
	public _9일차_4Student02(String string, int i, int j, int k) {
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
		System.out.println("이름:"+this.name);
		System.out.println("국어점수:"+this.kor);
		System.out.println("영어점수:"+this.eng);
		System.out.println("수학점수:"+this.math);
		System.out.println("총점:"+this.result);
		System.out.println("평균:"+this.avge);
	}
	
}
