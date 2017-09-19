public class Refrigerator {

    private FoodItem[] vegetableDrawer = new FoodItem[3];
    private FoodItem[] refrigeratorSpace = new FoodItem[7];

    private boolean isOn;


    public void switchOn() {
        isOn = true;
    }

    public void switchOF() {
        isOn = false;
        System.out.println("Refrigerator was on and is now turned of.");
    }

    public void addToVegetableDrawer(FoodItem foodItem) {
        if (foodItem.getTypeOfFood().equals("vegetable")) {
            for (int i = 0; i < vegetableDrawer.length; i++) {
                if (vegetableDrawer[i] != null) {
                    vegetableDrawer[i] = foodItem;
                    break;
                }
            }
        } else {
            System.out.println("Can only add vegetable.");
        }
    }
}
