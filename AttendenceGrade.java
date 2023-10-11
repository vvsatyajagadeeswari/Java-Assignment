package LabExams;
import java.util.Scanner;

public class AttendenceGrade 
{
	static Scanner sc=new Scanner(System.in);
	void grade()
	{ 
		for(int i=1;i<=10;i++)
		{
		System.out.println(i+". Enter Student Name");
		String name=sc.next();
		System.out.println("Enter Attendence Percentage");
		int attendence=sc.nextInt();
					
		switch(attendence/10)
		{
		case 10:
		case 9:
		System.out.println(name+ " having Grade A");
		break;
		case 8:
		System.out.println(name+ "having Grade B");
		break;
		case 7:
		System.out.println(name+"having Grade C");
		break;
		case 6:
		System.out.println(name+"having Grade D");
		break;
		default:
		System.out.println(name+"having Grade E");
		}
		}
	}
	public static void main(String[] args) 
	{
		AttendenceGrade ag=new AttendenceGrade();
		ag.grade();
	}
}
