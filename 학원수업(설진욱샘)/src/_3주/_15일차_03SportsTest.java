package _3��;

class Sports{
	private String sports_name;
	private int sports_peaple_number;
	
	public Sports(String sports_name, int sports_peaple_number){
		this.sports_name = sports_name;
		this.sports_peaple_number=sports_peaple_number;
	}
	public final void play() {
		System.out.println("�߱� ������ �մϴ�.");
		//System.out.println(this.sports_name+" ������ �մϴ�");
	}
	public String getSports_name() {
		return sports_name;
	}
	public int getSports_peaple_number() {
		return sports_peaple_number;
	}
	public void show(){
	}
	
}
class Baseball extends Sports{

	private double d;
	public Baseball(String sports_name,int sports_peaple_number, double d) {
		super(sports_name, sports_peaple_number);
		this.d=d;
	}
	public void display() {
		System.out.println("��������:"+super.getSports_name());
		System.out.println("�����ο�:"+super.getSports_peaple_number());
		System.out.println("Ÿ    ��:"+d);
	}
	
}
class Football extends  Sports{

	private int j;
	public Football(String sports_name,int sports_peaple_number, int j) {
		super(sports_name, sports_peaple_number);
		this.j=j;
	}

	public void show() {
		System.out.println("��    ��:"+super.getSports_name());
		System.out.println("�����ο�:"+super.getSports_peaple_number());
		System.out.println("��    ��:"+this.j);
	}
	@Override
	public String toString() {
		return "�౸�� ��Ծ�";
	}
}
public class _15����_03SportsTest {
	public static void main(String[] args) {
		Baseball baseball  = new Baseball( "�߱�", 9, 0.235 ) ;
		baseball.play() ;
		baseball.display() ;
		
		Football soccer  = new Football( "�౸", 11, 5 ) ;
		soccer.show() ;
		
		System.out.println( soccer );
	}
}