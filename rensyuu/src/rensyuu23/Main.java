package rensyuu23;

public class Main {
	//戻り値に配列を用いる
	public static int[] makeArray(int size) {//int型配列を作成して戻すめそっど
		int[] newArray =new int[size];//配列をくみますよ～の宣言
		for(int i=0;i<newArray.length;i++) {
			newArray[i]=i;
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = makeArray(3);
		for(int i: array) {
			System.out.println(i);
		}
		

	}

}
