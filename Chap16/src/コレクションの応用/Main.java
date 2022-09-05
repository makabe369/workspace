package コレクションの応用;

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
		List<Hero> list=new ArrayList<>();
		list.add(h);
		
		System.out.println(list.get(0).name);
		

	}

}
