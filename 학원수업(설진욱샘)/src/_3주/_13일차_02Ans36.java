package _3��;

public class _13����_02Ans36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ans39 hong = new Ans39("ȫ�浿", "M", 175.3, 95.45);
		
		Ans39 park = new Ans39("�ڿ���", "F", 162.3, 52.45 );
	}

}
class Health{
	private String name; // �̸�
	private String gender; //���� 
	private double tall; // Ű
	private double weight ; // ������

public Health() {
		
		
	}
	public Health(String _name, String _gender, double _tall, double _weight) {
		this.name=_name;
		this.gender=_gender;
		this.tall=_tall;
		this.weight=_weight;
		this.output1() ;
	}
	
	
	private void output1() {//�Էµ� ��� ���� ������ ����մϴ�.
		System.out.println("�̸�:"+this.name);
		System.out.println("����:"+this.gender);
		System.out.println("Ű:"+this.tall);
		System.out.println("������:"+this.weight);
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public double getTall() {
		return tall;
	}
	public double getWeight() {
		return weight;
	}	
	
}
class Ans39 extends Health {
	public Ans39(String name, String gender, double tall, double weight) {
		super(name,gender,tall,weight);
		this.output2(name,weight,tall,gender);
		this.calculate(tall, gender, weight);
	}
	private void output2(String name , double weight , double tall , String gender) {//����� ����մϴ�
		if(gender=="M")
		{
			System.out.println(""+name+"���� �񸸵���"+weight/(tall-100.0)*0.9);
		}
		else if(gender=="F")
		{
			System.out.println(""+name+"���� �񸸵���"+weight/(tall-100.0)*0.85);
		}
	}
	private void calculate( double tall, String gender, double weight ) {//�񸸵� ���
		//fatrate : �񸸵� ����� �� ���� ��(rate)
		
		double Std_Weight=(tall-100.0)*0.9;
		double fatrate=weight/Std_Weight*100;
		if(gender=="M"&&fatrate<=90.0)
		{
			System.out.println("��ü��");
		}
		else if(gender=="M"&&fatrate>90.0&&fatrate<=110.0)
		{
			System.out.println("���� (ǥ�� ü��)");
		}
		else if(gender=="M"&&fatrate>110.0&&fatrate<=120.0)
		{
			System.out.println("��ü��");
		}
		else if(gender=="M"&&fatrate>120.0&&fatrate<=130.0)
		{
			System.out.println("�浵��");
		}
		else if(gender=="M"&&fatrate>130.0&&fatrate<=150.0)
		{
			System.out.println("�ߵ���");
		}
		else if(gender=="M"&&fatrate<150.0)
		{
			System.out.println("����");
		}
		else if(gender=="F"&&fatrate<=90.0)
		{
			System.out.println("��ü��");
		}
		else if(gender=="F"&&fatrate>90.0&&fatrate<=110.0)
		{
			System.out.println("���� (ǥ�� ü��)");
		}
		else if(gender=="F"&&fatrate>110.0&&fatrate<=120.0)
		{
			System.out.println("��ü��");
		}
		else if(gender=="F"&&fatrate>120.0&&fatrate<=130.0)
		{
			System.out.println("�浵��");
		}
		else if(gender=="F"&&fatrate>130.0&&fatrate<=150.0)
		{
			System.out.println("�ߵ���");
		}
		else if(gender=="F"&&fatrate<150.0)
		{
			System.out.println("����");
		}
		
	}

}
/*
�̸� : ȫ�浿, ���� : ����, Ű : 175.3, ������ : 95.45
ȫ�浿���� �񸸵��� 1.408�̰�, �ߵ� ���Դϴ�.

�̸� : �ڿ���, ���� : ����, Ű : 162.3, ������ : 52.45
�ڿ������ �񸸵��� 0.990�̰�, ����(ǥ�� ü��)�Դϴ�.
*/