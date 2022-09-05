package 例外インスタンス;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			FileWriter fw =new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
		}catch(IOException e) {
			System.out.println("エラー：" +e.getMessage());
			e.printStackTrace();
		}

	}

}
