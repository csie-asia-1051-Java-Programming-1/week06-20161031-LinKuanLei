package ex;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("square(n,c)，以 c 字元，印出邊長為 n 之實心正方形");
		int n = scn.nextInt();
		char c = scn.next().charAt(0);
		square(n,c);
	}
	public static void square(int a,char b){
		for(int i = 0;i<a;i++){
			for(int j = 0;j<a;j++){
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
