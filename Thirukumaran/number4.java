import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n,m,temp1 = 0,temp2 = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ARUNS dice number :");
		n=sc.nextInt();
		int arun[]= new int[n];
		
		for(int i=0; i<arun.length; i++) {
			System.out.println("Enter the element"+i);
			arun[i]=sc.nextInt();
			
		}
	    m=n;
		int naveen[]= new int[m];
		System.out.println("Enter the NAVEENS dice number :");
		n=sc.nextInt();
		int naveen1[]= new int[n];

		
		for(int j=0; j<naveen1.length; j++) {
			System.out.println("Enter the element"+j);
			naveen1[j]=sc.nextInt();
			}
		
		for(int i=0; i<arun.length; i++) {
			temp1=temp1+arun[i];
			
		}
		for(int j=0; j<naveen1.length; j++) {
			temp2=temp2+naveen1[j];
			}
		
		if(temp1<temp2) {
			System.out.println("Arun wins!");
			
		}
		else {
			System.out.println("Naveen wins!");
		}
	

	}
