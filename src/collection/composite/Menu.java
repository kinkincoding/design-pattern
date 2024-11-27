package collection.composite;

import collection.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    String name;
    String description;
    ArrayList menuComponents = new ArrayList();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", menuComponents=" + menuComponents +
                '}';
    }

    public void print() {
        System.out.println("-----------------");
        System.out.println("name='" + name);
        System.out.println("description='" + description);
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
        System.out.println("-----------------");
    }

    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
