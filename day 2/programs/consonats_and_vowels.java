package day_2;
import java.io.*;
import java.util.*;
public class consonats_and_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String a=s.nextLine();
		int i,j=a.length();
		System.out.println("the vowels are:");
		for(i=0;i<j;i++) {
			if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'
					||a.charAt(i)=='U'||a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'
					||a.charAt(i)=='o'||a.charAt(i)=='u') {
				System.out.print(a.charAt(i));
			}
		}
		System.out.println("\nthe consonats are:");
		for(i=0;i<j;i++) {
			if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'
					||a.charAt(i)=='U'||a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'
					||a.charAt(i)=='o'||a.charAt(i)=='u')
			 {
				continue;
			}
			else {
				System.out.print(a.charAt(i));
			}
		}
	}
}