public class lab3z1and2 {

    public static void main(String[] args) {

        Commodity com1 = new Commodity(1, "LAP01", "Laptop", 500.0, 800.0, "Gaming");
        Commodity com2 = new Commodity(2, "MOU01", "Mouse", 5.0, 15.0, "Wireless");
        Commodity com3 = new Commodity(3, "KEY01", "Keyboard", 20.0, 50.0, "With 2 buttons");
        Commodity com4 = new Commodity(4, "MON01", "Monitor", 150.0, 300.0, "27 diag");

        GroupCommodity grp = new GroupCommodity();
        grp.setGId(1);

        grp.addCommodity(com1);
        grp.addCommodity(com2);
        grp.addCommodity(com3);
        grp.addCommodity(com4);

        System.out.println("Before sort:");
        grp.printAll();

        grp.sortByPrice();

        System.out.println("After sort:");
        grp.printAll();

        grp.removeCommodityById(2);

        System.out.println("After remove:");
        grp.printAll();

    }

}
