package day_1;
import java.io.*;
import java.util.*;
public class Username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username:");
		String j1=s.nextLine();
		System.out.println("Enter your username:");
		String j2=s.nextLine();
		if(j2.contentEquals(j1))
		{
			System.out.println("Username is valid");
		}
		else {
			System.out.println("Username is not Valid");
		}
	}

}
