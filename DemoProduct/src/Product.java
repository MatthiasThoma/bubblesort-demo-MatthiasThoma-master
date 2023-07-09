import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private String ProductName;
    private Double price;
    private String ProductCatergory;

    public Product(String productName, Double price, String productCatergory) {
        ProductName = productName;
        this.price = price;
        ProductCatergory = productCatergory;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductCatergory() {
        return ProductCatergory;
    }

    public void setProductCatergory(String productCatergory) {
        ProductCatergory = productCatergory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(ProductName, product.ProductName) && Objects.equals(price, product.price) && Objects.equals(ProductCatergory, product.ProductCatergory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ProductName, price, ProductCatergory);
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductName='" + ProductName + '\'' +
                ", price=" + price +
                ", ProductCatergory='" + ProductCatergory + '\'' +
                '}';
    }
}
