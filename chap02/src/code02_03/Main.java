package code02_03;

public class Main {
	public static void main(String[] args) {
		int a;
		a=100;
		a++;
		System.out.println(a);
		
		a--;
		System.out.println(a);
		
		a=10;
		int b;
		b=10;
		System.out.println(++a + 50);//値が代入されるタイミングが異なる。こちらはすぐに代入
		System.out.println(b++ + 50);//代入があとになる。
		
		
	}

}
