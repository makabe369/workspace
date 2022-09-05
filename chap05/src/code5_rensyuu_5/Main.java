package code5_rensyuu_5;

public class Main {
	public static void main() {
		System.out.println("数字をaに代入");
		double a = new java.util.Scanner(System.in).nextInt();
		System.out.println("数字をbに代入");
		double b = new java.util.Scanner(System.in).nextInt();
		
		System.out.println(a + "と" + b + "の平均は" + ans);
				
	}
	public static double average(double a,double b) {
		double ans = (a*b) / 2;
				return ans;
	}

}
