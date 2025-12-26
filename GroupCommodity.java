public class GroupCommodity {

    private int gId;
    private Commodity[] comArr;
    private int comCount;

    public GroupCommodity() {
        gId = 0;
        comArr = new Commodity[20];
        comCount = 0;
    }

    public GroupCommodity(Commodity[] comArr) {
        gId = 1;
        this.comArr = comArr;
        comCount = comArr.length;
    }

    public int getGId() {
        return gId;
    }

    public void setGId(int gId) {
        this.gId = gId;
    }

    public Commodity[] getComArr() {
        return comArr;
    }

    public void setComArr(Commodity[] comArr) {
        this.comArr = comArr;
        comCount = comArr.length;
    }

    public Commodity getCommodity(int index) {
        if (index >= 0 && index < comCount) {
            return comArr[index];
        }
        return null;
    }

    public void setCommodity(int index, Commodity com) {
        if (index >= 0 && index < comCount) {
            comArr[index] = com;
        }
    }

    public void addCommodity(Commodity com) {
        if (comCount < comArr.length) {
            comArr[comCount] = com;
            comCount++;
            System.out.println("Added: " + com.getName());
        } else {
            System.out.println("Full");
        }
    }

    public void removeCommodityById(int id) {
        for (int i = 0; i < comCount; i++) {
            if (comArr[i].getId() == id) {
                for (int j = i; j < comCount - 1; j++) {
                    comArr[j] = comArr[j + 1];
                }
                comCount--;
                System.out.println("Removed id " + id);
                return;
            }
        }
        System.out.println("Not found id " + id);
    }

    public void sortByPrice() {
        for (int i = 0; i < comCount - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < comCount; j++) {
                if (comArr[j].getRetailPrice() < comArr[minIdx].getRetailPrice()) {
                    minIdx = j;
                }
            }
            Commodity temp = comArr[i];
            comArr[i] = comArr[minIdx];
            comArr[minIdx] = temp;
        }
    }

    public void printAll() {
        System.out.println("Group id: " + gId);
        for (int i = 0; i < comCount; i++) {
            System.out.println(comArr[i]);
        }
    }

}
