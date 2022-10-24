public class ProductMain {

    public static void main(String[] args) {
       Product p1 = new Product("SuperPuffs", 5.99);
       Product p2 = new Product("SourKeys", 2.78);
       System.out.println("The price of product 1 is  $" + p1.price);
       System.out.println("The price of keys is $" + p2.price);
    }
    
}
