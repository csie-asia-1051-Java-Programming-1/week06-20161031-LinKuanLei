package ex;
/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。例如:輸入128917178, 則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		decomp(n);
	}
	public static void decomp(int n){
		String str = Integer.toString(n);
		char data[] = str.toCharArray();
		for(int i = 0 ; i<data.length;i++){
			System.out.print(data[i]+"\t");	
		}
		/*
		int ntemp = n;
		int ncount=0;
		while(ntemp>0){
			ntemp/=10;
			ncount++;
		}
		int m[] = new int[ncount];
		for(int i = 0 ;i <m.length;i++){
			m[i]=n%10;
			n/=10;			
		}
		for(int i = m.length-1 ;i >=0;i--){
			System.out.print(m[i]+"\t");			
		}
		*/
	}

}
