package day_2;
import java.io.*;
import java.util.*;
public class merge_two_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the 1st array:");
		int x=s.nextInt();
		System.out.println("enter the input of 1st array:");
		int a[]=new int[x];
		for(int i=0;i<x;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the size of the 2nd array:");
		int y=s.nextInt();
		System.out.println("enter the elements of the 2nd array:");
		int b[]=new int[y];
		for(int j=0;j<y;j++) {
			b[j]=s.nextInt();
		}
		int c[]=new int[x+y];
		System.arraycopy(a, 0, c, 0, x);
        System.arraycopy(b, 0, c, x, y);
        System.out.println(Arrays.toString(c));
	}

}