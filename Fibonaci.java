import java.io.*;
import java.util.*;

class Fibonaci{
	public static void main(String args[]){
		Command Line arguments
		// any value taken from the cmd line is in string so it needs to be parsed to be used as int.
		int number = Integer.parseInt(args[0]);
		 */

		Scanner
		Scanner sc = new Scanner(System.in); //scanner is used to take input DURING RUNTIME.
		System.out.println("Enter number.");
		int number=sc.nextInt();
		 */

		//BufferedReader: usually used to read files and bytes
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter number");
			int number = Integer.parseInt(reader.readLine()); //taking inputs from console so we need to parse.
			System.out.println("Fibonacci:");
			for (int i = 0; i < number; i++) {
				System.out.println(fibonacci(i));
			}
			}
		catch(IOException e){
			System.out.print(e);
		}
		 */

		//Taking input from the console
			System.out.println("Enter number");
			int number = Integer.parseInt(System.console().readLine());

			System.out.println("Fibonacci:");
			for (int i = 0; i < number; i++) {
				System.out.println(fibonacci(i));
			}
	}

	public static int fibonacci(int n){ //recursive method to find fibonacci series

		if (n <= 1){
			return n;
		}
		else{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}