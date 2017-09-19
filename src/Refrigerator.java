public class Refrigerator {

    private FoodItem[] vegetableDrawer = new FoodItem[3];
    private FoodItem[] refrigeratorSpace = new FoodItem[7];

    private boolean isOn;


    public void switchOn()
    {
        isOn = true;
    }

    public void switchOF()
    {
        isOn =false;
        System.out.println("Refrigerator was on and is now turned of.");
    }
}
