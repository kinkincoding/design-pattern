package collection;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public Object next() {
        position++;
        return menuItems.get(position - 1);
    }

    @Override
    public void remove() {
        if(position > 0) menuItems.remove(position - 1);
    }
}
