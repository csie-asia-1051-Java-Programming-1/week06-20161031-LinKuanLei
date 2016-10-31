package ex;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex05_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println(fun1(scn.nextInt()));
	}
	public static int fun1(int n ){
		int sum = 0;
		while(n>0){
			sum += n%10;
			n = (int)n/10;			
		}
		return sum;
	}

}
