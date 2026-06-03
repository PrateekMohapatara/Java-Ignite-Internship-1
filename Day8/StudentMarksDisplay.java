/*
Easy 1 – Student Marks Display

Create a program that:

Stores 5 student marks in a 1D array
Prints all marks using a loop
Sample Output
Student Marks:
78
65
90
82
55
  */
package day8_Progs;
import java.util.Scanner;
public class print_StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int student[] = new int[5];
		System.out.print("Enter Students marks → ");
		for(int i=0;i<5;i++) {
			student[i]=sc.nextInt();
		}
		System.out.print("marks are : ");
		for(int i=0;i<5;i++) {
			System.out.print(student[i]+" ");
		}
		sc.close();
	}

}
