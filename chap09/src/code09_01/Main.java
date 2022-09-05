package code09_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1; //Hero型の変数ｈが確保された
		h1 = new Hero();//ｈに代入　初期化
		h1.hp =100;//
		Hero h2;
		h2 = h1;
		h2.hp = 200;//意味　変数h２の中身3922が指す番地にいるｲﾝｽﾀﾝｽのhpを200に書き換えろ
		System.out.println(h1.hp);

	}

}
