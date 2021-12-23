public class TestStore {
    public static void main( String[] args ) {
        Catalog c = new Catalog();
        ShoppingCart shoppingCart1 = new ShoppingCart(c);
        shoppingCart1.addCopies(2, "Divina Comedia");
        String s = shoppingCart1.checkout();
        System.out.println(s);
    }
}