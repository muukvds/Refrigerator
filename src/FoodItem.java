public class FoodItem {

    private String name;
    private String typeOfFood;
    private double weight;

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
