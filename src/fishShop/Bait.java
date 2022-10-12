package fishShop;

public class Bait {
    private String fishFoodName;
    private String fishFoodBrand;
    private double howMuchİsfishFood;
	public Bait() {
		super();
	}
	public Bait(String fishFoodName, String fishFoodBrand, double howMuchİsfishFood) {
		super();
		this.fishFoodName = fishFoodName;
		this.fishFoodBrand = fishFoodBrand;
		this.howMuchİsfishFood = howMuchİsfishFood;
	}
	public String getFishFoodName() {
		return fishFoodName;
	}
	public void setFishFoodName(String fishFoodName) {
		this.fishFoodName = fishFoodName;
	}
	public String getFishFoodBrand() {
		return fishFoodBrand;
	}
	public void setFishFoodBrand(String fishFoodBrand) {
		this.fishFoodBrand = fishFoodBrand;
	}
	public double getHowMuchİsfishFood() {
		return howMuchİsfishFood;
	}
	public void setHowMuchİsfishFood(double howMuchİsfishFood) {
		this.howMuchİsfishFood = howMuchİsfishFood;
	}
}
