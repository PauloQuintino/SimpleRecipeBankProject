import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char option = '0';
		RegistrationRecipe reg = new RegistrationRecipe();

		do {
			System.out.println("___MENU___");
			System.out.println();
			System.out.println("1) Register Recipes");
			System.out.println("2) Edit recipes");
			System.out.println("3) Recipe with less time to prepare");
			System.out.println("4) Portion quantity medium price");
			System.out.println("5) Portion prices");
			System.out.println("6) Recipes list with prices");
			System.out.println("7) Exit");
			System.out.println("--------------------------------------");
			System.out.print("Enter option: ");

			option = scan.next().charAt(0);

			switch (option) {
			case '1':
				System.out.println("--------REGISTER---------");
				reg.addRecipe();
				break;
			case '2':
				reg.displaySearch();
				break;
			case '3':
				reg.printTimeLess();
				break;
			case '4':
				reg.printMedianPrice();
				break;
			case '5':
				System.out.println("--------LIST OF PORTION PRICES---------");
				reg.printPortionPrices();
				break;
			case '6':
				System.out.println("--------LIST OF RECIPES---------");
				reg.print();
				break;
			case '7':
				System.out.println("Thank you!");
				break;
			default:
				System.out.println("Invalid Option!");
				break;
			}
		} while (option != '7');

		scan.close();
	}

}
