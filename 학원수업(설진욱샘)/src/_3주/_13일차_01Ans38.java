package _3��;

import java.util.Scanner;
class Book{//�Ǹ�
	private String article ; //ǰ��
	private int qty ; //����
	private int cost ; //�ܰ�
	static int totalcnt = 0 ; //�� ���� �Ǹ� ���
	static double discount = 0.0 ; //������	
	static int count = 0 ; //��ǰ �׸�� 	
	public Book() {//ǰ��, ����, �ܰ��� �Է� �ޱ�
		
		//System.out.println("�θ� ������");
		Scanner scan = new Scanner(System.in) ;		
		
		System.out.println("ǰ��:");
		this.article=scan.next();
		System.out.println("����:");
		this.qty=scan.nextInt();
		this.totalcnt+=qty;
		System.out.println("�ܰ�:");
		this.cost=scan.nextInt();	
		//scan.close() ; //�ּ� Ǯ�� ������
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQty() {
		return qty;
	}
	public int getCost() {
		return cost;
	}
	public String getArticle() {
		return article;
	}
}
class Sales extends Book{
	private double amount = 0 ; //�ݾ�
	public Sales() {
		super();
		this.setProcess();
	}
	
	public void setProcess() {
		//�ݾ� ��� = ���� * �ܰ� * ������
		
		this.amount=super.getQty()*super.getCost()*(1-super.discount);
	}
	public void Display() {//������� ����ϱ� 
	System.out.println(""+super.getArticle()+":"+this.amount);	
	}
}
public class _13����_01Ans38 {
	public static void main(String[] args) {
		Sales[] myBook = new Sales[2] ;		
		Book.discount = 0.15 ;		
		for (int i = 0; i < myBook.length; i++) {
			myBook[i] = new Sales() ;			
		}		
		System.out.println("�� �Ǹ� �Ǽ� : " + Book.totalcnt);
		
		for (int i = 0; i < myBook.length; i++) {
			System.out.println(""+(i+1)+"��° ǰ��");
			myBook[i].Display() ;
		}
	}
}
/*

ǰ�� : �ڹ�
���� : 2
�ܰ� : 30000
ǰ�� : JSP
���� : 4
�ܰ� : 20000
�� �Ǹ� ��� : 6
1��° ǰ��
�ڹ� : 51000.0��
2��° ǰ��
JSP : 68000.0��

 */