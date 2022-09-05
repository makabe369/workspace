package code02_04;

public class Main {
	public static void main(String[] args) {
		float f=3;//float型の変数にint型を代入 float 型あいまいな数値に
		double d=f;//double型の変数に代入　double型はPIなど正確に計算したいとき
		System.out.println(f);
		System.out.println(d);
		
		int i=1;
		byte b=1;
		short c=500;
		int g=126;
	
		
		b+=c;
		System.out.println(b);
		
		//char型
		
		char ch=48;//char型にも数字を入れることは可能
		char ch2='0';
		System.out.println(ch);
		System.out.println(ch2);
		
		int age=(int)3.2;//強制的な型変換　キャスト演算子
		System.out.println(age);//小数点以下切り捨てで表示される。
		/*強制的な型変換をすることでデータの欠損という不具合がつきまとう為、理由がない限り使用されない。*/
		
		
		//2.5.4
		double j=8.5 / 2;
		long l=5+2L;
		System.out.println(j);
		System.out.println(l);
		
		String msg="私の年齢は"+(23+1);/*演算子は左からやっていく。””と＋23は既に文字列の中に組み込まれているため、
		後から+1とやっても表示のされ方は231となってしまう。それでも＋としてほしい場合は
		（）でくくって計算を先にしてもらう。*/
		
		System.out.println(msg);
		
		
		
	}

}
	
