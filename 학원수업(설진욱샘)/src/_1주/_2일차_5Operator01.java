package _1��;

public class _2����_5Operator01 {

	public static void main(String[] args) {
		int a=10,b=8;
		boolean bool1,bool2,bool3,bool4,bool5;
		
		bool1=a!=b;//����(10) �� ��(8) �� ���� �ʴ� [(��)]
		bool2=--a==b++;//����-1(9) �� ��(8)�� ����[(����)]�׸��� �� +1 �Ѵ�
		bool3=a++!=--b;//����(9)�� ��(8)�� ���� �ʴ�[(��)] �׸��� ���̸� +1 �Ѵ�
		bool4=bool3&&(5>7);//(��)and(&&,������,and����) 5�� 7���� ũ��(����) [(����)]
		bool5= !bool4||(bool1&&bool2);//(��)or(||,������,or����){(��)and(&&,������,and����)(����)}[(��)]
		
		System.out.println("bool1:"+bool1);
		System.out.println("bool2:"+bool2);
		System.out.println("bool3:"+bool3);
		System.out.println("bool4:"+bool4);
		System.out.println("bool5:"+bool5);

	}

}
