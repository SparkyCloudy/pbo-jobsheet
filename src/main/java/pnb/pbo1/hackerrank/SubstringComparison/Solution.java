package pnb.pbo1.hackerrank.SubstringComparison;

import java.util.Scanner;

public class Solution {
	public Solution() {
        /* Enter your code here. Read input from STDIN. Print output to
        STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(Solution.getSmallestAndLargest(s, k));
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		for (int i = 1; i < s.length()-k+1; i++) {
			String sub = s.substring(i, k+i);
			if (sub.compareTo(smallest) < 0) {
				smallest = sub;
			} else if (sub.compareTo(largest) > 0) {
				largest = sub;
			}
		}
		return smallest + "\n" + largest;
	}
}
