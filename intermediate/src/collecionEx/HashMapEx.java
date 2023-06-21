package collecionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		System.out.println(map);
		System.out.println(map.toString());

		map.put("홍일동", 85); // 넣었다.
		map.put("홍이동", 75); // 넣었다.
		map.put("홍삼동", 65); // 넣었다.
		map.put("홍사동", 95); // 넣었다.
		map.put("홍오동", 85); // 넣었다.
		// 무조건 키 값으로 value를 찾는 방식

		// 키 값을 한번 다 가지고 와보자.
		int scorel = map.get("홍일동");
//		System.out.println(scorel);

		Set<String> keyset = map.keySet(); // Set은 중복되지 않는 것이고 순서 없다.
//		System.out.println(keyset);

		for (String key : keyset) {
			System.out.print(key + " : ");
			int score = map.get(key);
			System.out.println(score);
		}

	}
}
