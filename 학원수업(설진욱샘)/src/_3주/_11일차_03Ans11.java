package _3주;
import java.util.Scanner;
public class _11일차_03Ans11 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ans11Sub obj=new Ans11Sub();
		
	}

}
class Ans11Sub
{
	private int finalexam;
	private int midexam;
	private int report;
	private int attendance;
	private double resultpoint;
	private String subjectpoint;
	private String comment;
	
	public Ans11Sub(){
		this.InputData();
		this.CalcSungguk();
		this.getSubjectpoint();
		this.Display();
	}
	public void InputData()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("중간고사:");
		this.midexam=scan.nextInt();
		System.out.print("기말고사:");
		this.finalexam=scan.nextInt();
		System.out.print("레포트:");
		this.report=scan.nextInt();
		System.out.print("출석:");
		this.attendance=scan.nextInt();
	}
	public void CalcSungguk(){
		this.resultpoint=this.midexam*0.3+this.finalexam*0.3+this.attendance*0.2+this.report*0.2;
	}
	public void getSubjectpoint(){
		if(this.resultpoint>=90.0){
			this.subjectpoint="A";
			this.comment="excellent";
		}else if(this.resultpoint>=80.0){
			this.subjectpoint="B";
			this.comment="excellent";
		}else if(this.resultpoint>=70.0){
			this.subjectpoint="C";
			this.comment="good";
		}else if(this.resultpoint>=60.0){
			this.subjectpoint="D";
			this.comment="good";
		}else{
			this.subjectpoint="F";
			this.comment="pool";
		}
	}
	public void Display(){
		System.out.println("성적="+this.resultpoint+"\n학점="+this.subjectpoint+"\n평가="+this.comment);
	}
	
	
}

