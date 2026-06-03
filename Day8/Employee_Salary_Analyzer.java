/*
Easy 2 – Employee Salary Analyzer

Create a program that:

Stores salaries of 5 employees in an array
Calculate and display:
Total Salary
Average Salary
Hint

Use a loop and a sum variable.
  */
package day8_Progs;
import java.util.Scanner;
public class salary_checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.print("Enter Salary of 5 emplooyes ↓\n");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=arr[i];
		}
		double avg= (double)sum/5;
		System.out.print("Total salary is "+sum+"\n"+"Average salary is "+avg);
		sc.close();
	}
	
}
