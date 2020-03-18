package pvt.nikita.ds.algo.puzzle;

/**
 * Given a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. 
 * You are given a number N, you have to print the number of integers less than N in the sample space S.
 * @author Nikita.Saroha
 *
 */
public class CountSquare {

	public static void main(String[] args) {
		System.out.println(countSquares(223));
		System.out.println(countSqrWithoutMath(223));
	}
	
	public static long countSquares(int n) {
		return (long)Math.sqrt(n-1);
	}
	
	public static long countSqrWithoutMath(int n){
	    int count = 0;
	    int num = 1;
	    while(num*num < n){
	        count++;
	        num++;
	    }
	    return count;
	}

}
