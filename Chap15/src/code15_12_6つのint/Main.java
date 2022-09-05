package code15_12_6つのint;
	import java.util.Calendar;
import java.util.Date;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calendar c = Calendar.getInstance();
		//６つのint値からインスタンスを生成
		c.set(2019,8,22,1,23,45);
		//年,月,日,時,分,秒を代入
		c.set(Calendar.MONTH, 9);
		//月を9（10）月に変更
		//月の数字は０から始まるので9は8月なってしまう。
		Date d = c.getTime();
		//
		System.out.println(d);
		//dateインスタンスからint値を生成
		Date now = new Date();
		//Date型インスタンスを生成
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		//年を取り出す。
		System.out.println("今年は"+y+"年です");
		
		int m =c.get(Calendar.MONTH)+1;
		System.out.println(m);
				

	}

}
