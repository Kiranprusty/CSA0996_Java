package day_2;
import java.util.*;
import java.io.*;
public class CompositeNumberCounter {
	    public static boolean isComposite(int num) {
	        if (num < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static int countCompositeNumbers(int[] arr) {
	        int count = 0;
	        for (int num : arr) {
	            if (isComposite(num)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        int[] arr = {4, 7, 9, 10, 11, 12};
	        int compositeCount = countCompositeNumbers(arr);
	        System.out.println("Number of composite numbers in the array: " + compositeCount);
	}
}
