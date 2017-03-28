package main1;
import java.util.Scanner;
class two
{
	public static void main(String args[])
	{
		int a[]=new int[30];
		int f=0;
		System.out.println("enter the range");
		Scanner n=new Scanner(System.in);
		int d=n.nextInt();
		System.out.println("enter the numbers");
		for(int i=0;i<d;i++)
		{
		a[i]=n.nextInt();	
		}
	System.out.println("enter the target number");
	     int c=n.nextInt();
			
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(a[i]+a[j]==c)
				{
			
			System.out.println("the two numbers are"+a[i]+"and"+a[j]);
			       f=1;
				}   
				
			}
		
		}
	if(f==0)
	{
		System.out.println("no target achieved");
	}
	
	
	}
}