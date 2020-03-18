package pvt.nikita.ds.algo.array;

/**
 * Given a string S of lowercase characters, find out whether the summation of 'X' and 'Y' is even or odd, 
 * where X is the count of characters which occupy even positions in english alphabets and have even frequency, 
 * and Y is the count of characters which occupy odd positions in english alphabets and have odd frequency.
 * 
 * Explanation:
 * Testcase1: Input : abbbcc ; Output: ODD; Reason : X=0 and Y=1 so (X+ Y) = ODD.
 * 'a' occupies 1st place(odd) in english alphabets and its frequency is odd(1), 
 * 'b' occupies 2nd position(even) but its frequency is odd(3) so it doesn't get counted , 
 * 'c' occupies 3rd position but its frequency is 2(even) so it also does't get counted.
 * 
 * Testcase2: Input : nobitaa ; Output: EVEN; Reason :  X=0 and Y=2 so (X+ Y)= EVEN.
 * 'n' occupies 14th position(even) in english alphabets but its frequency is odd(1) so it doesn't get counted. 
 * 'o' occupies 15th position and its frequency is odd(1). 
 * 'b' occurs at 2nd position(even) but its frequency is odd(1), 
 * 'i' occurs at 9th position(odd) and its frequency is also odd(1) and so on.
 * @author Nikita.Saroha
 *
 */
public class EvenOddFreqAlphabets {

	public static void main(String[] args) {
		System.out.println(printSummationIsOddOrEven("abbbcc"));
//		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(printSummationIsOddOrEven("nobitaa"));
	}
	
	public static String printSummationIsOddOrEven(String input) {
		char[] arry = input.toCharArray();
		
		int[] count = new int[26];
		// iterating over input array to find out position with frequency
		for(int i=0; i < arry.length; i++) {
			// finding out the index of ith char in input string and adding 1 to its frequency
			count[arry[i]-'a']++; 
		}
		int x = 0, y=0;
		// finding value of elegible X & Y
		// X elegibility - even position in count array and even occurrence in input string
		// Y elegibility - odd position in count array and odd occurrence in input string
//		StringJoiner join = new StringJoiner(",");
		for(int i=0; i < 26; i++) {
			if(count[i] > 0) {
//				join.add((char)(i+'a')+" - "+count[i]+" position "+(i+1)+", ");
				if(count[i]%2==0 && (i+1)%2==0) {
//					System.out.print((char)(i+'a')+" - "+count[i]+" even pos "+(i+1)+", ");
					x++;
				}else if(count[i]%2 == 1 && (i+1)%2 == 1) {
//					System.out.print((char)(i+'a')+" - "+count[i]+" odd pos "+(i+1)+", ");
					y++;
				}
			}
		}
//		System.out.println();
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(join.toString());
		if((x+y)%2==0) {
			return "EVEN";
		}else if( (x+y)%2 == 1){
			return "ODD";
		}else {
			return "MISTAKE";
		}
	}

}
