package day_2;

import java.io.*;
import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of lines:");
		int n=s.nextInt();
		int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
	}
	}

}
