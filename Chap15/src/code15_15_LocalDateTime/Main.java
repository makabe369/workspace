package code15_15_LocalDateTime;
	import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Main {
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now();//現在日時を取得
		LocalDateTime l2 = LocalDateTime.of(2020,1,1,9,5,0,0);
		//2020年1月1日9時5分を指定して取得
		System.out.println(l1);
		System.out.println(l2);
		
		//LocalDateTimeとZonedDateTimeの相互変換　変換する理由はゾーンタイムをなくしたいからか
		
		ZonedDateTime z1 =l2.atZone(ZoneId.of("Europe/London"));//タイムゾーンの追加
			//別にタイムゾーンを設けたからと言って自動的にその場所の時間にしてくれるわけではない。
		LocalDateTime l3 =z1.toLocalDateTime();//タイムゾーンの情報が切り捨て。
		
		System.out.println(z1);
		System.out.println(l3);
		
		Instant i1 =z1.toInstant();
		ZonedDateTime z2 =i1.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println(z2);

	}

}
