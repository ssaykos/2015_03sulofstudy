package _3주;

class Sports{
	private String sports_name;
	private int sports_peaple_number;
	
	public Sports(String sports_name, int sports_peaple_number){
		this.sports_name = sports_name;
		this.sports_peaple_number=sports_peaple_number;
	}
	public final void play() {
		System.out.println("야구 게임을 합니다.");
		//System.out.println(this.sports_name+" 게임을 합니다");
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
		System.out.println("게임종목:"+super.getSports_name());
		System.out.println("게임인원:"+super.getSports_peaple_number());
		System.out.println("타    율:"+d);
	}
	
}
class Football extends  Sports{

	private int j;
	public Football(String sports_name,int sports_peaple_number, int j) {
		super(sports_name, sports_peaple_number);
		this.j=j;
	}

	public void show() {
		System.out.println("종    목:"+super.getSports_name());
		System.out.println("게임인원:"+super.getSports_peaple_number());
		System.out.println("골    수:"+this.j);
	}
	@Override
	public String toString() {
		return "축구는 재밋어";
	}
}
public class _15일차_03SportsTest {
	public static void main(String[] args) {
		Baseball baseball  = new Baseball( "야구", 9, 0.235 ) ;
		baseball.play() ;
		baseball.display() ;
		
		Football soccer  = new Football( "축구", 11, 5 ) ;
		soccer.show() ;
		
		System.out.println( soccer );
	}
}