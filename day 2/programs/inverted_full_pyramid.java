package day_2;
import java.io.*;
import java.util.*;

public class inverted_full_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of lines:");
		int n=s.nextInt();
		int i, j;
        for (i = n; i >0; i--) {
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = i; j >1; j--) {
                System.out.print("* ");
            }
            System.out.println();
	}

}
}