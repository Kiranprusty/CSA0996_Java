package day_1;
import java.io.*;
import java.util.*;
public class Noofvow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String j=s.nextLine();
		int i,l=j.length(),count=0;
		for(i=0;i<l;i++)
		{
			if(j.charAt(i)=='a' || j.charAt(i)=='e'|| j.charAt(i)=='i' || j.charAt(i)=='o' || j.charAt(i)=='u') 
			{
				count=count+1;								
			}
		}
		System.out.println(count);
	}

}