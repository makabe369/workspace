package 例外処理;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
		FileWriter fw =new FileWriter("data.txt");
		}catch (IOException | NullPointerException e) {
			System.out.println("エラーが発生しました");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("スタックトレース表示\n" + e.getMessage()
					+e.printStackTrace());
		}
	}
}
