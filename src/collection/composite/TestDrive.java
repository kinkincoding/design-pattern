package collection.composite;

public class TestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("pancakeHouseMenu", "breakfast");
        MenuComponent dinerMenu = new Menu("dinerMenu", "lunch");
        MenuComponent cafeMenu = new Menu("cafeMenu", "dinner");

        MenuComponent allMenus = new Menu("allMenus", "all menus");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("name1", "description1", false, 1));
        pancakeHouseMenu.add(new MenuItem("name2", "description2", true, 2));

        dinerMenu.add(new MenuItem("name3", "description3", false, 1));
        dinerMenu.add(new MenuItem("name4", "description4", true, 2));

        cafeMenu.add(new MenuItem("name5", "description5", false, 1));
        cafeMenu.add(new MenuItem("name6", "description6", true, 2));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
