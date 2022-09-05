package code15_11_現在日時を表示;
import java.util.Date;//importするとよい

public class Main {
	public static void main(String[] args) {
		Date now = new Date();//現在の日時を取得
		System.out.println(now);//現在の日時を表示
		System.out.println(now.getTime());//
		Date past =new Date(1600705425827L);//過去の日時をもつDateインスタンス
		System.out.println(past);
	}

}
