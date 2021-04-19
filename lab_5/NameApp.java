package lab_5;

import java.util.Scanner;
public class NameApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name and Last name=");
		String first = sc.next();
		String last = sc.next();
		try {
			if(first==null || last==null)
			{
				throw new InvalidInputException("Exception");
			}
			System.out.println("Fullname is= "+first+" "+last);
		}
		catch(InvalidInputException e)
		{
			System.out.println("Re-enter the name correctly");
		}
	}

	}