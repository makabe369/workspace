package rensyuu8;

public class Main {
	public static void main(String[] args) {
		//アドレス1000
		int[][] scores1 = new int[2][5];
		//アドレス未定
		int[][] scores2;
		//アドレス未定
		int[] scores3;
		//アドレス2000
		int[] score1 = {40,50,60,70,80};
		//アドレス3000
		int[] score2 = {90,80,40,20,60};
		//アドレス4000
		int[] score3 = {60,65,50};
		//アドレス1000の[0]の値がアドレス2000
		scores1[0] = score1;
		//アドレス1000の[1]の値がアドレス3000
		scores1[1] = score2;
		//アドレス1000
		scores2 = scores1;
		//アドレス3000
		scores3 = scores1[1];
		//アドレス1000の[1]の値が4000
		scores2[1] = score3;
		// scores1[1]の要素数はいくつになるか答えなさい
		System.out.println(scores1[1].length);//3
		// scores3の要素数はいくつになるか答えなさい
		System.out.println(scores3.length);//5
	}

}

