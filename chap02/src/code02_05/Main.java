package code02_05;

public class Main {
	public static void main(String[]args) {
		//2.6.1
		String name = "すがわら";//変数宣言の文
		String message;
		message = name +"さん、こんにちは";//計算の文
		System.out.println(message);//命令実行の文
		
		//改行をせずに画面に文字を表示する。System.out.print
		String name2="すがわら";
		System.out.print("私の名前は");
		System.out.print(name2);
		System.out.print("です");
		
		
		//p89 大きいほうの数値を代入する命令
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);//int m =Math.max(1,2);
		System.out.println("比較実験："+a+"と"+b+"とで大きいほうは・・・"+m);
		
		//文字列を数値に変換する命令
		//文字として認識されている10を数値に変換する。
		String age ="31";
		int n =Integer.parseInt (age);
		System.out.println("あなたは来年、"+ (n+1)+"歳になりますね。");
		
		//乱数を生み出して代入する命令
		//実行するたびに結果が変わる。ゲームの時などに使用
		int r =new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		
		//キーボードから１行の入力を受け取る命令
		System.out.println("あなたの名前を入力してください。");
		String s =new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age2 = new java.util.Scanner (System.in).nextInt();
		System.out.println("ようこそ"+ age2 + "歳の" + s  + "さん");
		
	}

}