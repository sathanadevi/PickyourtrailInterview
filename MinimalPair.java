package minimalpair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/**
 * MinimalPair class is used to find the distinct pair in the list. 
 * @author sathanadevi
 */
public class MinimalPair {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		Arrays.sort(array);
		int count = 0;
		HashMap<String, String> uniqmap = new HashMap();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (!uniqmap.containsKey(array[i] + "," + array[j])) {
					int a = array[i];
					int b = array[j];
					if (a <= b) {
						if (a + k == b) {
							count++;
						}
					} else {
						break;
					}
					uniqmap.put(array[i] + "," + array[j], "");
				}
			}
		}
		System.out.println(count);
	}
}