package day_2;

import java.util.Scanner;

public class matrix_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the matrix:");
		int n=s.nextInt();
		System.out.println("enter the matrix1 elements:");
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter the matrix2 elements:");
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		int c[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
					c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.print("the final matrix is:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
					System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}