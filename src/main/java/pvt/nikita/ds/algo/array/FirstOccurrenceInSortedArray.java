package pvt.nikita.ds.algo.array;

/**
 * Given a sorted array A[] of integers where elements can be repeated like {1,2,2,2,2,2,3,4,4,5,5,5,5}
 * Given an element x, example x = 3. You need to find index where x first occurred in the array A.
 * If x doesn't exist in array A then return -1.
 * @author Nikita.Saroha
 *
 */
public class FirstOccurrenceInSortedArray {

	public static void main(String[] args) {
		int [] A = {1,1,1,2,2,2,4,4,5,5,5,5};
		System.out.println(getIndex(A,20));
	}
	
	public static int getIndex(int[] A, int x) {
		if(A.length == 0) return -1;
		if(A[A.length-1] < x) return -1;
		if(A[0] > x) return -1;
		if(A[0] == x) return 1;
		
		return searchX(A, x, 0, A.length-1);
	}

	private static int searchX(int[] A, int x, int i, int j) {
		while(i <= j) {
			if(A[i] == x) {
				return i+1;
			}
			int mid = (i+j+1)/2;
			if(A[mid] == x) {
				if(mid > i && A[mid-1] == x) {
					j = mid;
				}else {
					return mid+1;
				}
			}else if(A[mid] < x) {
				i = mid;
			}else if(A[mid] > x) {
				j = mid;
			}
		}
		return -1;
	}

}
