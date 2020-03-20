package pvt.nikita.ds.algo.maths;
/**
 * You a given a number N. You need to print the pattern for the given value of N.
	for N=2 the pattern will be 
	2 2 1 1
	2 1
	for N=3 the pattern will be 
	3 3 3 2 2 2 1 1 1
	3 3 2 2 1 1
	3 2 1
 * @author Nikita.Saroha
 *
 */
public class PrintThePattern221121 {

	public static void main(String[] args) {
		print(4);
	}
	
	public static void print(int n) {
		// StringBuilder object to store our pattern
        StringBuilder sb = new StringBuilder();
        // m is going to store the maximum length at each iteration. 
        // So if n=4 for 1st it is m=n*n=4*4=16 , for subsequent iterations (m = m- n) up to m > 0. 
        int m = n*n;
        // to control number of iterations
        int max = m;
        // To handle base cases like 16%4 = 0 or 12%4=0, the point where the number that is decremented is handled
        int num = n+1;
        // to decide which value should be printed and when it should be decremented to next value
        int k = n;
        
        while(max > 0){
            // if mode is 0 that means a fresh start or new decremented number
            if(m%k ==0){
            	// because fresh start is done using n+1, example 4+1 is 5 and 16%4 is zero so we need to print 4, 
            	//then when 12%4 is 0 then print 3
                num--;
                sb.append(num);
            }else{
                sb.append(num);
            }
            // number of time a number is printed is changed here along with k, so next k=3 and 3 times a number is printed
            if(m==1){
                m = max -n;
                max = m;
                num = n+1;
                k--;
                sb.append("$");
            }
            else{ // to keep printing count (m) 16$12$8$4$ and repetitions of the numbers in (k) 4$3$2$1 time then 
                m--;
            }
        } 
        //2 2 1 1 $2 1 $
         System.out.print(sb);
         
	}

}
