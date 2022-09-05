package code15_13_String型とDate型の相互変換;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws Exception{
		// TODO 自動生成されたメソッド・スタブ
		SimpleDateFormat f = 
				new SimpleDateFormat("yyyy/MM/dd E HH:mm:ss");
		//文字列の表示形式をつくる。
		
		//文字列からDateインスタンスを生成
		Date d =f.parse("2022/09/22 水 01:23:45");
		//fの型に日時を代入
		
		System.out.println(d);
		
		//Dateインスタンスから文字列を生成
		Date now =new Date();
		
		//今は何時をfの型にnowを代入して調べる。
		String s = f.format(now);
		System.out.println("現在は"+s+"です");
		

	}

}
