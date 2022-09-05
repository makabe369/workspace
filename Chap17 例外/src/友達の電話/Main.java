package 友達の電話;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String,Integer> friends =new HashMap<String,Integer>();
		friends.put("朋子", 33);
		friends.put("小夏", 599);
		friends.put("美里", 0120);
		for(String key:friends.keySet()) {
			int value = friends.get(key);
			System.out.println(key +"の電話番号は" + value);
		}
		

	}

}
