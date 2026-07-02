import java.util.Arrays;
import java.util.Scanner;

class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }

    public String toString() {
        return productId + " - " + productName + " (" + category + ")";
    }
}

public class EcommerceSearch {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(105, "Laptop", "Electronics"),
            new Product(101, "Shirt", "Clothing"),
            new Product(110, "Shoes", "Footwear"),
            new Product(108, "Book", "Education"),
            new Product(102, "Mobile", "Electronics")
        };

        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID to search: ");
        int targetId = sc.nextInt();

        System.out.println("\n--- Linear Search ---");
        Product linearResult = linearSearch(products, targetId);

        if (linearResult != null) {
            System.out.println("Product found: " + linearResult);
        } else {
            System.out.println("Product not found");
        }

        System.out.println("\n--- Binary Search ---");
        Product binaryResult = binarySearch(sortedProducts, targetId);

        if (binaryResult != null) {
            System.out.println("Product found: " + binaryResult);
        } else {
            System.out.println("Product not found");
        }

        System.out.println("\nTime Complexity Comparison:");
        System.out.println("Linear Search -> O(n)");
        System.out.println("Binary Search -> O(log n) [requires sorted data]");

        System.out.println("\nBinary Search is more suitable for large e-commerce platforms because it provides faster searching with O(log n) time complexity.");
        
        sc.close();
    }
}