import java.io.*;
import java.util.*;
import java.lang.*;
class Calculator {
	public static void addition() {
		UserInput input = new UserInput();
		System.out.println("Enter First Number: ");
		int num1 = input.num();
		System.out.println("Enter Second Number: ");
		int num2 = input.num();
		int add = num1 + num2;
		System.out.println("The Sum of " + num1 + " and " + num2 + " is: " + add);
	}
	public static void subtraction() {
		UserInput input = new UserInput();
		System.out.println("Enter First Number: ");
		int num1 = input.num();
		System.out.println("Enter Second Number: ");
		int num2 = input.num();
		int sub = num1 - num2;
		System.out.println("The Subtraction of " + num2 + " from " + num1 + " is: " + sub);
	}
	public static void multiplication() {
		UserInput input = new UserInput();
		System.out.println("Enter First Number: ");
		int num1 = input.num();
		System.out.println("Enter Second Number: ");
		int num2 = input.num();
		int mul = num1 * num2;
		System.out.println("The Multiplication of " + num1 + " and " + num2 + " is: " + mul);
	}
	public static void division() {
		UserInput input = new UserInput();
		System.out.println("Enter First Number: ");
		int num1 = input.num();
		System.out.println("Enter Second Number: ");
		int num2 = input.num();
		int div = num1/num2;
		System.out.println("The Division of " + num1 + " by " + num2 + " is: " + div);
	}
	public static void sumOfArray() {
		UserInput input = new UserInput();
		int[] array = input.inputArray();
		int sum = 0;
		for(int i = 0 ; i < 5 ; i++) {
			sum = sum + array[i];
		}
		System.out.println("The Sum of the Array is: " + sum);
	}
	public static void varianceOfArray() {
		UserInput input = new UserInput();
		int[] array = input.inputArray();
		int mean = 0;
		for(int i = 0 ; i < 5 ; i++) {
			mean = mean + array[i];
		}
		mean = mean / 5;
		int deviation=0;
		int temp;
		for(int i = 0 ; i < 5 ; i++) {
			temp = array[i] - mean;
			deviation = deviation + (temp * temp);
		}
		int variance = deviation / 5;
		System.out.println("The Variance of the Array is: " + variance);
	}
	public static void stdDevOfArray() {
		UserInput input = new UserInput();
		int[] array = input.inputArray();
		int mean = 0;
		for(int i = 0 ; i < 5 ; i++) {
			mean = mean + array[i];
		}
		mean = mean / 5;
		double deviation=0;
		int temp;
		for(int i = 0 ; i < 5 ; i++) {
			temp = array[i] - mean;
			deviation = deviation + (temp * temp);
		}
		double variance = deviation / 5;
		double stddev = Math.sqrt(variance);
		System.out.println("The Standard Deviation of the Array is: " + stddev);
	}
}