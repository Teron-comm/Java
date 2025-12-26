public class Child extends Parent {

    private String school;

    public Child() {
        super();
        school = "";
    }

    public Child(int id, String name, String school) {
        super(id, name);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void display() {
        System.out.println("This is child");
    }

    public String toString() {
        return "Child " + getId() + " " + getName() + " " + school;
    }

}
