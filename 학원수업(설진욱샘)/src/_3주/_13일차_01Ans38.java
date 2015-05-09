package _3주;

import java.util.Scanner;
class Book{//판매
	private String article ; //품목
	private int qty ; //수량
	private int cost ; //단가
	static int totalcnt = 0 ; //총 누적 판매 대수
	static double discount = 0.0 ; //할인율	
	static int count = 0 ; //물품 항목수 	
	public Book() {//품목, 수량, 단가를 입력 받기
		
		//System.out.println("부모 생성자");
		Scanner scan = new Scanner(System.in) ;		
		
		System.out.println("품목:");
		this.article=scan.next();
		System.out.println("수량:");
		this.qty=scan.nextInt();
		this.totalcnt+=qty;
		System.out.println("단가:");
		this.cost=scan.nextInt();	
		//scan.close() ; //주석 풀지 마세요
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
	private double amount = 0 ; //금액
	public Sales() {
		super();
		this.setProcess();
	}
	
	public void setProcess() {
		//금액 계산 = 수량 * 단가 * 할인율
		
		this.amount=super.getQty()*super.getCost()*(1-super.discount);
	}
	public void Display() {//결과물을 출력하기 
	System.out.println(""+super.getArticle()+":"+this.amount);	
	}
}
public class _13일차_01Ans38 {
	public static void main(String[] args) {
		Sales[] myBook = new Sales[2] ;		
		Book.discount = 0.15 ;		
		for (int i = 0; i < myBook.length; i++) {
			myBook[i] = new Sales() ;			
		}		
		System.out.println("총 판매 권수 : " + Book.totalcnt);
		
		for (int i = 0; i < myBook.length; i++) {
			System.out.println(""+(i+1)+"번째 품목");
			myBook[i].Display() ;
		}
	}
}
/*

품목 : 자바
수량 : 2
단가 : 30000
품목 : JSP
수량 : 4
단가 : 20000
총 판매 댓수 : 6
1번째 품목
자바 : 51000.0원
2번째 품목
JSP : 68000.0원

 */