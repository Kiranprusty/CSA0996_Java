package day_2;
import java.util.*;
import java.io.*;
public class char_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String a=s.nextLine();
		System.out.println("enter the character to be searched:");
		char x=s.next().charAt(0);
		int i=0,j=a.length();
		for(i=0;i<j;i++) {
			if(a.charAt(i)== x) {
				System.out.println(x+ " is found in string at index:" +i);
			}
		}
	}

}