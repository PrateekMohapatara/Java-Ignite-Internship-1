/*
Consecutive Increase Checker 

Store 5 numbers in an array.

Determine whether the numbers are in strictly increasing order.

Example
10 20 30 40 50

Output:

Array is in increasing order

Example:

10 20 15 40 50

Output:

Array is NOT in increasing order
  */
package day8_Progs;
import java.util.Scanner;
public class check_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.print("Enter Array elements ↓\n");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int k=1;
		for(int i=0;i<5;i++) {
			int min =arr[i];
			for(int j= i+1;j<5;j++) {
				if(min>arr[j]) {
					k=0;
				}
			}
		}
		if(k==1) {
			System.out.print("Array is in increasing order\n");
		}
		else {
			System.out.print("Array is NOT in increasing order\n");
		}
			sc.close();
	}
}
