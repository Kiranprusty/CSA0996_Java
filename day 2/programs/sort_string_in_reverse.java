package day_2;
import java.io.*;
import java.util.*;
public class sort_string_in_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String a=s.nextLine();
		char temp[]=a.toCharArray();
		String sortedstring;
		int n=temp.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(temp[i]<temp[j])
				{
					char temps=temp[i];
					temp[i]=temp[j];
					temp[j]=temps;
				}
			}
		}
		sortedstring= new String(temp);
		System.out.print("sorted string is "+sortedstring);
	}
}