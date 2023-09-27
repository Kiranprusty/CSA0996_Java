package day_2;
import java.io.*;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the symbol:");
		String x=s.nextLine();
		System.out.println("enter the no of lines:");
		int n=s.nextInt();
		int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
        for (i = n; i >1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

	}