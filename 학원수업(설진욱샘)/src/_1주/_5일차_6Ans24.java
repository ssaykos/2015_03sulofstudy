package _1��;
import java.util.Scanner;


public class _5����_6Ans24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("���л����� ������ ��ձ��ϱ�");
		System.out.println("A���� �л� �� �Է�:");
		int size = scan.nextInt();
		
		double[] score=new double[size];
		double average=0,total=0;
				
		for(int i=0;i<score.length;i++)
		{
			System.out.println(""+i+"�� �л��� �������:");
			score[i]=scan.nextDouble();
		}
		for(int i=0;i<score.length;i++)
		{
			System.out.println(""+i+"�� �л��� �������:"+score[i]);
			total+=score[i];
		}
		System.out.println("A�� �л����� ����:"+total);
		System.out.println("A�� �л����� ���:"+(total/size));
	}

}
