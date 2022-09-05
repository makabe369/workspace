package code02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h=new Hero();
		h.name="ミナト";
		
			
		
		/*Character c=new Character(); キャラクタークラスは抽象クラスになっているので
		 * newによるインスタンス化してはいけない。*/
		//キャラクタークラスは表に出るものではないのに間違えてインスタンス化されている。
		//継承の材料として使うべきものなのに…
		//詳細未定な部分が含まれているクラスは実体化(インスタンス化)されてはならない。
		Matango m=new Matango('A');
		h.attack(m);
		
		Dancer d=new Dancer();
		d.name="ダンサーカナデ";
		d.attack(m);
		d.dance();

	}

}
