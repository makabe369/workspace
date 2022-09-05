package code03_8;

public class Main {//メインメソッド
	public static void main(String[] args) {//クラスブロック
		System.out.print("\n");
		for(int i=0; i<3; i++) {//メソッドブロック
			System.out.println("現在"+(i+1)+ "周目→");
		}
	
		//ループ変数を1からスタートさせる
		for(int i=1; i<10 ; i++) {
			System.out.println(i);
		}
		//ループ変数を2ずつ増やす　5回したら終わる
		for(int i =0; i<10; i=i+2) {//i+=2
			System.out.println(i);
		}
		//ループ変数を10から1ずつ1まで減らしていく
		for (int i=10 ; i<0; i--) {
			System.out.println(i);
		}
		//ループ変数を初期化しない
		{
		int i =0;
		for (;i<10; i++) {
			System.out.println(i);
			}
		}
		//繰り返し時の処理を行わない
		for(int i=0; i<10;) {
			System.out.println("こんにちは");
			
		}
			
		}
			
	}

