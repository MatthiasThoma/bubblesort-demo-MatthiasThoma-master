import java.util.Comparator;

class CartTotalItemsComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart cart, Cart other) {
        return Integer.compare(other.getTotalItems(), cart.getTotalItems());
    }
}
