package code08_1;
	public class Matango {
		int hp;
		final int LEVEL= 10 ;	//定数フィールド　値は書き換えできない
		char suffix;
		
		public void run() {
			System.out.println("お化けキノコ"+ this.suffix +"は逃げ出した！");
		}
		
		public void figtht() {
			System.out.println("お化けキノコ"+this.suffix +"が攻撃してきた！");
			
		}
	}
