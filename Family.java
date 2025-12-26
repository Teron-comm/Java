public class Family {

    private Parent[] parArr;
    private int calcNum;

    public Family() {
        parArr = new Parent[20];
        calcNum = 0;
    }

    public void addPerson(Parent p) {
        if (calcNum < parArr.length) {
            parArr[calcNum] = p;
            calcNum++;
        } else {
            System.out.println("Array is full! Cannot add");
        }

    }

    public void removePerson(int idx) {
        if (idx >= 0 && idx < calcNum) {
            for (int i = idx; i < calcNum - 1; i++) {
                parArr[i] = parArr[i + 1];
            }
            calcNum--;
        } else {
            System.out.println("Invalid idx! Can't remove");
        }
    }

    public Parent getPerson(int idx) {
        return parArr[idx];
    }

    public int cntParent() {
        int res = 0;
        for (int i = 0; i < calcNum; i++) {
            if (parArr[i].getClass().getName() == "Parent") {
                res++;
            }
        }
        return res;
    }

    public int cntChild() {
        int res = 0;
        for (int i = 0; i < calcNum; i++) {
            if (parArr[i].getClass().getName() == "Child") {
                res++;
            }
        }
        return res;
    }

    public int cntGrand() {
        int res = 0;
        for (int i = 0; i < calcNum; i++) {
            if (parArr[i].getClass().getName() == "GrandChild") {
                res++;
            }
        }
        return res;
    }

    public void printAll() {
        System.out.println("Family persons:");
        for (int i = 0; i < calcNum; i++) {
            parArr[i].display();
            System.out.println(parArr[i]);
        }
    }

}
