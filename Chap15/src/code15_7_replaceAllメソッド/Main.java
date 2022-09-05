package code15_7_replaceAllメソッド;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = "abc,def:ghi";
		String s1 = "\\1000\\2000\\3000\\4000";
		System.out.println(s1);
		String[] words =s1.split("\\\\");
		for (String w:words) {
			System.out.print(w+"->");
		}
		
		
		String w =s.replaceAll("[beh]","X");//b,e,hをXに変換。
		System.out.println(w);

	}

}
