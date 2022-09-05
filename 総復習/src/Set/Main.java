package Set;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String> colors =new TreeSet<String>();
		colors.add("黄");
		colors.add("青");
		colors.add("赤");
		for(String s:colors) {
			System.out.print(s);
		}

	}

}
