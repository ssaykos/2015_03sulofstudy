package _2��;

public class _10����_2Education {

	private String name ; //������
	private String subject ; //���� ����
	private double fay ;//������
	private double result = 0.0 ; //ȯ�ޱ�
	private int day;
	private final String sosok = "IT ���� ����" ;	
	private final double add_refund = 3000.0 ; //�߰� ȯ�ޱ�	
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
	public _10����_2Education (String name, String subject, double fay)
	{
		this.name=name;
		this.subject=subject;
		this.fay=fay;
		this.calcfay();
	}
	public _10����_2Education (String name, String subject, double fay, int day)
	{
		this.name=name;
		this.subject=subject;
		this.fay=fay;
		this.day=day;
		this.daycalcfay();
	}
	public void Display() { //������� ����Ѵ�.		
		System.out.println("������ : " +  this.name);
		System.out.println("���� ���� : " +  this.sosok);
		System.out.println("���� ���� : " +  this.subject);
		System.out.println("������ : " +  this.fay);
		System.out.println("ȯ�ޱ� : " +  this.result);
	}
}
