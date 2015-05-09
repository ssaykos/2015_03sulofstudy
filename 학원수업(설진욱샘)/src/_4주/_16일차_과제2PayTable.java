package _4주;
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
	double total_pay ; //실 수령액
	public MySalary(String name, int pay, int family, int overtime){
		this.name=name;
		this.pay=pay;
		this.family=family;
		this.overtime=overtime;
	}
}
public class _16일차_과제2PayTable extends MySalary implements Output,Calculate{
	
	public _16일차_과제2PayTable(String name, int pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}
	public static void main(String[] args) {
		_16일차_과제2PayTable[] pt = new _16일차_과제2PayTable[3];
		//									이름    기본급	가족수	야근
		pt[0] = new _16일차_과제2PayTable("소서노", 750000, 	2,	3 ) ;
		pt[1] = new _16일차_과제2PayTable("고주몽", 800000, 	1,	4 ) ;
		pt[2] = new _16일차_과제2PayTable("모팔모", 650000, 	6,	2 ) ;

		MySalary.incentive = 0.7 ;
		
		for (int i = 0; i < pt.length; i++) {
			pt[i].calc(); 
			pt[i].out(); 
		}
	}

	@Override
	public void calc() {
		if(super.family<3){
			super.family_p=(double)super.family*20000;	
		}else{
			super.family_p=(double)60000;
		}
		super.overtime_p=super.overtime*5000;
		super.tax=super.pay*0.1;
		super.incen_p=super.incentive*super.pay;
		super.total_pay=super.pay+super.family_p+super.incen_p+super.overtime_p-super.tax;

	}

	@Override
	public void out() {
		System.out.println("이름:"+super.name+"\t기본급:"+super.pay+"원");
		System.out.println();
		System.out.println("가족수:"+super.family+"명\t가족수당:"+super.family_p+"원");
		System.out.println();
		System.out.println("시간외근무:하루평균"+super.overtime+"시간\t시간외수당:"+super.family_p+"원\t세금:"+super.tax+"원\t인센티브:"+(super.incentive*100)+"%");
		System.out.println();
		System.out.println("성과금:"+super.incen_p+"원\t실수령액:"+super.total_pay+"원");
		System.out.println();
		System.out.println();
	}
}