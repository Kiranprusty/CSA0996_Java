package day_2;
import java.io.*;
import java.util.*;
public class string_without_vowels {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String a=s.nextLine();
		int n=a.length();
		System.out.println("the string without vowels is");
		for(int i=0;i<n;i++) {
			if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'
					||a.charAt(i)=='U'||a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'
					||a.charAt(i)=='o'||a.charAt(i)=='u') {
				continue;
			}
			else {
				System.out.print(a.charAt(i));
			}
		}
	}

}