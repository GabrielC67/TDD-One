package rocks.zipcode;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class

class ShoppingCartTest {
    // TODO: Write tests for the ShoppingCart class
    // Make sure to test all functionality including:
    // - Adding and removing items
    // - Calculating subtotal, tax, and total
    // - Edge cases like an empty cart
    // - Invalid inputs (e.g., negative prices, zero quantity)

    private ShoppingCart cart;
    private ShoppingCart.Item item1;
    private ShoppingCart.Item item2;

    @BeforeEach
    void setup(){
        cart = new ShoppingCart(6.00);
        item1 = new ShoppingCart.Item("Pork Chops - 8 pack", 11.49, 2);
        item2 = new ShoppingCart.Item("Kelloggs - Corn Flakes - 10oz", 3.99, 1);
    }

    @Test
    public void testAddItem1(){
        cart.addItem(item1); //--> item1 gets added to List<Item> items
        assertEquals(1, cart.getItemCount());
        assertEquals(item1, cart.getItem(0));
    }

    @Test
    public void testAddItem2(){
        cart.clearCart(); // Clears items from any tests
        cart.addItem(item2); //--> item2 now gets added to the cart
        assertEquals(1, cart.getItemCount());
        assertEquals(item2, cart.getItem(0));
    }

    @Test
    void testAddMultipleItemsToCart(){
        cart.clearCart(); // Clears items from any tests
        cart.addItem(item1);
        cart.addItem(item2);
        assertEquals(2, cart.getItemCount());
        assertEquals(item1, cart.getItem(0));
        assertEquals(item2, cart.getItem(1));
    }

    @Test
    public void removeItemTest(){
        cart.addItem(item1);
        cart.addItem(item2);
        cart.removeItem(item1);
        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void removeAllItemsTest(){
        cart.addItem(item1);
        cart.addItem(item2);
        ShoppingCart.Item item3 = new ShoppingCart.Item("Milk", 4.49, 1);
        ShoppingCart.Item item4 = new ShoppingCart.Item("Eggs", 6.49, 1);
        cart.addItem(item3);
        cart.addItem(item4);

        cart.clearCart();

        assertEquals(0, cart.getItemCount());
    }

    @Test
    public void testCalculateSubtotal(){
        cart.addItem(item1);
        cart.addItem(item2);
        double sum = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());

        double subtotal = cart.getSubtotal();

        assertEquals(sum, subtotal);
    }

    @Test
    public void calculateTaxTest(){
        cart.addItem(item1);
        cart.addItem(item2);
        double subtotal = cart.getSubtotal();

        assertEquals(subtotal * 6.00 ,cart.getTaxAmount());
    }

    @Test
    public void getTotalTest(){
        cart.addItem(item1);
        cart.addItem(item2);
        double total = cart.getSubtotal() + cart.getTaxAmount();

        assertEquals(total , cart.getTotal());
    }
}
