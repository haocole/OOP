package ARRAY;

import java.util.Scanner;

public class BaiTapMang {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/// 1. Nhập số lượng phần tử (Dùng mẹo ép kiểu để tránh nuốt dòng sau này)
        System.out.print("Nhap so luong phan tu n: ");
        int n = Integer.parseInt(sc.nextLine());

        // 2. Khai báo mảng
        int[] a = new int[n];

// 3. Vòng lặp nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = Integer.parseInt(sc.nextLine());
        }

        // 4. TƯ DUY LẤY GỐC: Tìm số chẵn CUỐI CÙNG
        // Thay vì duyệt từ đầu (0 -> n-1), ta duyệt NGƯỢC từ cuối về đầu (n-1 -> 0)
        // Gặp số chẵn đầu tiên khi duyệt ngược chính là số chẵn cuối cùng của mảng!
        
        int ketQua = -1; // Mặc định là -1 nếu không tìm thấy
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                ketQua = a[i];
                break; // Tìm thấy rồi thì "thoát" luôn, không chạy tiếp nữa
            }
        }

        // 5. Xuất kết quả
        System.out.println("So chan cuoi cung la: " + ketQua);
    }
    

    
}
