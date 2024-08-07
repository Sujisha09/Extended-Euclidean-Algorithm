/**Extended Euclidean Algorithm is extension of Euclidean ALgorithm
 * it finds the GCD along with coefficients
 * that represent the linear combination of two numbers resulting in the GCD.
 */
package assignments;

import java.util.Scanner;

/**
 * @author devin
 *
 */
//import java.util;
public class ExtendedEuclideanAlgo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,n,res;
		
		Scanner scanner=new Scanner(System.in);
		//enter values of x and n
        System.out.print("Enter the value of x: ");
        x = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();
        //calling gcd function and assigning returned value to res
        res=inv(x,n);
        //printing result
        if(res!=-1)System.out.print("gcd("+x+","+n+") is "+res);
        else
        	System.out.print("Inverse does not exist");
        scanner.close();//closing scanner obj
	}

	private static int inv(int x, int n) {
		// TODO Auto-generated method stub
		int a = n,p0 = 0, p1 = 1;
		while (x!=0) {
			int qtn=a/x;
			int rem=a%x;
			
			int temp=(p0-p1*qtn);
			
			p0=p1;
			
			p1=temp;
			a = x;
            x = rem;
            
		}
		if (a != 1) {
			
			 return -1;
	        }
		  if (p0 < 0) {
		        p0 += n; // Add 'n' to ensure a positive result
		    }
		
		return p0;
        
	    }

}
