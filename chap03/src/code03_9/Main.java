package code03_9;

public class Main {
	public static void main(String[] args) {
		for (int i =1; i<10; i++) {//1~9までの数字が繰り返される　まずはi=1と固定されjの値が変化していく
			for(int j=1 ; j <10 ; j++) {//1～9までの数字が繰り返される
				System.out.print(i*j);
				System.out.print(" ");//空白を出力
			}
		System.out.println("");//改行
		}
	}

}
