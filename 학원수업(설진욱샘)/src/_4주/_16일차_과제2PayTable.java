package _4��;
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
	double total_pay ; //�� ���ɾ�
	public MySalary(String name, int pay, int family, int overtime){
		this.name=name;
		this.pay=pay;
		this.family=family;
		this.overtime=overtime;
	}
}
public class _16����_����2PayTable extends MySalary implements Output,Calculate{
	
	public _16����_����2PayTable(String name, int pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}
	public static void main(String[] args) {
		_16����_����2PayTable[] pt = new _16����_����2PayTable[3];
		//									�̸�    �⺻��	������	�߱�
		pt[0] = new _16����_����2PayTable("�Ҽ���", 750000, 	2,	3 ) ;
		pt[1] = new _16����_����2PayTable("���ָ�", 800000, 	1,	4 ) ;
		pt[2] = new _16����_����2PayTable("���ȸ�", 650000, 	6,	2 ) ;

		MySalary.incentive = 0.7 ;
		
		for (int i = 0; i < pt.length; i++) {
			pt[i].calc(); 
			pt[i].out(); 
		}
	}

	@Override
	public void calc() {
		if(super.family<3){
			super.family_p=(double)super.family*20000;	
		}else{
			super.family_p=(double)60000;
		}
		super.overtime_p=super.overtime*5000;
		super.tax=super.pay*0.1;
		super.incen_p=super.incentive*super.pay;
		super.total_pay=super.pay+super.family_p+super.incen_p+super.overtime_p-super.tax;

	}

	@Override
	public void out() {
		System.out.println("�̸�:"+super.name+"\t�⺻��:"+super.pay+"��");
		System.out.println();
		System.out.println("������:"+super.family+"��\t��������:"+super.family_p+"��");
		System.out.println();
		System.out.println("�ð��ܱٹ�:�Ϸ����"+super.overtime+"�ð�\t�ð��ܼ���:"+super.family_p+"��\t����:"+super.tax+"��\t�μ�Ƽ��:"+(super.incentive*100)+"%");
		System.out.println();
		System.out.println("������:"+super.incen_p+"��\t�Ǽ��ɾ�:"+super.total_pay+"��");
		System.out.println();
		System.out.println();
	}
}