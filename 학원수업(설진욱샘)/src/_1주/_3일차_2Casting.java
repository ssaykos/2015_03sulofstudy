package _1주;

public class _3일차_2Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=100;
		System.out.println("d:"+d);//100.0
		
		int a=(int)15.5;//실수형은 정수형으로 변환이 자동(암시적)으로 변환이 불가능 하기때문에 강제(명시적)로 바꿔줘야만 한다 비주얼스튜디오와는 다른점?인듯 하다.
		System.out.println("a:"+a);//15
		
		System.out.println(14/5);
		System.out.println((double)14/5);//2.8
		//(double) 14/5
		//14.0 /5.0<-명시적 형변환
		//2.8
		System.out.println((double)(14/5));//?2.0?
		//(double)(14/5)
		//(double)2
		//2
		
		int kor=50,eng=60,math=80;
		int total=kor+eng+math;
		double average=(double)total/3;
		double average1=total/3;
		System.out.println("총점:"+total);//190
		System.out.println("평균1:"+average);//63.333333
		System.out.println("평균2:"+average1);//63.0
		
		
		char ch1='c';
		char ch2='a';
		boolean bool1=ch1>ch2;//99>97
		System.out.println(bool1);//True
		
		int result=ch1-ch2+3;
		System.out.println(result);//5
		
		char ch3='D';
		String str=ch3>='A'&&ch3<='Z'?"대문자":"소문자";
		System.out.println(str);//대문자
		

	}

}
