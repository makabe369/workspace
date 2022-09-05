package code09_06;

public class Thief {
	String name;
	int hp;
	int mp;
	//インスタンスを生成したときに
	
	public Thief(String name, int hp, int mp) {
		this.name =name;//this をつけることによってローカル変数かどうかをわける。
		this.hp =hp;
		this.mp=mp;
	}
	public Thief(String name,int hp) {
		this(name,hp,5);
		/*this.name=name;
		 * this.hp=hp;
		 * this.mp=5;でもよいが、上記のほうが省略されてよい
		 */
	}
	
	public Thief(String name) {
		this(name,40);
		//５は、上記と同じ結果になるのだから、上から引っ張ってくれる。
		//しかしそれぞれが独立したものとなるのであれば、各自書いたほうが良い。
	}

}
