package _2��;
public class Ans30 {
	public static void main(String[] args) {
		Ans30 obj = new Ans30() ;
		
		//�޼ҵ� �����ε�
		obj.area( 10 ) ;
		obj.area( 5, 10 ) ;
		obj.area( 5, 15, 10 ) ;
	}
	private void area(int top, int bottom, int width) {
		//��ٸ����� ���� ���ϱ�
		double area = (double)( top + bottom ) * width / 2.0 ;
		System.out.println("��ٸ����� ���� : " + area);
	}
	private void area(int width, int height) {
		//�簢���� ���� ���ϱ�
		int area = ( width * height )  ;
		System.out.println("�簢���� ���� : " + area);		
	}
	private void area(int radius) {
		//���� ���� ���ϱ�
		final double PI = 3.14 ; //�б� �����̾�� �ϹǷ� final Ű���带 ����ߴ�.
		double area = PI * ( radius * radius )  ;
		System.out.println("���� ���� : " + area);	
	}
}