/*
Advanced – Company Sales Dashboard (2D Array)

Create a program that:

A company has sales data for 3 branches and 4 months.

Store the sales data in a 2D array.

Calculate:

Total sales of each branch
Overall company sales
Branch with the highest total sales
Example Structure
Branch 1 -> Jan Feb Mar Apr
Branch 2 -> Jan Feb Mar Apr
Branch 3 -> Jan Feb Mar Apr
Hint

Use nested loops.
*/
package day8_Progs;
import java.util.Scanner;
public class sales_inBranches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[3][4];
		System.out.print("Enter sales of product in each month for 4 months ↓\n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int total=0;
		int sum[]=new int[3];
		for(int i=0;i<3;i++) {
			 sum[i]=0;
			for(int j=0;j<4;j++) {
				sum[i]+=arr[i][j];
			}
			System.out.print("Total sales for branch "+(i+1)+" is "+sum[i]+"\n");
			total =total+sum[i];
		}
		System.out.print("Net sale is "+ total+"\n");
		int m= sum[0],k=0;
		for(int i=1;i<3;i++) {
			if(m<sum[i]) {
				m=sum[i];
				k=i;
			}
		}
		System.out.print("Branch "+(k+1)+" has most sales");
		sc.close();
	}

}
