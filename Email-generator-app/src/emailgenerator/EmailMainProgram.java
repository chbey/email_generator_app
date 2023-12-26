package emailgenerator;

import java.util.Scanner;

public class EmailMainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Name: ");
		String first_name=sc.nextLine();
		
		System.out.println("Enter Your Last Name: ");
		String last_name=sc.nextLine();
		EmailBackProgram email = new EmailBackProgram(first_name, last_name);
		System.out.println(email.showInfo());

	}

}
