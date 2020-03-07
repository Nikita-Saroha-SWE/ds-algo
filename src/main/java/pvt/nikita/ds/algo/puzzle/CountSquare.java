package pvt.nikita.ds.algo.puzzle;

public class CountSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSquares(223));
		System.out.println(naiveCountSquares(223));
	}
	
	public static long countSquares(int n) {
		return (long)Math.sqrt(n-1);
	}
	
	public static long naiveCountSquares(int n){
	    int count = 0;
	    int num = 1;
	    while(num*num < n){
	        count++;
	        num++;
	    }
	    return count;
	}

}
