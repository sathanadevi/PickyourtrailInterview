package arraypackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * UniqueArray class is used to find the unique element in an arrayList and give the minimal sum of those elements.
 * @author sathanadevi
 */
public class UniqueArray {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of element in an array");
		n = scan.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> duplicate = new ArrayList<Integer>();
		System.out.println("Enter the " + n + " elements in an array");
		int sum=0;
		for(int i= 0 ; i< n;i++)
		{
			int value = scan.nextInt();
			if(set.contains(value))  
			{
				duplicate.add(value);
			}
			else
			{ 
				sum += value;
				set.add(value);
			}
		}
		Iterator<Integer> i = duplicate.iterator();
		while(i.hasNext())
		{
			int duplicatevalue = i.next();
			{
				while(set.contains(duplicatevalue))
				{
					duplicatevalue++;
				}
				set.add(duplicatevalue);
				sum += duplicatevalue;
			}
		}
		System.out.print(sum);
	}
}

