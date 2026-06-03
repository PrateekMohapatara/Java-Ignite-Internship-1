/*
1. Attendance Tracker (Medium)

A class has attendance records for 10 students.

Store attendance as:

1 = Present
0 = Absent

Calculate:

Total Present Students
Total Absent Students
Attendance Percentage
*/
package day8_Progs;
import java.util.Scanner;
public class attendance_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int student[]= new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Students Attendance (1 if present or 0 if Absent) → ");
		for(int i=0;i<10;i++) {
			student[i]=sc.nextInt();
		}
		int present=0,absent=0;
		for(int i=0;i<10;i++) {
			if(student[i]==1) {
				present++;
			}
			else {
				absent++;
			}
		}
		double percentage=((double)present/10)*100;
		System.out.print("Total Present : "+present+"\n"+"Total Absent : "+ absent+"\n"+"Attendance % is → "+percentage);
		sc.close();
		
	}

}
