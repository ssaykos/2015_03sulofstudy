package _4��;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class _18����_02_myMap {

	public static void main(String[] args) {
		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(new Integer(1), new String("�Ｚ"));
		map.put(2, "�Ե�");
		map.put(3, "SK");
		map.put(4, "���");
		
		//3�� ���翩��
		boolean bool;
		bool=map.containsKey(3);
		System.out.println("3�� ���翩��:"+bool);
		//����
		System.out.println("��Ұ���:"+map.size());
		//�ؼ��� �����ϳ���?
		boolean nexen;
		nexen=map.containsValue("�ؼ�");
		System.out.println("�ؼ� ���翩��:"+nexen);
		
		//�ؼ��� �������� ������ SK�� 5���� �̵��ϰ� �ؼ��� 3���� �߰��ϼ���.
		if(!map.containsValue("�ؼ�")){
			map.put(5, "SK");
			map.put(3, "�ؼ�");
		}
		String value = map.get(4);
		System.out.println("4��:"+value);
		
		Set<Integer> keylist = map.keySet();
		
		for (Integer key : keylist) {
			String val = map.get(key);
			System.out.println("Ű:"+key+",��:"+val);
		}
				
		//��� ��� �����
		map.clear();
		
		bool=map.isEmpty();//is�� �����ϴ� �޼ҵ�� boolean�� ����
		
		System.out.println("���빰�� ����ִ°�?"+bool);
		
		System.out.println("��Ұ���:"+map.size());
	}

}
