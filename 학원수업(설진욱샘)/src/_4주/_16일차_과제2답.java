package _4주;
/*package _4_주;

interface Calculate{
	void calc(); //급여 계산
}
interface Output{
	void out(); //출력
}
class MySalary{
	static double incentive = 0.5 ; //인센티브 : 초기값(0.5)
	static int count ; //총인원 - 초기값(0)

	String name ; //이름
	double pay ; //급여
	int family ; //가족 수
	double family_p ; //가족 수당
	int overtime ; //시간 외 근무	
	double overtime_p ; //시간 외 수당
	double tax ; //세금 
	double incen_p ; //성과금
	double total_pay ; //	실 수령액
	
	public MySalary(String name, int pay, int family, int overtime) {
		this.name = name ;
		this.pay = pay ;
		this.family = family ;
		this.overtime = overtime ;
		++count ;
	}	
}
public class _16일차_과제2답 extends MySalary implements Output, Calculate {
	public _16일차_과제2답(String name, int pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}
	public static void main(String[] args) {
		_16일차_과제2답[] pt = new _16일차_과제2답[3];
		
		pt[0] = new _16일차_과제2답("소서노", 750000, 2, 3 ) ;
		pt[1] = new _16일차_과제2답("고주몽", 800000, 1, 4 ) ;
		pt[2] = new _16일차_과제2답("모팔모", 650000, 6, 2 ) ;

		MySalary.incentive = 0.7 ;
		
		String imsi = "이름\t기본급\t\t가족수\t가족수당\t시간외근무";
		imsi += "\t시간외수당\t세금\t인센티브\t성과금\t\t실수령액" ;
		System.out.println( imsi );
		for (int i = 0; i < pt.length; i++) {
			pt[i].calc(); 
			pt[i].out(); 
		}
	}
	@Override
	public void calc() {		
		super.family_p = super.family < 3 ? super.family * 20000 : 60000 ;//가족 수당		
		super.overtime_p = super.overtime * 5000 ;//시간 외 수당
		super.tax = 0.1 * super.pay ; //세금
		super.incen_p = super.pay * super.incentive ; //성과금
		super.total_pay = 
			super.pay + super.family_p + super.incen_p + 
			super.overtime_p - super.tax ; //실 수령액
	}
	
	@Override
	public void out() {
		String imsi = "" ; 
		imsi += super.name + "\t"  ;		
		imsi += super.pay + "\t"  ;//기본급
		imsi += super.family + "\t"  ;//가족수
		imsi += super.family_p + "\t"  ;//가족수당
		imsi += super.overtime + "\t"  ;//시간외근무
		imsi += super.overtime_p + "\t"  ;//시간외수당
		imsi += super.tax + "\t"  ;//세금
		imsi += super.incentive + "\t"  ;//인센티브
		imsi += super.incen_p + "\t"  ;//성과금
		imsi += super.total_pay  ;//실수령액
		System.out.println( imsi );
	}
}*/