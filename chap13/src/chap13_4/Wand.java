package chap13_4;

public class Wand {
	private String name;//杖の名前
	
	private double power;//杖の魔力
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		//名前が０文字＝ぬる
		if(name==null ||  name.length() <3) {
			throw new IllegalArgumentException
			("名前を変えてください");
		}
		this.name = name;
	}
	
	public double power() {return this.power;}
	public void setPower(double power) {
		if(power()<0.5 && power()> 100) {
			throw new IllegalArgumentException
			("杖のパワーが異常です");
		}
		this.power =power;
	}

}

