package code5_13;

public class Main {
	//int型配列を受け取り、
	//配列内の要素すべてに１を加えるメソッド
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;//全要素に１加算？？？
		}
	}
	
	/*拡張for文の場合はどうなる　配列の変数にのみ書き換えているので影響はない*/
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		incArray(array);//incArrayメソッドのarrayを呼び出す。→繰り返し
		for (int i :array) {
			System.out.println(i);
		}
	}

}
