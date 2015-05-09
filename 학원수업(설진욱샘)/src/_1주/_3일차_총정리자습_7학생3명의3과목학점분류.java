package _1주;
import java.util.Scanner;

public class _3일차_총정리자습_7학생3명의3과목학점분류 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("3명 학생의 국영수 과목의 점수를 입력받아 총점 평균 학점 등을 나타내는 프로그램이다");
		
		System.out.println("첫번째 학생의 이름-");
		String name1=scan.next();
		
		System.out.println(""+name1+"학생의 국어 점수-");
		int kor1=scan.nextInt();
		
		System.out.println(""+name1+"학생의 영어 점수-");
		int eng1=scan.nextInt();
		
		System.out.println(""+name1+"학생의 수학 점수-");
		int math1=scan.nextInt();
		
		
		System.out.println("두번째 학생의 이름-");
		String name2=scan.next();
		
		System.out.println(""+name2+"학생의 국어점수-");
		int kor2=scan.nextInt();
		
		System.out.println(""+name2+"학생의 영어점수-");
		int eng2=scan.nextInt();
		
		System.out.println(""+name2+"학생의 수학점수-");
		int math2=scan.nextInt();
		
		
		System.out.println("세번째 학생의 이름-");
		String name3=scan.next();
		
		System.out.println(""+name3+"학생의 국어 점수-");
		int kor3=scan.nextInt();
		
		System.out.println(""+name3+"학생의 영어 점수-");
		int eng3=scan.nextInt();
		
		System.out.println(""+name3+"학생의 수학 점수-");
		int math3=scan.nextInt();
		
		
		System.out.println(""+name1+"학생의 총점수는 "+(kor1+eng1+math1)+"\n 평균은 "+((kor1+eng1+math1)/3)+"이다");
		
		System.out.print("국어 학점은");
		if (kor1>=90)
		{
			System.out.println("A학점");
		}
		else if(kor1>=80)
		{
			System.out.println("B학점");
		}
		else if(kor1>=70)
		{
			System.out.println("C학점");
		}
		else if(kor1>=60)
		{
			System.out.println("D학점");
		}
		else
		{
			System.out.println("F학점");
		}
		
		System.out.print("영어 학점은");
		if (eng1>=90)
		{
			System.out.println("A학점");
		}
		else if(eng1>=80)
		{
			System.out.println("B학점");
		}
		else if(eng1>=70)
		{
			System.out.println("C학점");
		}
		else if(eng1>=60)
		{
			System.out.println("D학점");
		}
		else
		{
			System.out.println("F학점");
		}
		
		System.out.print("수학 학점은");
		if (math1>=90)
		{
			System.out.println("A학점");
		}
		else if(math1>=80)
		{
			System.out.println("B학점");
		}
		else if(math1>=70)
		{
			System.out.println("C학점");
		}
		else if(math1>=60)
		{
			System.out.println("D학점");
		}
		else
		{
			System.out.println("F학점");
		}
		
		System.out.println(""+name2+"학생의 총점수는 "+(kor2+eng2+math2)+"\n 평균은 "+((kor2+eng2+math2)/3)+"이다");
		
		System.out.print("국어 학점은");
		if (kor2>=90)
		{
			System.out.println("A학점");
		}
		else if(kor2>=80)
		{
			System.out.println("B학점");
		}
		else if(kor2>=70)
		{
			System.out.println("C학점");
		}
		else if(kor2>=60)
		{
			System.out.println("D학점");
		}
		else
		{
			System.out.println("F학점");
		}
		
		System.out.print("영어 학점은");
		if (eng2>=90)
		{
			System.out.println("A학점");
		}
		else if(eng2>=80)
		{
			System.out.println("B학점");
		}
		else if(eng2>=70)
		{
			System.out.println("C학점");
		}
		else if(eng2>=60)
		{
			System.out.println("D학점");
		}
		else
		{
			System.out.println("F학점");
		}
		
		System.out.print("수학 학점은");
		if (math2>=90)
		{
			System.out.println("A학점");
		}
		else if(math2>=80)
		{
			System.out.println("B학점");
		}
		else if(math2>=70)
		{
			System.out.println("C학점");
		}
		else if(math2>=60)
		{
			System.out.println("D학점");
		}
		else
		{
			System.out.println("F학점");
		}
		
		System.out.println(""+name3+"학생의 총점수는 "+(kor3+eng3+math3)+"\n 평균은 "+((kor3+eng3+math3)/3)+"이다");
		
		System.out.print("국어 학점은");
		if (kor3>=90)
		{
			System.out.println("A학점");
		}
		else if(kor3>=80)
		{
			System.out.println("B학점");
		}
		else if(kor3>=70)
		{
			System.out.println("C학점");
		}
		else if(kor3>=60)
		{
			System.out.println("D학점");
		}
		else
		{
			System.out.println("F학점");
		}
		
		System.out.print("영어 학점은");
		if (eng3>=90)
		{
			System.out.println("A학점");
		}
		else if(eng3>=80)
		{
			System.out.println("B학점");
		}
		else if(eng3>=70)
		{
			System.out.println("C학점");
		}
		else if(eng3>=60)
		{
			System.out.println("D학점");
		}
		else
		{
			System.out.println("F학점");
		}
		
		System.out.print("수학 학점은");
		if (math3>=90)
		{
			System.out.println("A학점");
		}
		else if(math3>=80)
		{
			System.out.println("B학점");
		}
		else if(math3>=70)
		{
			System.out.println("C학점");
		}
		else if(math3>=60)
		{
			System.out.println("D학점");
		}
		else
		{
			System.out.println("F학점");
		}

	}

}
