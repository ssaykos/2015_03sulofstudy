package _1��;

public class _3����_1CondOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ϵ��ڵ�: ������ ���� �������� �ʰ� , ���� �ڵ��ϴ� ���
		int result=3>2?5:3;
		System.out.println("result:"+result);//5
		
		int x=3,y=8,z=4;
		int max=3>y?x:y;
		max=max>z?max:z;
		System.out.println("max:"+max);//8
		
		//���� �����ڸ� �̿� �ּ� �� ���ϱ�
		int min=x<y?x:y;
		min=min<z?min:z;
		System.out.println("min:"+min);//3

	}

}
