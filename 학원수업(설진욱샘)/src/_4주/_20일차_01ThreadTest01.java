package _4��;

import java.awt.Frame;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.xml.crypto.Data;
import javax.xml.stream.events.StartDocument;

public class _20����_01ThreadTest01 {

	public static void main(String[] args) {
		
		Threadx th=new Threadx();
		th.start();
		
		RunnableEx mem = new RunnableEx() ;
		Thread th1 = new Thread(mem)	;
		th1.start();
			
		
		for (int i = 0; i < 101;++i) {
			System.out.println("����:"+i);
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				System.out.println("�����Լ������߻�");
				e.printStackTrace();
				
			}
		}
		
		
	}

}
class som{}
class RunnableEx extends som implements Runnable{

	String[] arr = {"���","�����ͽ���","ī��","�̹���"};	
	@Override
	public void run() {
		Random random = new Random();
		for (int i = 1; i < 101;i++) {
			String item = arr[random.nextInt(arr.length)];
			
			System.out.println(i+item);
			try {
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				
				System.out.println("�����Լ������߻�");
				e.printStackTrace();
				
			}
		}
	}
	
}
class Threadx extends Thread{
	public void run(){
		for (int i = 0; i < 101;++i) {
			Date date = new Date();
			//Date Ŭ����: ��¥ �� �ð��� ǥ�� �ϱ����� ��ƿ��Ƽ Ŭ����(y2k������ ���� Ŭ����)
			//�����ϱ����Ѱɷ� Calendar Ŭ���� : Data�� ��ȯ�� Ŭ����(y2k����)
			System.out.println(date);
			
			String pattern="���� �ð���  hh�� mm�� ss�� �Դϴ�.";
			//SimpleDateFormat:��¥�� ���� ���� (Format)�� �����ϱ� ���� ��ƿ��Ƽ Ŭ����
			SimpleDateFormat sdf= new SimpleDateFormat(pattern);
			
			String now = sdf.format(date);
			System.out.println(now);
			
			try {
				
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				
				System.out.println("�����Լ������߻�");
				e.printStackTrace();
				
			}
		}
	}
}

//���� ���÷����� �̿��� ������ �����