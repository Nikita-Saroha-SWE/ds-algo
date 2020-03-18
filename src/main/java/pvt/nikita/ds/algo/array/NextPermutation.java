package pvt.nikita.ds.algo.array;

/**
 * Find next permutation of a number or string dictionary wise
 * Example, 5342, next is 5423
 * Example, 'nikita' next is 'niktai'
 * @author Nikita.Saroha
 *
 */
public class NextPermutation {

	public static void main(String[] args) {
		// Dictionary wise next permutation
		// # numbers array
		int[] input = {5,3,5,4,2};
		input = nextPermutation(input);
		for(int i=0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		char[] A = {'n','i','k','i','t','a'}; // niktai
		// String
		System.out.println(nextPermutation(A));
	}
	
	public static String nextPermutation(char[] input) {
		int i = input.length-2;
		
		while(i >=0 && input[i+1] <= input[i]) {
			i--;
		}
//		System.out.println(i);
		int j = input.length-1;
		while(j >=0 && input[j] <= input[i]) {
			j--;
		}
//		System.out.println(j);
		swap(input, i, j);
		int start = i+1;
		int end = input.length-1;
		while(start < end) {
			swap(input, start, end);
			start++;
			end--;
		}
		return new String(input);
	}
	
	public static int[] nextPermutation(int[] number) {
		int i = number.length-2;
		while(i >= 0 && number[i+1] <= number[i]) {
			i--;
		}
		
		int j = number.length-1;
		while (j>=i && number[j] <= number[i]) {
			j--;
		}
		// swap
		int temp = number[j];
		number[j] = number[i];
		number[i] = temp;
		
		// reverse decreasing sequence
		int left = i+1;
		int right = number.length-1;
		while(left < right) {
			swap(number, left, right);
			left ++;
			right--;
		}
		
		return number;
	}
	
	private static void swap(int[] A, int x, int y) {
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}
	
	private static void swap(char[] A, int x, int y) {
		char temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}
}
