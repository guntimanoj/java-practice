import java.util.Scanner;

public class StudentGradeAnalyzer
{
public static void main(Strong[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter number of students: ");
int n = sc.nextInt();

int[] marks = new int[n];

for (int i = 0; i < n; i++)
{
System.out.println("Enter marks of student " + ( i + 1) + " : ");
marks[i] = sc.nextInt();
}

int total = 0;
int highest = marks[0];
int lowest = marks[0];

for (int i = 0; i < n; i++)
{
total += marks[i];

if (marks[i] > highest)
{
highest = marks[i];
}

if (marks[i] < lowest)
{
loweest = marks[i];
}
}

double average = (double) total / n;

System.out.println("\n--- Result Summary ---");
System.out.println("Total Marks: " + total);
System.out.println("Average: " + average);
System.out.println("Highest Marks: " + highest);
System.out.println("Lowest Marks: " + lowest);

sc.close();

}
}
 
