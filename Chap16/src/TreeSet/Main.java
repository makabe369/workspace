package TreeSet;
import java.util.Set;
import java.util.TreeSet;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//TreeSetであれば、自然順序で呼び出される。
		//つまり、あいうえお順みたいな
		Set<String> words =new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for(String s: words) {
			System.out.print(s + "→");
		}

	}

}
