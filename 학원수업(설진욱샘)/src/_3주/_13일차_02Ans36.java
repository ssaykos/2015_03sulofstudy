package _3주;

public class _13일차_02Ans36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ans39 hong = new Ans39("홍길동", "M", 175.3, 95.45);
		
		Ans39 park = new Ans39("박영희", "F", 162.3, 52.45 );
	}

}
class Health{
	private String name; // 이름
	private String gender; //성별 
	private double tall; // 키
	private double weight ; // 몸무게

public Health() {
		
		
	}
	public Health(String _name, String _gender, double _tall, double _weight) {
		this.name=_name;
		this.gender=_gender;
		this.tall=_tall;
		this.weight=_weight;
		this.output1() ;
	}
	
	
	private void output1() {//입력된 멤버 변수 정보를 출력합니다.
		System.out.println("이름:"+this.name);
		System.out.println("성별:"+this.gender);
		System.out.println("키:"+this.tall);
		System.out.println("몸무게:"+this.weight);
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public double getTall() {
		return tall;
	}
	public double getWeight() {
		return weight;
	}	
	
}
class Ans39 extends Health {
	public Ans39(String name, String gender, double tall, double weight) {
		super(name,gender,tall,weight);
		this.output2(name,weight,tall,gender);
		this.calculate(tall, gender, weight);
	}
	private void output2(String name , double weight , double tall , String gender) {//결과를 출력합니다
		if(gender=="M")
		{
			System.out.println(""+name+"님은 비만도가"+weight/(tall-100.0)*0.9);
		}
		else if(gender=="F")
		{
			System.out.println(""+name+"님은 비만도가"+weight/(tall-100.0)*0.85);
		}
	}
	private void calculate( double tall, String gender, double weight ) {//비만도 계산
		//fatrate : 비만도 사용할 때 쓰는 율(rate)
		
		double Std_Weight=(tall-100.0)*0.9;
		double fatrate=weight/Std_Weight*100;
		if(gender=="M"&&fatrate<=90.0)
		{
			System.out.println("저체중");
		}
		else if(gender=="M"&&fatrate>90.0&&fatrate<=110.0)
		{
			System.out.println("정상 (표준 체중)");
		}
		else if(gender=="M"&&fatrate>110.0&&fatrate<=120.0)
		{
			System.out.println("과체중");
		}
		else if(gender=="M"&&fatrate>120.0&&fatrate<=130.0)
		{
			System.out.println("경도비만");
		}
		else if(gender=="M"&&fatrate>130.0&&fatrate<=150.0)
		{
			System.out.println("중도비만");
		}
		else if(gender=="M"&&fatrate<150.0)
		{
			System.out.println("고도비만");
		}
		else if(gender=="F"&&fatrate<=90.0)
		{
			System.out.println("저체중");
		}
		else if(gender=="F"&&fatrate>90.0&&fatrate<=110.0)
		{
			System.out.println("정상 (표준 체중)");
		}
		else if(gender=="F"&&fatrate>110.0&&fatrate<=120.0)
		{
			System.out.println("과체중");
		}
		else if(gender=="F"&&fatrate>120.0&&fatrate<=130.0)
		{
			System.out.println("경도비만");
		}
		else if(gender=="F"&&fatrate>130.0&&fatrate<=150.0)
		{
			System.out.println("중도비만");
		}
		else if(gender=="F"&&fatrate<150.0)
		{
			System.out.println("고도비만");
		}
		
	}

}
/*
이름 : 홍길동, 성별 : 남자, 키 : 175.3, 몸무게 : 95.45
홍길동님은 비만도가 1.408이고, 중도 비만입니다.

이름 : 박영희, 성별 : 여자, 키 : 162.3, 몸무게 : 52.45
박영희님은 비만도가 0.990이고, 정상(표준 체중)입니다.
*/