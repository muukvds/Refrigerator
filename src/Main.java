public class Main {
    public static void main(String[] args)
    {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.addToVegetableDrawer(new FoodItem("bloemkool","vegetable",1.5));
        refrigerator.addToVegetableDrawer(new FoodItem("brokoli","vegetable",1));
        refrigerator.addToVegetableDrawer(new FoodItem("kool","vegetable",0.7));

        refrigerator.addToRefrigerator(new FoodItem("aardappel","vegetable",1));
        refrigerator.addToRefrigerator(new FoodItem("cola","drink",1.5));
        refrigerator.addToRefrigerator(new FoodItem("sinas","drink",1.5));
        refrigerator.addToRefrigerator(new FoodItem("biefstuk","meat",1.5));
        refrigerator.addToRefrigerator(new FoodItem("melk","drink",1.5));
        refrigerator.addToRefrigerator(new FoodItem("spinasie","vegetable",1.5));

        refrigerator.open();
        refrigerator.getDrinks();

    }
}