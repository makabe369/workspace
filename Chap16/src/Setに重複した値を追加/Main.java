package Setに重複した値を追加;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set <String> colors =new HashSet<String>();
		//HashSetであれば、複数の情報を重複なく格納することが可能。
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");//重複したデータはカウントされなかった。
		
		System.out.println("色は"+colors.size() +"種類");
		
		
		for(String array:colors) {
			System.out.print(array+"→");
		}
		//iterator
		System.out.println("\niterator");
		Iterator<String> it =colors.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"→");
		}

	}

}
