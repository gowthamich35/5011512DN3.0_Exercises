package product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystem {
    private Map<Integer, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product " + product.getProductName() + " added.");
        }
    }

    public void updateProduct(int productId, String productName, Integer quantity, Double price) {
        if (inventory.containsKey(productId)) {
            Product product = inventory.get(productId);
            if (productName != null) {
                product.setProductName(productName);
            }
            if (quantity != null) {
                product.setQuantity(quantity);
            }
            if (price != null) {
                product.setPrice(price);
            }
            System.out.println("Product " + productId + " updated.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product " + productId + " deleted.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Product ID:");
                    int addId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter Product Name:");
                    String addName = scanner.nextLine();
                    System.out.println("Enter Quantity:");
                    int addQuantity = scanner.nextInt();
                    System.out.println("Enter Price:");
                    double addPrice = scanner.nextDouble();
                    Product newProduct = new Product(addId, addName, addQuantity, addPrice);
                    ims.addProduct(newProduct);
                    break;

                case 2:
                    System.out.println("Enter Product ID to update:");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter new Product Name (or leave blank to keep current):");
                    String updateName = scanner.nextLine();
                    System.out.println("Enter new Quantity (or leave blank to keep current):");
                    String quantityStr = scanner.nextLine();
                    System.out.println("Enter new Price (or leave blank to keep current):");
                    String priceStr = scanner.nextLine();
                    Integer updateQuantity = quantityStr.isEmpty() ? null : Integer.parseInt(quantityStr);
                    Double updatePrice = priceStr.isEmpty() ? null : Double.parseDouble(priceStr);
                    ims.updateProduct(updateId, updateName.isEmpty() ? null : updateName, updateQuantity, updatePrice);
                    break;

                case 3:
                    System.out.println("Enter Product ID to delete:");
                    int deleteId = scanner.nextInt();
                    ims.deleteProduct(deleteId);
                    break;

                case 4:
                    ims.displayInventory();
                    break;

                case 5:
                    exit = true;
                    System.out.println("Buh Bye");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
