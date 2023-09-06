public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("fabio", "caffe", 500L, 20);
        products[1] = new Product("gigi", "gas", 600L, 21);
        products[2] = new Product("gianni", "boh", 700L, 22);

        printNameLastLetter(products);

        for (Product product : products) {
            if (product.getQuantity() > 5 ) {
                System.out.println(product.getQuantity());
            }
        }
    }

    static void printNameLastLetter(Product[] products) {
        for (Product product : products) {
            String name = product.getName();
            System.out.println(name.charAt(name.length() - 1));
        }

    }
}
