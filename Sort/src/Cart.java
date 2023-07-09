import java.util.Objects;

public class Cart{

    private String name;
    private int numbersOfItems;
    private int totalItems;
    private double price;

    public Cart(String name, int numbersOfItems, int totalItems, double price) {
        this.name = name;
        this.numbersOfItems = numbersOfItems;
        this.totalItems = totalItems;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getNumbersOfItems() {
        return numbersOfItems;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return numbersOfItems == cart.numbersOfItems && totalItems == cart.totalItems && Double.compare(cart.price, price) == 0 && Objects.equals(name, cart.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbersOfItems, totalItems, price);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "name='" + name + '\'' +
                ", numbersOfItems=" + numbersOfItems +
                ", totalItems=" + totalItems +
                ", price=" + price +
                '}';
    }
}
