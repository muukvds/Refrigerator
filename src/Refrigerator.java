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
        boolean vegetableAdded = false;
        if (foodItem.getTypeOfFood().equals("vegetable")) {
            for (int i = 0; i < vegetableDrawer.length; i++) {
                if (!vegetableAdded) {
                    if (vegetableDrawer[i] != null) {
                        vegetableDrawer[i] = foodItem;
                        vegetableAdded = true;
                    }
                }
            }
        } else {
            System.out.println("food item not added");
        }
        if(!vegetableAdded)
        {System.out.println("food item not added");}
    }

    public void addToRefrigerator(FoodItem foodItem) {
        boolean foodAdded = false;
        double weight =0;
            for (int i = 0; i < refrigeratorSpace.length; i++) {
                if (!foodAdded) {
                    if (refrigeratorSpace[i] != null) {
                        if(weight + foodItem.getWeight() < 17)
                        {
                            refrigeratorSpace[i] = foodItem;
                            foodAdded = true;
                        }
                        else{
                            System.out.println("food over weight");
                        }
                    }
                    else{ weight += refrigeratorSpace[i].getWeight();}
                }
            }

        if(!foodAdded)
        {System.out.println("food item not added");}
    }

    public void open()
    {
        for (FoodItem foodItem:vegetableDrawer)
        {
            foodItem.print();
        }
        for(FoodItem foodItem:refrigeratorSpace)
        {
            foodItem.print();
        }
    }

    public void getDrinks()
    {
        System.out.println("Drinks:");
        for(FoodItem foodItem:refrigeratorSpace)
        {
            if(foodItem.getTypeOfFood().equals("drink"))
            {
                foodItem.print();
            }
        }
    }



}
