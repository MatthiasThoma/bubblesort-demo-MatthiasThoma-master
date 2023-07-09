import java.util.Comparator;

public class CartUsernameComparator implements Comparator<Cart> {

    @Override
    public int compare(Cart cart, Cart other) {
        return cart.getName().compareTo(other.getName());
    }
}
