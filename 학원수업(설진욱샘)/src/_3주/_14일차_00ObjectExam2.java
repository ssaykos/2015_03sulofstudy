package _3주;

class Groups{   // class Groups 라는 슈퍼 클래스는 extends Object 라는 매인의 서브클래스이기도 한 것을 숨기고 있다. 
	private String name;
	private String sing;
	public Groups(String name, String sing){
		this.name=name;
		this.sing=sing;
	}
	@Override
		public boolean equals(Object obj) {
		//형변환 배우고 나서 다시 코딩 예정
		Groups sosy2=(Groups)obj;
		boolean bool = this.name.equals(sosy2.name)&&this.sing.equals(sosy2.sing);
		return bool;
		}
	
	@Override
		public String toString() {
			return "이름:"+this.name+"\n노래:"+this.sing+"\n";
		}
}
class Sosy extends Groups{
	public Sosy(String name, String sing){
		super(name,sing);
	}
	public String toString() {
		return "하하하"+super.toString();
	}
}
class Exid extends Groups{
	public Exid(String name, String sing){
		super(name,sing);
	}
	@Override
	public String toString() {
		return "호호호"+super.toString();
	}
	
}
public class _14일차_00ObjectExam2 {

	public static void main(String[] args) {
		Sosy sosy=new Sosy("소녀시대","Gee");
		Sosy sosy2=new Sosy("소녀시대","Gee");
		
		if(sosy.equals(sosy2)){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		Exid exid=new Exid("exit","위아래");//암시적으로 tostring 메소드 하이딩
		
		System.out.println(sosy);
		System.out.println(exid.toString());
	}

}

/*
 * Object 최상위 클래스 		있다
 * Groups(슈퍼 그리고 서브)	있다
 * sosy(서브)				없다->있다
 * Exid(서브)				없다
 */
