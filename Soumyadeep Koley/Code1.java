import java.util.*;
public class Code1
{
	public static void main(String[] args) 
  {
		int count=0,unique=0,q=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int n=sc.nextInt();
		int a[]=new int[100];
		int b[]=new int [100];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(a[i]==a[j])
			{
				count++;
				break;
			}
		 }
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(b[i]==b[j])
				{
					unique++;
					q=unique-1;
					break;
				}
			}
	}
		System.out.println("Number of Duplicates : "+count);
		System.out.println("Number of Unique: "+q);
}
}
