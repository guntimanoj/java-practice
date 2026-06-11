import java.util.Scanner;
public class SearchElementInArray
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of the array: ");
int n = sc.nextInt();

int[] arr = new int[n];

System.out.println("Enter elements in array: ");
for(int i = 0; i < n; i++)
{
arr[i] = sc.nextInt();
}

System.out.println("Enter elements to search: ");
int key = sc.nextInt();

boolean found = false;

for(int i = 0; i < n; i++)
{
if(arr[i] == key)
{
found = true;
break;
}
}

if(found)
{
System.out.println("Elemet found in the array.");
}
else
{
System.out.println("Element not found in the array.");
}

sc.close();
}
}
