public class Main {
    public static void main(String[] args) {

        // METHOD OVERLOADING ........ //
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella");
        Pizza pizza = new Pizza("thicc crust", "tomato");
        Pizza pizza = new Pizza("thicc crust");
        Pizza pizza = new Pizza();
        
        System.out.println("Here are your pizza ingredients: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);


        // ARRAY OF OBJECTS ........... //
        Food[] refrigerator = new Food[3];
        
        Food food1 = new Food("Rice");
        Food food2 = new Food("Banku");
        Food food3 = new Food("Fufu");
        
        Food[] refrigerator = {food1, food2, food3};
        
        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;
        
        for (int i = 0; i < refrigerator.length; i++) {
              System.out.println(refrigerator[i].name);
        } 

        // PASS OBJECT TO ANOTHER OBJECT
        Car car = new Car("BMW");
        Garage garage = new Garage();
        
        garage.park(car);
        
    }
}

