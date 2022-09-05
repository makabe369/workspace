package code15_18_練習問題1;

public class Main {//p562

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder s = new StringBuilder();
		for(int i =0; i < 100; i++) {
			s.append(i+1);
			s.append(",");
		}
		
		String a =s.toString();
		System.out.println(a);
		String[] b =a.split(",");
		for(String i:b) {
			System.out.println(i);
		}
		

	}

}
