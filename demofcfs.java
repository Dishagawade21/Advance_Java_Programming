import java.io.*;
import java.util.*;

class demofcfs
{
	public static void main (String args[])throws Exception
	{
		int n,arr[],p[],t[],sum=0;
		float add=0,add1=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter how many process=");
		n= Integer.parseInt(br.readLine());
		
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter burst time of process="+(i+1));
		arr[i]= Integer.parseInt(br.readLine());
		}


		p = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			p[i]=sum;
			sum=sum+arr[i];
		}
		
		for(int i=0;i<p.length;i++)
		{
			
			add=add+p[i];
		}
		System.out.println("average waiting time="+(add/n));


		t = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			t[i]=p[i]+arr[i];
		}
		
		for(int i=0;i<t.length;i++)
		{
			
			add1=add1+t[i];
		}
		System.out.println("turnaround time="+(add1/n));

}
}