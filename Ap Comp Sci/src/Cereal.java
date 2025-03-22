
public class Cereal {
    
    String name;
    char type;
    int calories;
    int protiens;
    int fat;
    int sodium;
    double fiber;
    double carbohydrates;
    int sugar;
    int potassium, vitiams, shelf;
    double weight; 
    double cups, rate;
	public Cereal(String n,char t, int cal, int pro,int f, int sod,double fib,
		    double carbo, int sug,int pota, int vit, int she,
		    double w, double c, double r)
	{
		 name=n;
		 type=t;
	     calories=cal;
	     protiens=pro;
	     fat=f;
	     sodium=sod;
	     fiber=fib;
	     carbohydrates=carbo;
	     sugar=sug;
	     potassium=pota; 
	     vitiams=vit; 
	     shelf=she;
	     weight=w; 
	     cups=c;
	     rate=r;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getProtiens() {
		return protiens;
	}
	public void setProtiens(int protiens) {
		this.protiens = protiens;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getSodium() {
		return sodium;
	}
	public void setSodium(int sodium) {
		this.sodium = sodium;
	}
	public double getFiber() {
		return fiber;
	}
	public void setFiber(double fiber) {
		this.fiber = fiber;
	}
	public double getCarbohydrates() {
		return carbohydrates;
	}
	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public int getPotassium() {
		return potassium;
	}
	public void setPotassium(int potassium) {
		this.potassium = potassium;
	}
	public int getVitiams() {
		return vitiams;
	}
	public void setVitiams(int vitiams) {
		this.vitiams = vitiams;
	}
	public int getShelf() {
		return shelf;
	}
	public void setShelf(int shelf) {
		this.shelf = shelf;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCups() {
		return cups;
	}
	public void setCups(double cups) {
		this.cups = cups;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
}
