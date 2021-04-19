package lab_5;

import java.util.Scanner;

public class AgeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try {
			if(age > 15) {
				System.out.println("age of the person is above 15");
			}
			else {
				throw new AgeException("age of person is below 15");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}