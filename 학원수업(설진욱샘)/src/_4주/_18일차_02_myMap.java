package _4주;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class _18일차_02_myMap {

	public static void main(String[] args) {
		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(new Integer(1), new String("삼성"));
		map.put(2, "롯데");
		map.put(3, "SK");
		map.put(4, "기아");
		
		//3위 존재여부
		boolean bool;
		bool=map.containsKey(3);
		System.out.println("3위 존재여부:"+bool);
		//갯수
		System.out.println("요소갯수:"+map.size());
		//넥센이 존재하나요?
		boolean nexen;
		nexen=map.containsValue("넥센");
		System.out.println("넥센 존재여부:"+nexen);
		
		//넥센이 존재하지 않으면 SK를 5위로 이동하고 넥센을 3위에 추가하세요.
		if(!map.containsValue("넥센")){
			map.put(5, "SK");
			map.put(3, "넥센");
		}
		String value = map.get(4);
		System.out.println("4등:"+value);
		
		Set<Integer> keylist = map.keySet();
		
		for (Integer key : keylist) {
			String val = map.get(key);
			System.out.println("키:"+key+",값:"+val);
		}
				
		//요소 모두 지우기
		map.clear();
		
		bool=map.isEmpty();//is로 시작하는 메소드는 boolean을 쓴다
		
		System.out.println("내용물이 비어있는가?"+bool);
		
		System.out.println("요소갯수:"+map.size());
	}

}
