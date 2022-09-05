package 練習問題;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//まずはHeroをインスタンス化
		Hero h1 =new Hero("斉藤");
		Hero h2 =new Hero("鈴木");
		
		//アレイリストを宣言し、Hero型を指定
		//＜＞の中にはインスタンスの型名を指定
		ArrayList<Hero> heros =new ArrayList<Hero>();
		//要素はh１とh２
		heros.add(h1);
		heros.add(h2);
		
		
		
		//拡張for文で一人ずつ取り出す
		for(Hero i:heros) {
			//格納されているのはh１、h２という要素の参照。
			//ここでは名前を表示したい。
			//今h.getName() == i.getName()
			System.out.println(i.getName());
			System.out.println(h1.getName() == i.getName());
		}
		
		/*//for文
		for(int i =0;i< array.size();i++) {
			System.out.println(Array.get(i).getName());
		}
		//iteratar
		Iterator <Hero> it =array.iterator();
		while(it.hasNext()) {
			Hero h=it.next();
			System.out.println(h.getName());
		}
		*/
		
		//HashMapのインスタンス化
		Map<Hero, Integer> toubatsu = new HashMap<Hero ,Integer>();
		//要素の格納
		toubatsu.put(h1, 3);
		toubatsu.put(h2, 7);

		//拡張for文でのマップに格納された情報を1つずつ取り出す
		for(Hero key :toubatsu.keySet()) {
			int taosu = toubatsu.get(key);
			System.out.println(key.getName()+"の倒した敵は="+ taosu);
		}
		
		
	}

}
