package _4��;
/*package _4_��;

interface Calculate{
	void calc(); //�޿� ���
}
interface Output{
	void out(); //���
}
class MySalary{
	static double incentive = 0.5 ; //�μ�Ƽ�� : �ʱⰪ(0.5)
	static int count ; //���ο� - �ʱⰪ(0)

	String name ; //�̸�
	double pay ; //�޿�
	int family ; //���� ��
	double family_p ; //���� ����
	int overtime ; //�ð� �� �ٹ�	
	double overtime_p ; //�ð� �� ����
	double tax ; //���� 
	double incen_p ; //������
	double total_pay ; //	�� ���ɾ�
	
	public MySalary(String name, int pay, int family, int overtime) {
		this.name = name ;
		this.pay = pay ;
		this.family = family ;
		this.overtime = overtime ;
		++count ;
	}	
}
public class _16����_����2�� extends MySalary implements Output, Calculate {
	public _16����_����2��(String name, int pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}
	public static void main(String[] args) {
		_16����_����2��[] pt = new _16����_����2��[3];
		
		pt[0] = new _16����_����2��("�Ҽ���", 750000, 2, 3 ) ;
		pt[1] = new _16����_����2��("���ָ�", 800000, 1, 4 ) ;
		pt[2] = new _16����_����2��("���ȸ�", 650000, 6, 2 ) ;

		MySalary.incentive = 0.7 ;
		
		String imsi = "�̸�\t�⺻��\t\t������\t��������\t�ð��ܱٹ�";
		imsi += "\t�ð��ܼ���\t����\t�μ�Ƽ��\t������\t\t�Ǽ��ɾ�" ;
		System.out.println( imsi );
		for (int i = 0; i < pt.length; i++) {
			pt[i].calc(); 
			pt[i].out(); 
		}
	}
	@Override
	public void calc() {		
		super.family_p = super.family < 3 ? super.family * 20000 : 60000 ;//���� ����		
		super.overtime_p = super.overtime * 5000 ;//�ð� �� ����
		super.tax = 0.1 * super.pay ; //����
		super.incen_p = super.pay * super.incentive ; //������
		super.total_pay = 
			super.pay + super.family_p + super.incen_p + 
			super.overtime_p - super.tax ; //�� ���ɾ�
	}
	
	@Override
	public void out() {
		String imsi = "" ; 
		imsi += super.name + "\t"  ;		
		imsi += super.pay + "\t"  ;//�⺻��
		imsi += super.family + "\t"  ;//������
		imsi += super.family_p + "\t"  ;//��������
		imsi += super.overtime + "\t"  ;//�ð��ܱٹ�
		imsi += super.overtime_p + "\t"  ;//�ð��ܼ���
		imsi += super.tax + "\t"  ;//����
		imsi += super.incentive + "\t"  ;//�μ�Ƽ��
		imsi += super.incen_p + "\t"  ;//������
		imsi += super.total_pay  ;//�Ǽ��ɾ�
		System.out.println( imsi );
	}
}*/