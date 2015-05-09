package _1주;
import java.util.Scanner;


public class _5일차_6Ans24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("반학생들의 총점과 평균구하기");
		System.out.println("A반의 학생 수 입력:");
		int size = scan.nextInt();
		
		double[] score=new double[size];
		double average=0,total=0;
				
		for(int i=0;i<score.length;i++)
		{
			System.out.println(""+i+"번 학생의 평균점수:");
			score[i]=scan.nextDouble();
		}
		for(int i=0;i<score.length;i++)
		{
			System.out.println(""+i+"번 학생의 평균점수:"+score[i]);
			total+=score[i];
		}
		System.out.println("A반 학생들의 총점:"+total);
		System.out.println("A반 학생들의 평균:"+(total/size));
	}

}
