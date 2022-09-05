package Finally;

import java.io.FileWriter;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("開始します");
		test();
		System.out.println("終了します");
	}
	
	public static void test() {
		try {
			FileWriter fw =new FileWriter("data.txt");
			fw.write("hello!");
		}catch(IOException e){
			System.out.println("なんらかの例外が発生しました");
		}finally {
			System.out.println("必ず実行します");
		}
	}

}
