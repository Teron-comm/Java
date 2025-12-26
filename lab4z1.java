public class lab4z1 {

    public static void main(String[] args) {

        Family fam = new Family();

        Parent p1 = new Parent(1, "Ivan");
        Child c1 = new Child(2, "Lesha", "School1");
        GrandChild gc1 = new GrandChild(3, "Misha", "School1", "GCS1");
        Parent p2 = new Parent(4, "Maria");
        Child c2 = new Child(5, "Olga", "School2");
        GrandChild gc2 = new GrandChild(6, "Katya", "School2", "GCS2");

        fam.addPerson(p1);
        fam.addPerson(c1);
        fam.addPerson(gc1);
        fam.addPerson(p2);
        fam.addPerson(c2);
        fam.addPerson(gc2);
        fam.printAll();

        System.out.println("count parent " + fam.cntParent());
        System.out.println("count child " + fam.cntChild());
        System.out.println("count grand " + fam.cntGrand());

        System.out.println("get person 2");
        System.out.println(fam.getPerson(2));
        fam.removePerson(1);
        System.out.println();
        System.out.println("After remove");
        fam.printAll();

        System.out.println("count parent " + fam.cntParent());
        System.out.println("count child " + fam.cntChild());
        System.out.println("count grand " + fam.cntGrand());

    }

}
