import java.util.*;
class StudentArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int marks[][] = new int[5][5];

		for(int i=0; i<5; i++)
		{
			System.out.println("Enter marks of student "+i);
			for(int j=0; j<5; j++)
			{
				System.out.println("Enter marks of sub "+j);		
				marks[i][j] = sc.nextInt();
			}

		}

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();

		}


		int total[] = new int[5];
		int avg[] = new int[5];
		String resultArr[] = new String[5];
		int sum=0;
		String result="NA";
		for(int i=0; i<5; i++)
		{
			result = "pass";
			for(int j=0; j<5; j++)
			{
				if(marks[i][j] < 40)
				{
					result = "fail";
				}
				sum += marks[i][j];
			}
			total[i] = sum;
			avg[i] = total[i]/5;
			resultArr[i] = result;
			result = "pass";
		}

		for(int i=0; i < 5; i++)
		{
			System.out.println("student "+i+" total = "+total[i]+" average = "+avg[i]+" result = "+resultArr[i]);
		}

		
	}
}