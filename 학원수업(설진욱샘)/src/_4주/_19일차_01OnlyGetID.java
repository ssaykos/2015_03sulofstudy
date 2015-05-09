package _4주;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _19일차_01OnlyGetID {

	private static String GetID(String str) {
		int apos = str.indexOf("(");
		int dpos = str.indexOf(")");
		String id="";
		if(apos > -1 && dpos> -1){
			if( (apos+1)<dpos ){
				id=str.substring(apos+1, dpos);
			}
		}
		return id;
	}
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		String filename ="J:\\2015-03-09 자바1 김진선\\ID.txt";
		
		
		
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			
			String str ="";
						
			while( (str = br.readLine()) !=null) {
				System.out.println(str);
				String result = GetID(str);
				if(!result.equals("")){
					System.out.println("ID-"+result);
				}
				
			}
			
			System.out.println("작업완료");
		} catch (FileNotFoundException e) {
			
			System.out.println("파일 찾기 불가");
			e.printStackTrace();
			
			
		}catch (IOException e) {
			
			System.out.println("입출력 예외 발생");
			e.printStackTrace();
			
		}catch (Exception e) {
			
			System.out.println("기타 예외 발생");
			e.printStackTrace();
		}
	

/*		}
		}finally{
			try {
				
				if(br != null){br.close();}
				if(fr != null){fr.close();}
				
			} catch (Exception e2) {
				
				e2.printStackTrace();
				
			}
		}*/
		
		/*String str = "ab(dragon)다라";
		int cnt = 0;
		
		int apos = str.indexOf("(");
		int dpos = str.indexOf(")");
		
		System.out.println(apos+"/"+dpos);
		
		if(apos > -1 && dpos> -1){
			if( (apos+1)<dpos ){
				String id=str.substring(apos+1, dpos);
				System.out.println(++cnt+"번째아이디"+id);
			}
		}*/
	}

}
/*
BufferedReader br

readLine();
한줄 밑으로

read()
한줄을 읽기

EOF
end of file
파일의 끝*/