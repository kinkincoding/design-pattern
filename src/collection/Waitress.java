package collection;

import java.util.ArrayList;
import java.util.Objects;

public class Waitress {
    ArrayList menus;


    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu() {
        java.util.Iterator iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu menu = (Menu) iterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(java.util.Iterator iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
