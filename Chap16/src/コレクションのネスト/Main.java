package コレクションのネスト;
import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name;

}


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h =new Hero();
		h.name ="ミナト";
		List<Hero> list= new ArrayList<Hero>();
		list.add(h);
		h.name ="スガワラ";
		System.out.println(list.get(0).name);
		
		
		List<String> list2 =new ArrayList<String>();
		String s  = "ミナト";
		list2.add(s);
		s ="スガワラ";
		System.out.println(list2.get(0));
		

	}

}
