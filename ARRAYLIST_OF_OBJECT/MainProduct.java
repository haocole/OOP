package ARRAYLIST_OF_OBJECT;

import java.util.ArrayList;

public class MainProduct {
     public static void main(String[] args) {

        // Tạo ArrayList
        ArrayList<Product> list = new ArrayList<>();

        // Thêm sản phẩm
        list.add(new Product(1, "Laptop", 1500));
        list.add(new Product(2, "Phone", 800));
        list.add(new Product(3, "Tablet", 600));

        // Hiển thị danh sách
        System.out.println("Danh sach san pham:");
        for (Product p : list) {
            p.display();
        }
    }
}
