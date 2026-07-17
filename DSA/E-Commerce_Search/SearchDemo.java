public class SearchDemo {

    static class Product {
        int productId;
        String productName;
        String category;
        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }
    }

    public static Product linearSearch(Product[] products, int id) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == id) {
                return products[i];
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int id) {

        int first = 0;
        int last = products.length - 1;

        while (first <= last) {

            int mid = (first + last) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            }

            if (id > products[mid].productId) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = new Product[5];

        products[0] = new Product(101, "Laptop", "Electronics");
        products[1] = new Product(102, "Phone", "Electronics");
        products[2] = new Product(103, "Shoes", "Fashion");
        products[3] = new Product(104, "Watch", "Accessories");
        products[4] = new Product(105, "Book", "Education");

        int searchId = 104;

        System.out.println("Linear Search");

        Product p = linearSearch(products, searchId);

        if (p != null) {
            System.out.println("Product Found");
            System.out.println("ID : " + p.productId);
            System.out.println("Name : " + p.productName);
            System.out.println("Category : " + p.category);
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println();

        System.out.println("Binary Search");

        p = binarySearch(products, searchId);

        if (p != null) {
            System.out.println("Product Found");
            System.out.println("ID : " + p.productId);
            System.out.println("Name : " + p.productName);
            System.out.println("Category : " + p.category);
        } else {
            System.out.println("Product Not Found");
        }
    }
}