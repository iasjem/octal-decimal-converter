
/*
 * A simple program that converts octal to decimal and vice versa
 * Please see other comments on project for more information about program
 */

import java.util.Scanner;

public class MainSrc {

	public static void main(String[] args) {

		System.out.println("Octal-Decimal Converter by IasJem\n");
		// Convert Decimal to Octal using Repeated Division-by-8 method :
		// http://www.robotroom.com/NumberSystems3.html
		convertDecimal convertDecimal = new convertDecimal();
		int getDecimal;

		System.out.print("Enter a decimal: ");
		Scanner decimal = new Scanner(System.in);
		getDecimal = decimal.nextInt();

		convertDecimal.getDecimal(getDecimal);

		System.out.print("\n");

		// Convert Octal to Decimal
		// http://www.robotroom.com/NumberSystems4.html
		convertOctal convertOctal = new convertOctal();
		int getOctal;
		Scanner octal = new Scanner(System.in);

		System.out.print("Enter an octal number: ");
		getOctal = octal.nextInt();

		convertOctal.getOctal(getOctal);

		octal.close();
		decimal.close();
	}

}
