package code15_14_Instant及びZonedDateTimeの利用例;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Instant i1 =Instant.now();
		//Instantの生成　現在日時を取得。
		Instant i2 =Instant.ofEpochMilli(1600705425827L);
		//Instantとlong値との相互変換
		long l =i2.toEpochMilli();
		
		//ZoneDateTimeの生成　現在日時を取得
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime
				.of(2020,1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));
		//東京時間2020年1月2日3時4分5秒6ナノ秒を指定して取得
		
		//InstantとZoneDateTimeの相互変換
		//インスタント型にz2を代入。
		Instant i3 =z2.toInstant();//()の中が引数として表示される。
		ZonedDateTime z3 =i3.atZone(ZoneId.of("Europe/London"));

		
		//ZonedDateTimeの利用方法
		System.out.println("東京："+ z2.getYear() +z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン:"+ z3.getYear() +z3.getMonth() + z3.getDayOfMonth());
		
		
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}else {System.out.println("これらは違う時間を指しています");}

	}

}
