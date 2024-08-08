package order;

public class OrderSorting {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.50),
            new Order(2, "Bob", 150.75),
            new Order(3, "Charlie", 300.20),
            new Order(4, "David", 50.00),
            new Order(5, "Eve", 400.00)
        };

        // Bubble Sort
        System.out.println("Orders sorted by Bubble Sort:");
        SortingAlgorithms.bubbleSort(orders);
        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        Order[] ordersForQuickSort = {
            new Order(1, "Alice", 250.50),
            new Order(2, "Bob", 150.75),
            new Order(3, "Charlie", 300.20),
            new Order(4, "David", 50.00),
            new Order(5, "Eve", 400.00)
        };

        System.out.println("\nOrders sorted by Quick Sort:");
        SortingAlgorithms.quickSort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }
    }
}
