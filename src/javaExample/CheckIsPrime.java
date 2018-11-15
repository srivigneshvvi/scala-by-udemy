package javaExample;

public class CheckIsPrime {
	// Returns true if n is prime, else
	// return false.
	// i is current divisor to check.
	static boolean isPrime(int n, int i)
	{

		// Base cases
		if (n <= 2)
			{System.out.println("n<=2 = "+(n<=2));
			return (n == 2) ? true : false;
			}
		if (n % i == 0)
			{System.out.println("n % i = "+(n % i));
			return false;}
		if (i * i > n)
		{	System.out.println("i*i = "+(i*i));
			return true;
		}
		// Check for next divisor
		System.out.println("isPrime i= "+i);
		return isPrime(n, i + 1);
	}
	
	// Driver program to test above function 
	public static void main(String[] args)
	{

		int n = 17;

		if (isPrime(n, 2)) 
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
