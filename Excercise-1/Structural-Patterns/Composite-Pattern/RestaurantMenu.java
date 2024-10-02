import java.util.ArrayList;
import java.util.List;

// MenuComponent interface
interface MenuComponent {
    void printDetails();
}

// Dish class representing individual menu items
class Dish implements MenuComponent {
    private String name;
    private double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void printDetails() {
        System.out.println(name + ": $" + price);
    }
}

// Meal class representing a combination of dishes
class Meal implements MenuComponent {
    private String name;
    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Meal(String name) {
        this.name = name;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void printDetails() {
        System.out.println(name + ":");
        for (MenuComponent component : menuComponents) {
            component.printDetails();
        }
    }
}
