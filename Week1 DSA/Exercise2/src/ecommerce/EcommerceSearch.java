package ecommerce;


public class EcommerceSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Book", "Books"),
            new Product(4, "Headphones", "Electronics"),
            new Product(5, "Shoes", "Fashion")
        };

        // Linear Search
        Product result1 = SearchAlgo.linearSearch(products, "Book");
        System.out.println(result1 != null ? result1 : "Product not found");
        Product result2 = SearchAlgo.linearSearch(products, "pen");
        System.out.println(result2 != null ? result2 : "Product not found");

        // Binary Search
        Product resultB1 = SearchAlgo.binarySearch(products, "Book");
        System.out.println(resultB1 != null ? resultB1 : "Product not found");
        Product resultB2 = SearchAlgo.binarySearch(products, "Table");
        System.out.println(resultB2 != null ? resultB2 : "Product not found");
    }
}
