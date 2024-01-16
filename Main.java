/*
Soham Kulkarni
22070126114
AIML B2
*/
class Main {
	public static void main(String args[]){
		System.out.println("Hello Everybody!! Welcome to the Calculator App!");
		displayMenu();
		UserInput input = new UserInput();
		Calculator calc = new Calculator();
		int choice = input.choice();
			switch (choice) {
				case 1:
					calc.addition();
					break;
				case 2:
					calc.subtraction();
					break;
				case 3:
					calc.multiplication();
					break;
				case 4:
					calc.division();
					break;
				case 5:
					calc.sumOfArray();
					break;
				case 6:
					calc.varianceOfArray();
					break;
				case 7:
					calc.stdDevOfArray();
					break;
			}
		}
	public static void displayMenu() {
        System.out.println("Select What you want to Do:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Sum of Array");
		System.out.println("6. Variance of Array");
        System.out.println("7. Standard Deviation of Array");
    }
}
