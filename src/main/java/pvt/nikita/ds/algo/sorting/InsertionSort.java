package pvt.nikita.ds.algo.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {29, 10 , 14, 37, 13};
		insertionSort(arr);
		print(arr);
	}
	/*
	 * indxes 	1	2	3	4	5
		 		29	10	14	37	13	t=10; i=2; j=1
				10	29 	14	37	13 	t = 14; i = 3; j = 2
				10	14	29	37	13	t=37; i=4; j=3
				10	14	29	37	13	t=13; i=5; j=4	
				10 	13	14	29	37
	 */
	public static void insertionSort(int [] input) {
		for(int i=1; i < input.length; i++) {
			int temp = input[i];
			int j = i -1;
			while(j > -1 && temp < input[j] ) {
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = temp;
		}
	}
	
	public static void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
