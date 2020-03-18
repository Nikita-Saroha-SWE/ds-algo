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
		System.out.println();
		System.out.println(Math.round(Math.sqrt(16)));
	}
	
	public static void print(int n) {

        StringBuilder sb = new StringBuilder();
        int m = n*n;
        int max = m;
        int num = n+1;
        int k = n;
        
        while(m > 0){
            
            if(m%k ==0){
                num--;
                sb.append(num);
            }else{
                sb.append(num);
            }
            if(m==1){
                m = max -n;
                max = m;
                num = n+1;
                k--;
                sb.append("$");
            }
            else{
                m--;
            }
        } 
        //2 2 1 1 $2 1 $
         System.out.print(sb);
         
	}

}
