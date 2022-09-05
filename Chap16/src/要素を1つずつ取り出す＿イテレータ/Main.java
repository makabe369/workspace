package 要素を1つずつ取り出す＿イテレータ;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//ArrayListに要素を代入。
		ArrayList<String> names=new ArrayList<String>();
		names.add("湊");
		names.add("朝香");
		names.add("菅原");
		names.add(3,"国語");
		names.set(2,"momo");
		
		//イテレータの取得。
		Iterator<String> it =names.iterator();
		
		//イテレータを用いたリスト要素の取り出し
		while(it.hasNext()) {//次の要素があれば繰り返し処理。
			String e =it.next();//矢印を次に進め、内容を取り出す。
			System.out.println(e);
		}
		System.out.println("通常のfor文");
		for(int i =0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		System.out.println("拡張for文");
		for(String i :names) {
			System.out.println(i);
		}
		
		
		
		
		

	}

}
