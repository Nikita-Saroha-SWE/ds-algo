package pvt.nikita.ds.algo.maths;

import java.util.HashMap;
import java.util.Map;
/**
 * perfect squares needed so that sum of these perfect square is N.
	Example -
	perfect squares -- 1 4 9 16 25 36 .........
	Ex 1: N = 12
	ans =3 (4+4+4)
	Ex 2: N = 41
	ans =2 (25+16)
 * @author Nikita.Saroha
 * If you have improvement then please suggest.
 * 
 */
public class CountPerfSqForSumToN {

	public static void main(String[] args) {
		System.out.println(getCount(44));
	}
	
	
	public static int getCount(int n) {
		// to compare minimum count with sum returned
		int min = Integer.MAX_VALUE;
		// to store the sum which have already been checked
		Map<String, Integer> mapOfCounts =   new HashMap<String, Integer>();
		// to find the integer till we need to check squares with, example sqrt of 43 is 6.something, 
		//but integer 6 is the upper limit of perfect squares we need to check for.
		Double x = Math.floor(Math.sqrt(n)); 
		// top-down approach. from higher integer's square to lower interger's.
		while(x > 0) {
			int count = count(n,x.intValue(),mapOfCounts);
			// if count is less than curren minimum then replace minimum
			if(min > count) {
				min = count;
			}
			// To check combination with lower square
			x--;
		}
		return min;
	}
	// O(n!) time complexity. 
	public static int count(int number, int n,Map<String, Integer> mapOfCounts) {
		// if n=0 then we are not going to minus anything from our number so returning 0
		if(n == 0) {
			return 0;
		}
		// if we have already calculated this combination of integer and number than we do not need to loop or recurse 
		if(mapOfCounts.containsKey(number+"-"+n)) {
			return mapOfCounts.get(number+"-"+n);
		}
		int count = 0;
		// subtracting the perfect square
		int diff = number - (n*n);
		// if difference is 0, then we have found the last number to be subtracted to make number
		if(diff == 0) {
			return 1;
		}
		// if difference is negative, then we do not include current integer and try with the next lower perfect square recursively.
		if (diff < 0){
			count += count(number, n-1,mapOfCounts);
			mapOfCounts.put(number+"-"+n, count);
		}else {
			// again checking minimum value because, we if we do not we will not get the minimum count but second bigger.
			// for example number is 43, 43-(5^2) = 18. Now 18 is combination of 2 (3^2), making count=3 but if we do not do the while loop below
			// we get 43-(5^2) = 18 and then 18 - (4^2) = 2 then 1 & 1, making count = 4
			// so next time if we encounter same number with same integer, then we already have min count and need not to check
			int min = Integer.MAX_VALUE;
			while(n > 0) {
				count++;
				count+= count(diff, n,mapOfCounts);
				
				if(min > count) {
					min = count;
					mapOfCounts.put(number+"-"+n, min);
				}
				count = 0;
				n--;
			}
			count = min;
		}
		
		return count;
	}
	
}
