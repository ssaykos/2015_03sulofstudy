package _4��;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _18����_03FileWriteEx {

	public static void main(String[] args) {
		FileWriter fw = null;
		String filename="J:\\2015-03-09 �ڹ�1 ������\\abcd.txt";
		BufferedWriter bw= null;
		
		try {
			//fw= new FileWriter("J:\\2015-03-09 �ڹ�1 ������\\abcd.txt");
			fw= new FileWriter(filename);
			
			bw= new BufferedWriter(fw);
			
			//fw=null;
			
			//���Ͽ� ����ϱ�
			bw.write("����");
			bw.newLine();
			bw.write("hoho");
			bw.write("abcd");
			
			System.out.println("���Ͼ��� �Ϸ�");
			
		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
			e.printStackTrace();
			
		}catch (Exception e) {
			System.out.println("������ ���� �߻�");
			e.printStackTrace();
			
		}finally{
			try {
				if(bw != null){bw.close();}//close�� ���̺� ��ɱ��� �Ѵ�.
				if(fw != null){fw.close();}//���������Ȱ� ���߿� �ݱ�.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
