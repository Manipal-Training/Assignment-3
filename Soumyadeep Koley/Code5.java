import java.util.Scanner;
public class Code5 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size ");
		int m=sc.nextInt();
		System.out.println("Enter column size ");
		int n=sc.nextInt();
		int[][] a=new int[m][n];
		System.out.println("Enter elements ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			int max=0,min=999999999;
			for(int j=0;j<n;j++) {
				if (a[i][j]>max) {
					max=a[i][j];
				}
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
			System.out.println("The minimum and maximum in"+(i+1)+"th row is "+min+","+max);
		}
		for(int j=0;j<n;j++) {
			int max=0,min=999999999;
			for(int i=0;i<n;i++) {
				if (a[i][j]>max) {
					max=a[i][j];
				}
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
			System.out.println("The minimum and maximum in"+(j+1)+"rd column is "+min+","+max);
		}
	}
}
