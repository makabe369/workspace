package code15_8_桁を揃える;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero hero1 =new Hero();
		Hero hero  =new Hero("ミナト","勇者",1000);


		final String FORMAT ="%-9s %-13s 所持金%,6d円";
		/* ★修飾★　省略可
		 *  ,=3桁ごとにカンマを入れる　０＝空き領域を0埋め
		 * ー＝左寄せ　　　　　　　　　＋＝符号を強制表示
		 * ★桁★
		 * 表示桁数を指定　省略可
		 * ★型　必須
		 * d＝整数　　　　ｓ＝文字列
		 * f＝少数　　　　d＝真偽値
	　　つまり、％左寄せ　9桁　ストリング型ということ。
		*/
		String s =String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		String s1 =String.format(FORMAT, hero1.getName(), hero1.getJob(), hero1.getGold());
		System.out.println(s);
		System.out.println(s1);
		
		
		final String FORMAT2 = "%-5s ＨＰは%-2d ＭＰは%d";
		Matango m =new Matango();
		s=String.format(FORMAT, m.getName(), m.getHp(), m.getMp());
		System.out.println(s);
		
		

	}


}
