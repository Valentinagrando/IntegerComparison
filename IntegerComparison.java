import java.util.Scanner;

public class IntegerComparison {
	public static void main(String[] args) {
		Scanner scan;
		int answer1;
		int answer2;
		scan = new Scanner(System.in);
		System.out.print("What is your first number?");
		answer1 = scan.nextInt();
		System.out.print("What is your second number?");
		answer2 = scan.nextInt();
		System.out.println(compare(answer1,answer2));	
	}
	public static String compare(int a, int b){
		String comp;
		if (a>b)
			comp = a + " is greater than " + b + ".";
		else if (a<b)
			comp = a + " is less than " + b + ".";
		else
			comp = "These numbers have the same value!";
		return comp;
	}
}