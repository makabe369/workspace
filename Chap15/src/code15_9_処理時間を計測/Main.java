package code15_9_処理時間を計測;

public class Main {
	public static void main(String[] args) {
		//現在の時間
		long start =System.currentTimeMillis();
		//ここで何らかの時間がかかる作業
		StringBuilder sb =new StringBuilder();
		System.out.println("+演算子処理開始");
		String s="Java";
		for (int i=0;i<30000; i++) {
			s +="Java";
		}
		System.out.println("+演算子処理終了");
		
		
		long end =System.currentTimeMillis();
		System.out.println("処理にかかった時間は…"+
		(end - start) +"ミリ秒でした。");
	}

}
