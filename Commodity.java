public class Commodity {

    private int id;
    private String productCode;
    private String name;
    private double wholesalePrice;
    private double retailPrice;
    private String description;

    public Commodity() {
        this.id = 0;
        this.productCode = "";
        this.name = "";
        this.wholesalePrice = 0.0;
        this.retailPrice = 0.0;
        this.description = "";
    }

    public Commodity(int id, String productCode, String name,
                     double wholesalePrice, double retailPrice, String description) {
        this.id = id;
        this.productCode = productCode;
        this.name = name;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", wholesalePrice=" + wholesalePrice +
                ", retailPrice=" + retailPrice +
                ", description='" + description + '\'' +
                '}';
    }

}
