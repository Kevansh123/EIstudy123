public class Main {
    public static void main(String[] args) {
        // Create individual dishes
        Dish dish1 = new Dish("Spaghetti", 12.99);
        Dish dish2 = new Dish("Grilled Chicken", 15.99);
        Dish dish3 = new Dish("Caesar Salad", 10.49);

        // Create a meal that consists of multiple dishes
        Meal dinner = new Meal("Dinner");
        dinner.add(dish1);
        dinner.add(dish2);
        dinner.add(dish3);

        // Create another meal
        Meal lunch = new Meal("Lunch");
        lunch.add(new Dish("Club Sandwich", 9.99));
        lunch.add(new Dish("French Fries", 3.99));

        // Print details of the meals
        System.out.println("Menu:");
        dinner.printDetails();
        System.out.println();
        lunch.printDetails();
    }
}
