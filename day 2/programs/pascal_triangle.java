package day_2;

import java.util.Scanner;
import java.io.*;
import java.util.*;
public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of lines:");
		int n=s.nextInt();
		for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int x = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }

}