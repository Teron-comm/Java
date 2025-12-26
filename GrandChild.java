public class GrandChild extends Child {

    private String grandChildString;

    public GrandChild() {
        super();
        grandChildString = "";
    }

    public GrandChild(int id, String nm, String sch, String grandChildString) {
        super(id, nm, sch);
        this.grandChildString = grandChildString;
    }

    public String getGrandChildString() {
        return grandChildString;
    }

    public void setGrandChildString(String grandChildString) {
        this.grandChildString = grandChildString;
    }

    public void display() {
        System.out.println("This is grandchild");
    }

    public String toString() {
        return "GrandChild " + getId() + " " + getName() + " " + getSchool() + " " + grandChildString;
    }

}
