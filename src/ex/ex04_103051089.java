package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 103051089 林冠磊
 */

public class ex04_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,7};
		square(arr);
	}
	public static void square(int a[]){
		for(int i = 0;i<a.length;i++){
			a[i] = (int)Math.pow(a[i], 2);
			System.out.print(a[i]+"\t");
		}
		
	}
}
