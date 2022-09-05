package code07;

public abstract class TangibleAsset {
	String name;
	int price;
	String color;
	//コンストラクタ　引数をわたす。全て
	public TangibleAsset(String name,int price,String color) {
		//初期化
		this.name=name;
		this.price = price;
		this.color = color;
	}
	//メソッド
	public String getName() {return this.name;}
	public int getPrice() {return this.price;}
	public String getColor() {return this.color;}
}
