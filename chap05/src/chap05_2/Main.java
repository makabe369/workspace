package chap05_2;

public class Main {
	public static void methodA() {
		System.out.println("methodA");
		methodB();   //methodBの呼び出し
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
		methodA();   //methodAの呼び出し
		
		//クラスブロックの中ではメソッドブロックはばらばらに書かれていても大丈夫
	}
}
