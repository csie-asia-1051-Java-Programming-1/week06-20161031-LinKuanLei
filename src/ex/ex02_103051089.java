package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		System.out.println("C(m,n)="+C(m,n));
	}
	public static double C(int m,int n){
		double sum = (double)J(m)/(J(n)*J(m-n));
		return sum;
	}
	public static long J(int a){
		long sum = 1;
		for(int i = 1; i<=a ;i++){
			sum *=i;
		}
		return sum;
	}

}
