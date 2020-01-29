
public class Recipe {

	private String recipe;
    private String code;
    private String ingredient;
    private String prepareMode;
    private int quantity;
    private int time;
    private float price;
    
    public Recipe() {
		
	}
    
    public Recipe(Recipe recipe) {
    	this.code = recipe.code;
    	this.recipe = recipe.recipe;
    	this.ingredient = recipe.ingredient;
    	this.prepareMode = recipe.prepareMode;
    	this.quantity = recipe.quantity;
    	this.time = recipe.time;
    	this.price = recipe.price;
    }

	public Recipe(String recipe, String code, String ingredient, String prepareMode, int quantity, int time,
			float price) {
		super();
		this.recipe = recipe;
		this.code = code;
		this.ingredient = ingredient;
		this.prepareMode = prepareMode;
		this.quantity = quantity;
		this.time = time;
		this.price = price;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getPrepareMode() {
		return prepareMode;
	}

	public void setPrepareMode(String prepareMode) {
		this.prepareMode = prepareMode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return 	"\nCODE: " + this.code + "\n" +
				"RECIPE NAME: " + this.recipe + "\n" +
				"INGREDIENTS: " + this.ingredient + "\n" +
				"PREPARE MODE: " + this.prepareMode + "\n" +
				"PREPARE TIME: " + this.time + " MINUTES. " + "\n" +
				"PORTIONS: " +  this.quantity + "\n" +
				"UNIT PRICE: R$ " + String.format("%.2f", this.price) + "\n" +
				"-------------------------------------\n";
	}
	
}
