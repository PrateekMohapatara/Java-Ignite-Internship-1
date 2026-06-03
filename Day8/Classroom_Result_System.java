/*
Medium – Classroom Result System

Create a program that:

Stores marks of 10 students in an array
Count:
Number of students who passed (marks >= 35)
Number of students who failed (marks < 35)
Output Example
Passed Students: 7
Failed Students: 3
*/
package day8_Progs;
import java.util.Scanner;
public class classroom_result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int student[]= new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Students marks → ");
		for(int i=0;i<10;i++) {
			student[i]=sc.nextInt();
		}
		int pass=0,fail=0;
		for(int i=0;i<10;i++) {
			if(student[i]>=35) {
				pass++;
			}
			else {
				fail++;
			}
		}
		
		System.out.print("Total Present : "+pass+"\n"+"Total Absent : "+ fail);
		sc.close();
	}

}
