package _4주;

import java.awt.Frame;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.xml.crypto.Data;
import javax.xml.stream.events.StartDocument;

public class _20일차_01ThreadTest01 {

	public static void main(String[] args) {
		
		Threadx th=new Threadx();
		th.start();
		
		RunnableEx mem = new RunnableEx() ;
		Thread th1 = new Thread(mem)	;
		th1.start();
			
		
		for (int i = 0; i < 101;++i) {
			System.out.println("메인:"+i);
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				System.out.println("슬립함수에러발생");
				e.printStackTrace();
				
			}
		}
		
		
	}

}
class som{}
class RunnableEx extends som implements Runnable{

	String[] arr = {"빅뱅","애프터스쿨","카라","이문세"};	
	@Override
	public void run() {
		Random random = new Random();
		for (int i = 1; i < 101;i++) {
			String item = arr[random.nextInt(arr.length)];
			
			System.out.println(i+item);
			try {
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				
				System.out.println("슬립함수에러발생");
				e.printStackTrace();
				
			}
		}
	}
	
}
class Threadx extends Thread{
	public void run(){
		for (int i = 0; i < 101;++i) {
			Date date = new Date();
			//Date 클래스: 날짜 및 시간을 표현 하기위한 유틸리티 클래스(y2k이전에 나온 클래스)
			//보안하기위한걸로 Calendar 클래스 : Data를 보환한 클래스(y2k이후)
			System.out.println(date);
			
			String pattern="현재 시간은  hh시 mm분 ss초 입니다.";
			//SimpleDateFormat:날짜에 대한 서식 (Format)을 지원하기 위한 유틸리티 클래스
			SimpleDateFormat sdf= new SimpleDateFormat(pattern);
			
			String now = sdf.format(date);
			System.out.println(now);
			
			try {
				
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				
				System.out.println("슬립함수에러발생");
				e.printStackTrace();
				
			}
		}
	}
}

//숙제 맵컬랙션을 이용한 쓰레드 만들기