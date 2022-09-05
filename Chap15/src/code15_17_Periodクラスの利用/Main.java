package code15_17_Periodクラスの利用;
import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		LocalDate d1 =LocalDate.of(2020,1,1);
		LocalDate d2 =LocalDate.of(2020,1,4);
		
		//3日間を表すperiodを2通りの方法で生成
		Period p1 =Period.ofDays(3);
		Period p2 =Period.between(d1,d2);
		System.out.println(p1);//period3デイズ
		System.out.println(p2);
		
		
		//d2のさらに3日後を計算
		LocalDate d3 =d2.plus(p2);
		System.out.println(d3);
		
		

	}

}
