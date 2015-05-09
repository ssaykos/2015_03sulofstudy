package _4주;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _18일차_03FileWriteEx {

	public static void main(String[] args) {
		FileWriter fw = null;
		String filename="J:\\2015-03-09 자바1 김진선\\abcd.txt";
		BufferedWriter bw= null;
		
		try {
			//fw= new FileWriter("J:\\2015-03-09 자바1 김진선\\abcd.txt");
			fw= new FileWriter(filename);
			
			bw= new BufferedWriter(fw);
			
			//fw=null;
			
			//파일에 기록하기
			bw.write("하하");
			bw.newLine();
			bw.write("hoho");
			bw.write("abcd");
			
			System.out.println("파일쓰기 완료");
			
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
			e.printStackTrace();
			
		}catch (Exception e) {
			System.out.println("나머지 예외 발생");
			e.printStackTrace();
			
		}finally{
			try {
				if(bw != null){bw.close();}//close는 세이브 기능까지 한다.
				if(fw != null){fw.close();}//먼저생성된건 나중에 닫기.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
