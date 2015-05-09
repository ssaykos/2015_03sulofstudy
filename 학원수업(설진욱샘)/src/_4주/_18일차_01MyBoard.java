package _4주;

import java.util.Vector;

public class _18일차_01MyBoard {

	public static void main(String[] args) {
		Vector<Boards> vec= new Vector<Boards>();//모든타입을 받을려면 대괄호 사이에 오브젝트 즉<Object>이다
		
		Boards chulsoo = new Boards(10,"AA","철수","2012/11/22",5);
		Boards jaein = new Boards(9,"BB","제인","2012/11/22",3);
		Boards hong = new Boards(8,"CC","길동","2012/11/22",8);
		
		//vec.add(100);//에러 보드 타입이 아니기 때문//제너릭 기법을 이용하였기때문이다.
		vec.add(chulsoo);vec.add(jaein);vec.add(hong);
		vec.add(new Boards(7,"DD","빅씨","2014/03/26",3));
		
		ShowData(vec);
	}

	private static void ShowData(Vector<Boards> vec) {
		System.out.println("글번호\t 제목\t 작성자\t 일자\t\t 조회수");
		for (Boards boards : vec) {
			System.out.println(boards.toString());
		}
		String imsi="글번호\t 제목\t 작성자\t 일자\t\t 조회수";
		System.out.println(imsi);
		for (Boards boards : vec) {
			imsi= boards.getNo() +"\t"+
					boards.getTitle() +"\t"+
					boards.getWriter() +"\t"+
					boards.getRegdate() +"\t"+
					boards.getReadCount() ;		
			System.out.println(imsi);		
		}		
	}	
}
class Boards{
	private int no;
	private String title;
	private String writer;
	private String regdate;
	private int readCount;
	
	public Boards(int no,String title,String writer,String regdate,int readCount){
		this.no=no;
		this.title=title;
		this.writer=writer;
		this.regdate=regdate;
		this.readCount=readCount;
	}

	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public int getReadCount() {
		return readCount;
	}
	@Override
	public String toString() {
		return this.no+"\t"+this.title+"\t"+this.writer+"\t"+this.regdate+"\t"+this.readCount;
	}
}