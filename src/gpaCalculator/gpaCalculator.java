package gpaCalculator;

import java.util.Scanner;

//3 methods 
//add, divide, main


public class gpaCalculator {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Scanner userInput2 = new Scanner(System.in);
		//import scanners
		
		System.out.println("Hello there user! Would you like to participate in a GPA Calculator? 1 for yes and 2 for no:");
		int answer = userInput.nextInt();
		
		if (answer == 1) {
			System.out.println("Awesome! Let's get started!");
		} else if (answer == 2) {
			System.out.println("Too bad, sorry, I'm doing it anyways- it's for a grade.");
		} else {
			System.out.println("Whatever you said was not an option- so I'm running this.");
		}
		//witty beginning
		
		
		
	
		System.out.println("How many grades would you like to calculate?: ");
		int amtGrade = userInput2.nextInt();
		double[] allGrades = new double[amtGrade]; 
		int x = 1;
		int total = 0;
		while (x <= amtGrade) {
			System.out.println("Please input your grade for class number " + x);
			double grades1 = userInput2.nextDouble();
			allGrades[total] =  grades1;
			x++;
			total++;
		}
		//this loop asks the user how many grades they want to calculate, then asks for the grades in those classes
		
		add(total, allGrades);
		//calls the add method
		
		float sum = add(total, allGrades);
		//calls the divide method 
		float average = divide(sum, amtGrade);
		System.out.println("Your average of your grades is " + average);
		System.out.println("Your grades as a GPA would be " + average/25);
		System.out.println("Remember that you can always do better. Go get some extra credit!!");
		userInput.close();
		userInput2.close();
		//closing the scanners
	}
	public static int add(int total, double[] allGrades) {
	System.out.println("These are your grades: ");
	int a = 0;
	int b = 0;
	while (a < total) {
		System.out.println(allGrades[a]);
		b += allGrades[a];
		a++;
		}
	return b;
	}
	//add method adds up all the grades 
	public static float divide(float sum, int amtGrade) {
		float average = sum/amtGrade;
		return average;
	}
	//the divide method finds the average and gives it back to when its called in the main method
}
//program by: Kara ho