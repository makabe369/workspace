package code15_4_StringBuilderを利用;

public class Main {
	public static void main(String[] args) {
		System.out.println("StringBuilder処理開始");
		StringBuilder sb =new StringBuilder();   //インスタンス化
		for(int i =0; i< 30000; i++) {         //for文で繰り返し処理
			sb.append("Java");     //バッファにJavaを追加
		}
		String s = sb.toString();  //完成した連結済みの文字列を取り出す。
		System.out.println("String Builder処理終了");
		
		//+演算子と比較
		System.out.println("+演算子処理開始");
		s = "Java";
		for(int i=0; i<30000; i++) {
			s +="Java";
		}
		System.out.println("+演算子処理終了");
	}

}
