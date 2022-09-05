package code15_18_練習問題2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s ="A11";
		
		if(s.matches(".*")) {
			System.out.println("1の条件を満たしています");
		}
		if(s.matches("A[0-9]{1,2}")){
			System.out.println("2の条件を満たしています");
		}
		

	}

}
