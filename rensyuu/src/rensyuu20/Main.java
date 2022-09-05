package rensyuu20;

public class Main {
	public static int add(int x,int y) {
		int ans =x+y;
		return ans;
	}
	public static void main(String[] args) {
		/*int ans=add(20,30);
		System.out.println(ans);*/
		System.out.println(add(add(10,20),add(50,60)));
	}

}
