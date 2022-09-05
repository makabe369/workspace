package code15_16_各種日時クラスのメソッド;
	import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//ローカルデートは年月日のみ格納
		
		//文字列からLocalDateを生成
		DateTimeFormatter fmt=
				DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate=
				LocalDate.parse("2020/09/22",fmt);
		
		//1000日後を計算
		LocalDate ldatep =ldate.plusDays(1000);
		String str = ldatep.format(fmt);//文字列にする
		System.out.println("1000日後は"+str);
		
		
		//現在日時との比較
		LocalDate now =LocalDate.now();
		if(now.isAfter(ldatep)) {//ナウのほうがIdatepよりあとであれば、トゥルー
			System.out.println("1000日後は過去日付です");
		
		}

	}

}
