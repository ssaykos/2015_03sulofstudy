package _4��;

import java.util.Vector;

public class _18����_01MyBoard {

	public static void main(String[] args) {
		Vector<Boards> vec= new Vector<Boards>();//���Ÿ���� �������� ���ȣ ���̿� ������Ʈ ��<Object>�̴�
		
		Boards chulsoo = new Boards(10,"AA","ö��","2012/11/22",5);
		Boards jaein = new Boards(9,"BB","����","2012/11/22",3);
		Boards hong = new Boards(8,"CC","�浿","2012/11/22",8);
		
		//vec.add(100);//���� ���� Ÿ���� �ƴϱ� ����//���ʸ� ����� �̿��Ͽ��⶧���̴�.
		vec.add(chulsoo);vec.add(jaein);vec.add(hong);
		vec.add(new Boards(7,"DD","��","2014/03/26",3));
		
		ShowData(vec);
	}

	private static void ShowData(Vector<Boards> vec) {
		System.out.println("�۹�ȣ\t ����\t �ۼ���\t ����\t\t ��ȸ��");
		for (Boards boards : vec) {
			System.out.println(boards.toString());
		}
		String imsi="�۹�ȣ\t ����\t �ۼ���\t ����\t\t ��ȸ��";
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