package pvt.nikita.ds.algo.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {29, 10 , 14, 37, 13};
		selectionSort(arr);
		print(arr);
	}
	
	public static void selectionSort(int [] input) {
		int n = input.length;
		for(int i = n-1; i >= 1; i--) {
			int k = 0;
			for( int j=1; j <=i; j++) {
				if(input[j] > input[k]) {
					k = j;
				}
			}
			swap(input, i, k);
		}
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
