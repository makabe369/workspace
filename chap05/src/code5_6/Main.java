package code5_6;

public class Main {
	public static void main(String[] args) {
		int x =100;
		int y =10;
		add();
	}
	public static void add() {
		int ans = x + y;//変数のスコープが原因でエラーとなる。
		//ブロックが異なり、変数宣言がされていないのに変数を設定した。
		System.out.println(x + "+" + y "=" + ans);
	}
}
