package hw;
/*
 * Topic: 請讓使用者輸入性別與身高，透過函數呼叫，依據男女不同, 幫她(他)計算並輸出其標準體重 
 * ((1)男：(身高-170)*0.6+62 , (2)女：(身高-158)*0.5+52)。函數算出結果後要回傳至主程式再印出結果。
 * 例如:輸入 1 170 則輸出 62.0, 輸入 2 165 則輸出 55.5 
 * Date: 2016/10/31
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class hw02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);		
		int type = scn.nextInt();
		int cm = scn.nextInt();
		System.out.print(BMI(type,cm));
	}
	public static float BMI(int type,int cm){
		float kg = 0;
		if(type == 1){//男
			kg = (float)(( cm - 170) * 0.6 + 62);
		}else if(type == 2){//女
			kg = (float)(( cm - 158) * 0.5 + 52);
		}
		return kg;
	}

}
