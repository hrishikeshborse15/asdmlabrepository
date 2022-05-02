//wap that ask 5 subjects marks of a student . find average marks by dividing total 5.check if marks less than 40 print fail.if marks between 40 to 60 print c grade if marks betwn 60 to 80 print Belse A grade
package studentprogressreport;

import java.util.Scanner;

public class studentgrade {

	public static void main(String[] args) 
	{String name;
	int avgmarks;
	int marathi;
	int math;
	int science;
	int english;
	int history;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter student name & subjects marks:");
	name=s.next();
	marathi=s.nextInt();
	math=s.nextInt();
	science=s.nextInt();
	english=s.nextInt();
	history=s.nextInt();
	
	avgmarks=(marathi+math+science+english+history)/5;
	System.out.println("marathi ="+marathi);
	System.out.println("math ="+math);
	System.out.println("science ="+science);
	System.out.println("english ="+english);
	System.out.println("history ="+history);
	System.out.println("Avg marks ="+avgmarks);

	if(avgmarks<40)
	{System.out.println("Result= Fail");}
	else if(avgmarks>=40 &&avgmarks<=60)
	{System.out.println("Result = Grade C");
	}
	else if(avgmarks>=60 && avgmarks<=80)
	{System.out.println("Result = Grade B");
	}
	else
	{System.out.println("Result = Grade A");

	}
}}