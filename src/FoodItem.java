public class FoodItem {

    private String name;
    private String typeOfFood;
    private double weight;


    public FoodItem(String name, String typeOfFood, double weight) {
        setTypeOfFood(typeOfFood);
        this.name = name;
        this.weight = weight;
    }

    public void setTypeOfFood(String typeOfFood) {
        if(typeOfFood.equals("vegetable")||typeOfFood.equals("drink")||typeOfFood.equals("meat")) {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public double getWeight() {
        return weight;
    }

    public void print()
    {
        System.out.println( name+", type: "+ typeOfFood+" gewicht: "+ weight);
    }
}
