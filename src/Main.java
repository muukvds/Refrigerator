public class Main {
    public static void main(String[] args)
    {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.addToVegetableDrawer(new FoodItem("bloemkool","vegetable",1.5));
        refrigerator.addToVegetableDrawer(new FoodItem("brokoli","vegetable",1));
        refrigerator.addToVegetableDrawer(new FoodItem("kool","vegetable",0.7));
        refrigerator.addToVegetableDrawer(new FoodItem("aardappel","vegetable",1));

        refrigerator.addToRefrigerator(new FoodItem("cola","drinks",1.5));
        refrigerator.addToRefrigerator(new FoodItem("sinas","drinks",1.5));

        refrigerator.open();
        refrigerator.getDrinks();

    }
}