package Code17_10;
import java.io.FileWriter;

public class Main {
	public static void main(String[] args) {
		try(FileWriter fw =new FileWriter("data,txt");){//try（）のファイルは勝手に閉じてくれる
			fw.write("hello!");
		}catch(Exception e){
			System.out.println("何らかの例外が発生しました");
		}
	}

}
