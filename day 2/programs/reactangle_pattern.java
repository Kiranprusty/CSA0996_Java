package day_2;
import java.io.*;
import java.util.*;
public class reactangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the symbol:");
		String n=s.nextLine();
		System.out.println("enter the length:");
		int l=s.nextInt();
		System.out.println("enter the width:");
		int w=s.nextInt();
		int i, j;
        for (i = 0; i < l; i++) {
            for (j = 0; j < w; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }

	}