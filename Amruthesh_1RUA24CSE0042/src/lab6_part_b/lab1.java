package lab6_part_b;

import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows in the triangle: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
