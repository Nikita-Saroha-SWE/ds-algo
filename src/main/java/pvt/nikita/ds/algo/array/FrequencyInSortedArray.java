package pvt.nikita.ds.algo.array;

/**
 * Given a sorted array A[] of integers where elements can be repeated like {1,1,1,2,2,2,3,4,4,5,5,5,5}
 * Given an element x, example x = 3. You need to find count of x in array.
 * If x doesn't exist in array A then return -1.
 * @author Nikita.Saroha
 *
 */
public class FrequencyInSortedArray {

	public static void main(String[] args) {
		int [] A = {1,1,1,2,2,2,4,4,5,5,5,5};
		int result = getCount(A, 4);
		System.out.println(result == 0? -1 : result);
	}
	
	public static int getCount(int A[], int x) {
		if(A.length == 0) return -1;
		if(A[A.length -1] < x) return -1;
		if(A[0] > x) return -1;
		return searchX(A, x, 0, A.length-1);
	}
	
	public static int searchX(int A[], int x, int start, int end) {
		if(start <= end) {
			if(A[start] == x && A[end] == x) {
				return end-start +1;
			}
			int mid = (start+end+1)/2;
			int sum = 0;
			if(A[mid] == x) {
				if(mid+1 <= end && A[mid+1] == x)
					sum += searchX(A, x, mid, end);
				if(mid-1 >= start && A[mid-1] == x)
					sum += searchX(A , x, start , mid-1);
			}else if(A[mid] < x) {
				sum += searchX(A, x, mid+1, end);
			}else if(A[mid] > x) {
				sum += searchX(A , x, start , mid-1);
			}
			return sum;
		}else {
			return 0;
		}
		
	}

}
