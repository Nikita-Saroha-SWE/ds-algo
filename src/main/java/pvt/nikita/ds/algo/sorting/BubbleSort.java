package pvt.nikita.ds.algo.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Average case!");
		int[] arr = {20, 5 , 3, 7, 8};
		sort(arr);
		print(arr);
		System.out.println();
		int[] arry = {20, 5 , 3, 7, 8};
		improvedBubbleSort(arry);
		print(arry);
		System.out.println();
		int f[] = {20, 5 , 3, 7, 8};
		fraudSort(f);
		print(f);

	}
	// Complexity O(n^2) for all cases
	public static int[] sort(int[] arr) {
		int size = arr.length;
		int compareCount = 0;
		int swapCount = 0;
		for(int i = size-1; i > 0; i--) {
			for(int j = 0; j <= i-1; j++) {
				compareCount++;
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					swapCount++;
				}
			}
		}
		System.out.println("sort :: Total number of comparisons -"+compareCount);
		System.out.println("sort :: Total number of swaps -"+swapCount);
		return arr;
	}
	// this will keep track of last swap by j and update its position in i
	public static int[] improvedBubbleSort(int[] arr) {
		int size = arr.length;
		int k = 0;
		int compareCount = 0;
		int swapCount = 0;
		for(int i= size-2; i > 0;) {
			for(int j= 0; j <= i; j++) {
				compareCount++;
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					swapCount++;
					k=j;
				}
			}
			i = k-1;
		}
		System.out.println("improvedBubbleSort :: Total number of comparisons -"+compareCount);
		System.out.println("improvedBubbleSort :: Total number of swaps -"+swapCount);
		return arr;
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
	}
	
	// this claims O(n) but it isn't
	public static void fraudSort(int arr[]) {
		int compareCount = 0;
		int swapCount = 0;
		for(int j = 0; j < arr.length-1; j++) {
			compareCount++;
			//Checking the condition for two simultaneous elements of the array
			if(arr[j] > arr[j+1]) {
				//swapping the elements
				swap(arr, j, j+1);
				// updating value of j = -1
				// so after getting updated for j++ in the loop it becomes 0
				// and the loop begins from the start
				j = -1;
				swapCount++;
			}
		}
		System.out.println("Himanshu's method :: Total number of comparisons -"+compareCount);
		System.out.println("Himanshu's method :: Total number of swaps -"+swapCount);
	}
}
