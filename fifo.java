import java.io.*;
import java.util.*;
class fifo
{
	public static void main (String args[])throws Exception
	{
		int n,a[],no,frame[],j,k,flage,count=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of pages=");
		n=Integer.parseInt(br.readLine());
		a= new int[50];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter pages =");
			a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter Frame number =");
		no=Integer.parseInt(br.readLine());
		frame= new int[50];
		
		for(int i=0;i<no;i++)
		{
			frame[i]=-1;

		}


		j=0;
		System.out.println("\t tref String \t page frames\n");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t\t");
			flage=0;
			for(k=0;k<0;k++)
			{
				if(frame[k]==a[i])
				flage=1;
				if(flage==0)
				{
					frame[j]=a[i];
					j=(j+1)%no;
					count++;
					for(k=0;k<no;k++)
					System.out.println(frame[k]+"\t\t");
				}

				System.out.println();
				
			}
			System.out.println("page fault="+count);
		}

	}
}