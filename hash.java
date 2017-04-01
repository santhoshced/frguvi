import java.util.Scanner;
class hash
{
	public static void main(String args[])
	{
		System.out.println("enter the range");
	    Scanner n=new Scanner (System.in);
	    int d;
	    int a=n.nextInt();
	    int b[]=new int[a];
	    int f[]=new int[a];
	    System.out.println("enter the number");
	    for(int i=0;i<a;i++)
	    {
	    	b[i]=n.nextInt();
	    }
	for(int i=0;i<a;i++)
		{
	      d=1;
		for(int j=0;j<a;j++)
	       {     	
		if(i!=j)
		{
			d=d*b[j];
		}
		 
	    } 
			
	   f[i]=d;
		}
	System.out.println("the output array is");
	for(int k=0;k<a;k++)
	System.out.println(f[k]);
  }
}