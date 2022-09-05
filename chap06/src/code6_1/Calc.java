package code6_1;

public class Calc {
	public static void main(String[] args) {
		int a = 10;int b =2;
		int total = CalcLogic.tasu(a,b);//クラス名.メソッド(引数リスト);で違うクラスの変数も呼び出せる
		int delta =CalcLogic.hiku(a,b);
		System.out.println("足すと"+ total + "、引くと"+ delta);
	}
	

}
