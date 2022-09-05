package code15_18_練習問題3;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//現在の日時をDate型で取得
		Date now= new Date();
		Calendar c =Calendar.getInstance();
		//取得した日時情報をカレンダーにセット
		c.setTime(now);
		//カレンダーから「日」の情報を取得
		int day =c.get(Calendar.DAY_OF_MONTH);
		//取得した値に100を足した値をカレンダーの「日」にセット
		day +=100;
		c.set(Calendar.DAY_OF_MONTH,day);
		//カレンダーの日時情報をDate型に変換
		Date future =c.getTime();
		
		
		//SimepleDateFormatを用いて指定された形式でdateインスタンスの内容を表示
		SimpleDateFormat f=
				new SimpleDateFormat("西暦yyyy年MM月dd日");
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(f.format(future));
		

	}

}
