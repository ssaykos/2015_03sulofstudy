package _4��;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class _17����_04Myset {

	public static void main(String[] args) {
		Set<Object> set= new HashSet<Object>();
		
		set.add(new Integer(100));
		set.add(new _17����_01myException01());
		set.clear();
		
		set.add("����ī");//��Ʈ���� ������Ʈ�� �±� �� ����ȯ �߻�
		set.add("Ƽ�Ĵ�");
		set.add("ȿ��");
		set.add("����");
		set.add("����ī");
		PrintSet(set);
		PrintFor(set);
		
		Object[] arr=set.toArray();
		System.out.println("Ȯ��for�� �̿��� �迭 ��� ���");
		for (Object object : arr) {
			System.out.println(object);
		}		
				
		System.out.println("toString() �޼ҵ�"+set.toString());
				
				
		//[����]:�׸��� �����ϸ� ��Ͽ��� ����
		//[���]:�׸��� �������� ������ ��Ͽ� �߰�
		if(set.contains("����")){
			set.remove("����");
		}
		if(set.contains("���")){
			
		}else{
			set.add("���");
		}
		
		
		System.out.println("��� ����:"+set.size());
		
		
	}

	private static void PrintFor(Set<Object> set) {
		System.out.println("Ȯ��for�� ���");
		for (Object item : set) {
			System.out.println(item);
		}
	}

	private static void PrintSet(Set<Object> set) {
		System.out.println("�ݺ��ڸ� �̿��� ���");
		//System.out.println(set.toString());
		Iterator<Object> it =set.iterator();
		while(it.hasNext()){
			Object item=it.next();
			System.out.println(item);
		}
	}

}
