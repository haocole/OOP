package ARRAY;

import java.util.Scanner;

public class TbcViTriLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = Integer.parseInt(sc.nextLine());
        }

        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) { // Nếu VỊ TRÍ là số lẻ
                sum += a[i];
                count++;
            }
        }

        if (count > 0) {
            System.out.println("TBC vi tri le: " + (sum / count));
        } else {
            System.out.println("Mang khong du phan tu de co vi tri le.");
        }
        sc.close();
    }
    
}
