package _2주;

public class _10일차_2Education {

	private String name ; //수강생
	private String subject ; //수강 과목
	private double fay ;//교육비
	private double result = 0.0 ; //환급금
	private int day;
	private final String sosok = "IT 교육 센터" ;	
	private final double add_refund = 3000.0 ; //추가 환급금	
	private final double add_refund2 = 1000.0;
	
	private void calcfay()
	{
		if(this.subject.equalsIgnoreCase("JAVA"))
		{
			this.result=this.fay*0.25+this.add_refund;
		}
		else if(this.subject.equalsIgnoreCase("JDBC"))
		{
			this.result=this.fay*0.20+this.add_refund;
		}
		else if(this.subject.equalsIgnoreCase("JSP"))
		{
			this.result=this.fay*0.15+this.add_refund;
		}
		
	}
	private void daycalcfay()
	{
		if(this.day>=80)
		{
			if(this.subject.equalsIgnoreCase("JAVA"))
			{
				this.result=this.fay*0.25+this.add_refund;
			}
			else if(this.subject.equalsIgnoreCase("JDBC"))
			{
				this.result=this.fay*0.20+this.add_refund;
			}
			else if(this.subject.equalsIgnoreCase("JSP"))
			{
				this.result=this.fay*0.15+this.add_refund;
			}
		}
		else
		{
			if(this.subject.equalsIgnoreCase("JAVA"))
			{
				this.result=this.fay*0.25+this.add_refund2;
			}
			else if(this.subject.equalsIgnoreCase("JDBC"))
			{
				this.result=this.fay*0.20+this.add_refund2;
			}
			else if(this.subject.equalsIgnoreCase("JSP"))
			{
				this.result=this.fay*0.15+this.add_refund2;
			}
		}
	}
	public _10일차_2Education (String name, String subject, double fay)
	{
		this.name=name;
		this.subject=subject;
		this.fay=fay;
		this.calcfay();
	}
	public _10일차_2Education (String name, String subject, double fay, int day)
	{
		this.name=name;
		this.subject=subject;
		this.fay=fay;
		this.day=day;
		this.daycalcfay();
	}
	public void Display() { //결과물을 출력한다.		
		System.out.println("수강생 : " +  this.name);
		System.out.println("교육 센터 : " +  this.sosok);
		System.out.println("수강 과목 : " +  this.subject);
		System.out.println("교육비 : " +  this.fay);
		System.out.println("환급금 : " +  this.result);
	}
}
