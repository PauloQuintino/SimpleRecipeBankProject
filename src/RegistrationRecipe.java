import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class RegistrationRecipe {

	public ArrayList<Recipe> list = new ArrayList<Recipe>();
	public Recipe recipe;
	Scanner sc = new Scanner(System.in);

	public ArrayList<Recipe> getList() {
		return list;
	}

	public void setList(ArrayList<Recipe> list) {
		this.list = list;
	}

	public RegistrationRecipe() {
		list = new ArrayList<Recipe>();
	}

	public void cadastrarRec(Recipe recipe) {
		getList().add(recipe);
	}

	public int getSize() {
		return list.size();
	}

	public Recipe search(String code) {
		
		Iterator<Recipe> iterator = list.iterator();
		while (iterator.hasNext()) {
			Recipe rec = iterator.next();
			if (rec.getCode().equals(code)) {
				return rec;
			}
		}
		return null;
	}

	public void addRecipe() {
		String name;
		String code;
		String ingredient;
		String prepareMode;
		int quantity;
		int time;
		float price;
		Recipe foundItem;

		sc.useDelimiter("\\n");

		System.out.print("Enter recipe code: ");
		code = sc.next();
		foundItem = search(code);

		if (foundItem == null) {
			System.out.print("Enter recipe name: ");
			name = sc.next();
			System.out.print("Enter ingredients: ");
			ingredient = sc.next();
			System.out.print("Enter prepare mode: ");
			prepareMode = sc.next();
			System.out.print("Enter quantity of portion: ");
			quantity = sc.nextInt();
			System.out.print("Enter time to prepare: ");
			time = sc.nextInt();
			System.out.print("Enter unit price: ");
			price = sc.nextFloat();

			Recipe recipe = new Recipe(name, code, ingredient, prepareMode, quantity, time, price);
			list.add(recipe);

		} else {
			System.out.println("This recipe already exists!");
		}

	}

	public void displaySearch() {

		String code;
		Recipe foundRecipe;

		System.out.println("Enter Recipe code:");
		code = sc.next();
		foundRecipe = search(code);

		System.out.println("RECIPE\n: ");

		if (foundRecipe != null) {
			foundRecipe.toString();
		} else if (foundRecipe == null) {
			System.out.println("Register not found or do not exist in database!");
		}
	}

	public void print() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list);
		}
	}

	public void printTimeLess() {
		Recipe recipe = Collections.min(list, Comparator.comparing(s -> s.getTime()));
		System.out.println("Recipe with less time of preparation is: " + "\nName: " + recipe.getRecipe()
				+ "\nTime of preparation: " + recipe.getTime() + " minutes.");
	}

	public void printMedianPrice() {
		double median = 0;
		double sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getPrice();
		}

		for (int j = 0; j < list.size(); j++) {
			median = sum / list.size();
		}
		System.out.println("Sum of all prices is: R$ " + String.format("%.2f", sum));
		System.out.println("Medium price of all recipe is: R$ " + String.format("%.2f", median));

	}

	public void printPortionPrices() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(
					"Name: " + list.get(i).getRecipe() + " | R$ " + String.format("%.2f", list.get(i).getPrice()));
		}
	}
}
