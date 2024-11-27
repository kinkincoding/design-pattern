package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu extends Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("name1", "description1", false, 1);
        addItem("name2", "description2", true, 2);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        // return new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();
    }
}
