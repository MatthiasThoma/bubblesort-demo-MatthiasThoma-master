import java.util.ArrayList;
import java.util.Collections;

public class CartSortDemo {

    public static void main(String[] args) {

        ArrayList<Cart> carts = new ArrayList<>();

        carts.add(new Cart ("Matthias", 4, 10, 125.9));
        carts.add(new Cart ("Tobias", 8, 11, 25.9));
        carts.add(new Cart ("Adolf", 5, 1, 225.8));
        carts.add(new Cart ("Peter", 9, 14, 125.8));
        carts.add(new Cart ("Lukas", 3, 17, 17.00));

        Collections.sort(carts);



        //Collections.sort(carts, new CartUsernameComparator);

        carts.sort(CartUsernameComparator);

        System.out.println(carts);

    }

}
