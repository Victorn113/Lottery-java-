import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Lab5a {
	static int size=5;
	static int user[]=new int[size];
	 static int lottery[]=new int[size];
	
	int gneratedNums;
	int match_count=0;
	
	public static void inputNumbers() throws NumberFormatException, IOException
	{
		BufferedReader cin;
		cin=new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int j=0;j<size;j=j+1)
		{
		System.out.println("Please enter a number");
		
		
		user[j]=Integer.parseInt(cin.readLine());
		if(user[j]>=10) user[j]=0;
	
		System.out.println("You have chosen:");
		System.out.print(user[j]);
		
		
	}}
	public static void Generate()
	{
		
		Random rnd=new Random(System.currentTimeMillis());
		for(int i=0;i<size;i=i+1)
		{
			lottery[i]=0+rnd.nextInt(10-0+1);
			
			System.out.print(lottery[i]);
			System.out.print(" ");
		}
		
	}
	public static void arraysEqual()
	{
		int matchcounter=0;
		for(int i=0;i<size;i=i+1)
		{
			if(user[i]==lottery[i])
			{
				System.out.print("Match at ");
				System.out.print(i);
				System.out.print(" of number ");
				System.out.print(user[i]);
				
			}
		}
	}
	public static void winning()
	{
	for (int n=0;n<size;n=n+1)
	{
		System.out.print("The winning numbers are: ");
		System.out.print(lottery[n]);
		
	}
	}
	public static void main(String[] argv) throws NumberFormatException, IOException
	{
		inputNumbers();
		Generate();
		arraysEqual();
		winning();
	}

}
