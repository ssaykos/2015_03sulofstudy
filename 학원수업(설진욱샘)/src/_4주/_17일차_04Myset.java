package _4주;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class _17일차_04Myset {

	public static void main(String[] args) {
		Set<Object> set= new HashSet<Object>();
		
		set.add(new Integer(100));
		set.add(new _17일차_01myException01());
		set.clear();
		
		set.add("제시카");//스트링이 오브젝트로 승급 의 형변환 발생
		set.add("티파니");
		set.add("효인");
		set.add("수영");
		set.add("제시카");
		PrintSet(set);
		PrintFor(set);
		
		Object[] arr=set.toArray();
		System.out.println("확장for를 이용한 배열 요소 출력");
		for (Object object : arr) {
			System.out.println(object);
		}		
				
		System.out.println("toString() 메소드"+set.toString());
				
				
		//[수영]:항목이 존재하면 목록에서 삭제
		//[써니]:항목이 존재하지 않으면 목록에 추가
		if(set.contains("수영")){
			set.remove("수영");
		}
		if(set.contains("써니")){
			
		}else{
			set.add("써니");
		}
		
		
		System.out.println("요소 갯수:"+set.size());
		
		
	}

	private static void PrintFor(Set<Object> set) {
		System.out.println("확장for문 출력");
		for (Object item : set) {
			System.out.println(item);
		}
	}

	private static void PrintSet(Set<Object> set) {
		System.out.println("반복자를 이용한 출력");
		//System.out.println(set.toString());
		Iterator<Object> it =set.iterator();
		while(it.hasNext()){
			Object item=it.next();
			System.out.println(item);
		}
	}

}
