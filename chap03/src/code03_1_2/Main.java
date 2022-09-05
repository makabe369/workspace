package code03_1_2;

public class Main {
	public static void main(String[] args) {
		boolean doorClose = false;
		while (doorClose == true) {//もしこのとき＝＝ではなく、＝にしてしまったらdoorClose=trueと書き換えられてしまう
			System.out.println("ノックする");
			System.out.println("1分待つ");//止める手段をしないといけない。
		}
		
	}

}
