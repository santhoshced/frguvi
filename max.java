package main1;
import java.util.Scanner;
import java.util.ArrayList;  
class max
{
	public static void main(String args[])
	{
		int m[][]=new int[20][20];
		ArrayList<Integer> cz=new ArrayList<Integer>();
		ArrayList<Integer> x=new ArrayList<Integer>();
		System.out.println("enter the no.of rows and coloumn");
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		System.out.println("enter the matrix");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.println("row["+i+"]coloumn["+j+"]");
			    m[i][j]=n.nextInt();
			}
		}
			
		System.out.println("the matrix is");
		for(int k=0;k<a;k++)
		{
		 for(int l=0;l<a;l++)
		 {
			 System.out.print(m[k][l]+"\t");
		     
		 }
		System.out.println();
		}
		
	
	System.out.println("the result is");
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<a;j++)
		{
			if(m[i][j]==0)
				
			{
				cz.add(i);
			    x.add(j);		
			}
			   
		}
	}		
			
	for(int i=0;i<cz.size();i++)
	{
	    int ml=cz.get(i);
	    int pl=x.get(i);
	    for(int j=ml;j<=ml;j++)
	   {
		   for(int d=0;d<a;d++)
		   {
			   m[j][d]=0;
		   }
	   }
	
	    for(int j=pl;j<=pl;j++)
	    {
	    	for(int d=0;d<a;d++)
	    	{
	    		m[d][j]=0;
	    	}
	    }
	}
	
	    
	    for(int h=0;h<a;h++)
	{
		for(int g=0;g<a;g++)
		{
			System.out.print(m[h][g]);
			
		}
	System.out.println();
	}
	
	
}}			
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	